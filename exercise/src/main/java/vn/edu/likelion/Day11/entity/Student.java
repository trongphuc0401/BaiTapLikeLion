package vn.edu.likelion.Day11.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Student -
 *
 * @param
 * @return
 * @throws
 */
public class Student {
    private int studentId;
    private String nameStudent;
    private int age;
    private boolean gender;
    private List<Course> courses;


    public Student(int studentId, String nameStudent, int age, boolean gender, List<Course> courses) {
        this.studentId = studentId;
        this.nameStudent = nameStudent;
        this.age = age;
        this.gender = gender;
        this.courses = courses;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", nameStudent='" + nameStudent + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", courses=" + courses +
                '}';
    }


}
