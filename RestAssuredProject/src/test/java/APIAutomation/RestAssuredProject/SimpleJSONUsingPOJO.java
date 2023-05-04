package APIAutomation.RestAssuredProject;

public class SimpleJSONUsingPOJO {
	
	private String firstName;
	private String lastName;
	private String mobile;
	private String address;
	private ComplexJSONUsingPOJO addresstype;
	private ArrayJSONUsingPOJO[] arrayJSONUsingPOJO;
	
	public ArrayJSONUsingPOJO[] getArrayJSONUsingPOJO() {
		return arrayJSONUsingPOJO;
	}
	public void setArrayJSONUsingPOJO(ArrayJSONUsingPOJO[] arrayJSONUsingPOJO) {
		this.arrayJSONUsingPOJO = arrayJSONUsingPOJO;
	}
	
	public ComplexJSONUsingPOJO getAddresstype() {
		return addresstype;
	}
	public void setAddresstype(ComplexJSONUsingPOJO addresstype) {
		this.addresstype = addresstype;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
