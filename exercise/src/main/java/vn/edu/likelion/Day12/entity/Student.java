package vn.edu.likelion.Day12.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Student -
 *
 * @param
 * @return
 * @throws
 */
public class Student {
    private String studentId;
    private String name;
    private LocalDate dateOfBirth;
    private String idNumber;
    private LocalDateTime enrollmentDate;
    private boolean isActive;
    private String note;

    public Student(String studentId ,String name, LocalDate dateOfBirth, String idNumber, LocalDateTime enrollmentDate, boolean isActive, String note) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        this.enrollmentDate = enrollmentDate;
        this.isActive = isActive;
        this.note = note;
    }

    public Student() {

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDateTime enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public void leaveClass(String note) {
        this.isActive = false;
        this.note = note;
    }
}
