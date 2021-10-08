/*
Name:Amit Paul
Id:2012020164
Section:D
Email:cse_2012020164@lus.ac.bd
Date:6-8-21
*/
package amitpaul;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student.universityName="Leading University";
   
        Student student2 = new Student("Amit Paul");
        Student student3 = new Student ("Amit paul",164);
        student1.display();
        
    }
    
}
