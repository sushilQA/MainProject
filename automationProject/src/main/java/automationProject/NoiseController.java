package automationProject;

import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

public class NoiseController extends Thread {
	private TargetDataLine line;
	private AudioInputStream audioInputStream;

	public NoiseController(TargetDataLine line) {
		this.line = line;
		this.audioInputStream = new AudioInputStream(line);
	}

	public void start() {
		line.start();
		super.start();
	}

	public void stopRecording() {
		line.stop();
		line.close();
	}

	public void run() {
		try {
			int packet;
			while ((packet = audioInputStream.read()) != -1)
				System.out.println(packet);
		} catch (IOException ioe) {
			ioe.getStackTrace();
		}
	}

	public static void main(String[] args) {
		AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100.0F, 16, 2, 4, 44100.0F, false);
		DataLine.Info info = new DataLine.Info(TargetDataLine.class, audioFormat);
		TargetDataLine targetDataLine = null;

		try {
			targetDataLine = (TargetDataLine) AudioSystem.getLine(info);
			targetDataLine.open(audioFormat);
		} catch (LineUnavailableException lue) {
			out("unable to get a recording line");
			lue.printStackTrace();
			System.exit(-1);
		}

		AudioFileFormat.Type targetType = AudioFileFormat.Type.WAVE;
		NoiseController recorder = new NoiseController(targetDataLine);
		System.out.println(targetDataLine);
		System.out.println(targetType);

		out("Press ENTER to start the recording.");

		try {
			System.in.read();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		recorder.start();
		out("Recording...");
		out("Press ENTER to stop the recording.");

		try {
			System.in.read();
			System.in.read();
		} catch (IOException ioe) {
			ioe.getStackTrace();
		}

		recorder.stopRecording();
		out("Recording stopped.");
	}

	private static void out(String msg) {
		System.out.println(msg);
	}
}