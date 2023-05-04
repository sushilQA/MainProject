package automationProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileClass {
	int count = 0;

	public void writeAFile() throws IOException {
		File f = new File("../automationProject/Auto.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("THIS IS FIRST LINE OF THE CODE");
		bw.newLine();
		bw.write("THIS IS FIRST LINE OF THE CODE");
		bw.close();
	}

	public void copyPaste() throws IOException {
		File f1 = new File("../automationProject/Auto.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		File f2 = new File("../automationProject/Auto2.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		String sourceData = null;
		while ((sourceData = br.readLine()) != null) {
			bw.write(sourceData);
			bw.newLine();
		}
		br.close();
		bw.close();
		System.out.println("Copied Success!");

	}

	public void readDataInRange(int start, int end) throws IOException {
		File f = new File("../automationProject/Auto.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			count++;
			if (count >= start && count <= end) {
				System.out.println(str);
			}
		}
		br.close();
	}

	public void readDataFromParticularRow(int rowNumner) throws IOException {
		File f = new File("../automationProject/Auto.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			count++;
			if (count == rowNumner) {
				System.out.println(str);
				break;
			}
		}
		br.close();
	}

	public void readAFile() throws IOException {
		File f = new File("../automationProject/Auto.txt");
		FileReader fr = new FileReader(f);
		int a;
		while ((a = fr.read()) != -1) {
			System.out.print((char) a);
		}
		fr.close();

	}

	public void readAFileLineByLine() throws IOException {
		File f = new File("../automationProject/Auto.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);

		}
		br.close();
	}

}
