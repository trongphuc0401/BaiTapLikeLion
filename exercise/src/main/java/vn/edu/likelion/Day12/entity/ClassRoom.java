package vn.edu.likelion.Day12.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassRoom -
 *
 * @param
 * @return
 * @throws
 */
public class ClassRoom {
    private String classId;
    private List<Student> students;
    private Teacher teacher;
    private LocalDateTime startDate;
    private static final int MAX_TABLE = 10;

    public ClassRoom(String classId) {
        this.classId = classId;
        this.students = new ArrayList<>();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.addClass(this);
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public boolean  addStudent(Student student) {
        if (students.size() < MAX_TABLE) {
            students.add(student);
            if (startDate != null) {
                student.setEnrollmentDate(LocalDateTime.now());
            }
            return true;
        }

        return false;
    }

    public List<Student> getActiveStudents() {
        return students.stream().filter(Student::isActive).collect(Collectors.toList());
    }

    public List<Student> getInactiveStudents() {
        return students.stream().filter(s -> !s.isActive()).collect(Collectors.toList());
    }


}
