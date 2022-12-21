//Hasan Pekedis 150120068


import java.util.Calendar;

public class Person {
     private  int id;
     private String firstName;
     private String lastName;
     private byte gender;
     private Calendar birthDate;
     private byte maritalStatus;
     private boolean hasDriverLicence;
    public Person(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, String hasDriverLicence) throws Exception {
    	setId(id);
    	setFirstName(firstName);
        setLastName(lastName);
    	setBirthDate(birthDate);
    	setHasDriverLicence(hasDriverLicence);
    	setGender(gender);
    	setMaritalStatus(maritalStatus);
    }
    public void  setGender(String gender) throws Exception {
    	if(gender.equals("Woman")) {
    		this.gender=1;
    	}
    	else if(gender.equals("Man")){
    		this.gender=2;
    	}
    	else
    		throw new Exception("Ýnvalid input");
    }
     public String getGender() {
    	 if(gender==1)
    	 return "Man" ;
    	 else
    		 return "Woman" ;
     }
     public void setMaritalStatus(String status) throws Exception {
    	 if(status.equals("Single")) {
    		 this.maritalStatus=1;
    	 }
    	 else if(status.equals("Married")) {
    		 this.maritalStatus=2;
    	 }
    	 else 
    		 throw new Exception("Ýnvalid input");
    	 
     }
     public String getMaritalStatus() {
    	 if(maritalStatus==1) {
    		 return "Single";
    	 }
    	 else  {
    		 return "Married";
    	 }
     }
     
     public void setHasDriverLicence(String info) throws Exception {
    	 if(info.equals("Yes")) {
    		 this.hasDriverLicence=true;
    	 }
    	 else if(info.equals("No")) {
    		 this.hasDriverLicence=false;
    	 }
    	 else 
    		 throw new Exception ("Ýnvalid input");
     }
     public String getHasDriverLicence() {
    	  if(hasDriverLicence==true) {
    		  return "Yes";
    	  }
    	  else  {
    		  return "No";
    	  }
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "\t\t\t\tPerson Info [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + getGender() + "]";
	}
	
}