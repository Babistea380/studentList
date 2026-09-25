/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<>();
        
        sList.add(I am a bug new Student(334809290, "Adam B", 87));
        sList.add(new Student(234832943, "John Student", 97));
        sList.add(new Student(859489370, "Ethan B", 74));
      
        System.out.println(sList.get(0).getSName() + "\nID: " + 
            sList.get(1).getSID() + "\nGrade: " + 
            sList.get(2).getGrade() + "\n");
        
        // This is a change to the source code
    }
}
