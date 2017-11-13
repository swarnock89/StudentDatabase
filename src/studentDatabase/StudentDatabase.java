package studentDatabase;

public class StudentDatabase {

	private String name;
	private String SSN;
	private String email;
	private static int iD = 100;
	private String userID;
	private String phoneNumber;
	private String city;
	private String state;
	
	public StudentDatabase(String name, String SSN, String location, String phoneNumber) {
		this.name = name;
		this.SSN = SSN;
		iD++;
		setPhoneNumber(phoneNumber);
		createEmail();
		generateUserID();
	}
	
	private void createEmail() {
		String firstName;
		String lastName;
		String[] parts = name.split(" ");
		firstName = parts[0];
		lastName = parts[1];
		email = firstName.toLowerCase() + "." + lastName.toLowerCase()  + "@gmail.com";
	}
	 
	private void generateUserID() {
		int random = (int) (Math.random() * 8000 + 1000);
		userID = iD + "" + random + SSN.substring(5, 9);
	}
	
	public void setLocation(String location) {
		String[] parts = location.split(", ");
		city = parts[0];
		state = parts[1];
		getLocation();
	}
	
	public void getLocation() {
		System.out.println("Your location is: " + city + ", " + state);
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		getPhoneNumber();
	}
	
	public void getPhoneNumber() {
		System.out.println("Your phone number is: " + phoneNumber);
	}
	
	public void studentInformation() {
		System.out.println("STUDENT INFORMATION:\n Name: " + name + "\n Email: " + email + 
				"\n Phone Number: " + phoneNumber + "\n SSN: " + SSN + "\n userID: " + userID + "\n Location: " + city + ", " + state);
	}
	
}
