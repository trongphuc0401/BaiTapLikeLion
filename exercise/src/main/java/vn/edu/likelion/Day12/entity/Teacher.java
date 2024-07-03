package vn.edu.likelion.Day12.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Teacher -
 *
 * @param
 * @return
 * @throws
 */
public class Teacher {

    private String teacherId;
    private String name;
    private List<ClassRoom> classes;
    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
        this.classes = new ArrayList<>();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassRoom> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassRoom> classes) {
        this.classes = classes;
    }

    public void addClass(ClassRoom classRoom) {
        if (classes.size() < 2) {
            classes.add(classRoom);
        }else {
            System.out.println("The teacher not permit register 2 class");
        }
    }

    public List<Student> getAllStudents() {
        List<Student> allStudent = new ArrayList<>();
        for (ClassRoom classRoom : classes) {
            allStudent.addAll(classRoom.getStudents());
        }
        return allStudent;
    }


}
