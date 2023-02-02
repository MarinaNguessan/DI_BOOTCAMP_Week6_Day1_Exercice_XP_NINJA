package atos;

public class Exercice3Person {
	
	String name;
    int age;
    char gender;
  
    //Constructeur par défaut
    public Exercice3Person() {
        this.name = "Inconnu";
        this.age = 0;
        this.gender = 'U';
    }
  
    //Deuxième constructeur
    public Exercice3Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
  
    //Troisième constructeur
    public Exercice3Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }
  
    //Méthode displayInfo
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }

    
	public static void main(String[] args) {
		
		//Création de trois objets Person
		Exercice3Person person1 = new Exercice3Person();
		Exercice3Person person2 = new Exercice3Person("TOURE Princesse", 8, 'F');
		Exercice3Person person3 = new Exercice3Person("N'GUESSAN Marie Emmanuelle", 7);
	    
	    //Affichage des informations des trois objets
	    person1.displayInfo();
	    person2.displayInfo();
	    person3.displayInfo();

	}

}
