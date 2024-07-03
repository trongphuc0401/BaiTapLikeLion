package vn.edu.likelion.Day11.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Course -
 *
 * @param
 * @return
 * @throws
 */
public class Course {

    private int courseId;
    private String courseName;
    private String mentorName;
    private int credit;
    private List<Student> students;

    public Course(){
        this.courseId = 0;
        this.courseName = "";
        this.mentorName = "";
        this.credit = 0;
        this.students = new ArrayList<>();
    }

    public Course(int courseId, String courseName, String mentorName, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.mentorName = mentorName;
        this.credit = credit;
        this.students = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", mentorName='" + mentorName + '\'' +
                ", credit=" + credit +
                ", students=" + students +
                '}';
    }
}
