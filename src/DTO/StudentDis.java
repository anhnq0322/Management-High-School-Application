/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author M S I
 */
public class StudentDis {
    private String studentID;
    private String studentName;
    private Float Score;

    public StudentDis() {
    }

    public StudentDis(String studentID, String studentName,Float Score) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.Score = Score;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public float getScore() {
        return Score;
    }

    public void setScore(float Score) {
        this.Score = Score;
    }
    
    
}
