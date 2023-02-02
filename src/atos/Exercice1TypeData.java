package atos;

public class Exercice1TypeData {
	
	 int age;
	 double weight;
	 boolean isStudent;
	 char gender;
	 String name;
	  
	  public Exercice1TypeData(int age, double weight, boolean isStudent, char gender, String name) {
	    this.age = age;
	    this.weight = weight;
	    this.isStudent = isStudent;
	    this.gender = gender;
	    this.name = name;
	  }
	  
	  public void displayInfo() {
	    System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Weight: " + weight + ", IsStudent: " + isStudent);
	  }

	public static void main(String[] args) {
		
		Exercice1TypeData info = new Exercice1TypeData(25, 43.0, false, 'F', "N'GUESSAN Marina ");
        
        info.displayInfo();


	}

}
