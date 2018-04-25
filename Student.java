package classOrganization;

public class Student {
	private String myFirstName;
	private String myLastName;
	private String myGender;
	private String myMiddleSchool;
	
	public Student(){
		myFirstName = "John";
		myLastName = "Doe";
		myGender = "Male";
		myMiddleSchool = "RCMS";
	}
	public Student(String first, String last, String gender, String middleSchool){
		if (gender != "Male" || gender != "Female"){
			throw new IllegalArgumentException("Gender is not correctly specified");
		}
		
		myFirstName = first;
		myLastName = last;
		myGender = gender;
		myMiddleSchool = middleSchool;
	}
	public Student(Student other){
		myFirstName = other.myFirstName;
		myLastName = other.myLastName;
		myGender = other.myGender;
		myMiddleSchool = other.myMiddleSchool;
	}
	public String getMyFirstName() {
		return myFirstName;
	}
	public void setMyFirstName(String myFirstName) {
		this.myFirstName = myFirstName;
	}
	public String getMyLastName() {
		return myLastName;
	}
	public void setMyLastName(String myLastName) {
		this.myLastName = myLastName;
	}
	public String getMyGender() {
		return myGender;
	}
	public void setMyGender(String myGender) {
		this.myGender = myGender;
	}
	public String getMyMiddleSchool() {
		return myMiddleSchool;
	}
	public void setMyMiddleSchool(String myMiddleSchool) {
		this.myMiddleSchool = myMiddleSchool;
	}
	

}
