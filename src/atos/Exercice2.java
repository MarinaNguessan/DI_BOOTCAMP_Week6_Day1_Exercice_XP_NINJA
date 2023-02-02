package atos;

public class Exercice2 {

	public static void main(String[] args) {
		 // Déclarez et initialisez les variables
        int age = 7;
        double weight = 25.5;
        char gender = 'F';
        boolean isStudent = false;
        String name = "N'GUESSAN Emmanuelle";
        
        // Afficher les valeurs des variables
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("IsStudent: " + isStudent);
        System.out.println("Name: " + name);
        
        // Modifiez les valeurs des variables
        age = 18;
        weight = 45.0;
        gender = 'F';
        isStudent = true;
        name = "N'GUESSAN Emmanuelle";
        
        // Imprimez les nouvelles valeurs des variables
        System.out.println("\nNew Values:");
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("IsStudent: " + isStudent);
        System.out.println("Name: " + name);
    
        // Conversion de type
        int weightInKg = (int) (weight / 2.2);
        System.out.println("\nWeight in kilograms: " + weightInKg + " kg");
    
        // Opération mathématique
        double sum = weight + age;
        System.out.println("\nSum of weight and age: " + sum);
    
        // Opérateur de comparaison
        if (age > 20) {
            System.out.println("\nAge is greater than 20");
        }else {
            System.out.println("\nAge is less than or equal to 20");
        }
    
        // Instruction de flux de contrôle
        switch (gender) {
        case 'F':
            System.out.println("\nGender is Male");
            break;
        case 'M':
            System.out.println("\nGender is Female");
            break;
        default:
            System.out.println("\nInvalid gender");
            break;
        }
    }

	}


