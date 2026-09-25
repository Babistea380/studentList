/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author Adam
 */
public class Student {
    
    private int sID;
    private String sName;
    private int grade;

    public Student(int sID, String sName, int grade) {
        this.sID = sID;
        this.sName = sName;
        this.grade = grade;
    }
    
    // Getters
    public int getSID() {
        return sID;
    } 
    public String getSName() {
        return sName;
    }
    public int getGrade() {
        return grade;
    }
    
    // Setters
    public void setID(int sID) {
        this.sID = sID;
    }
    public void setSName(String sName) {
        this.sName = sName;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }   
}
  
