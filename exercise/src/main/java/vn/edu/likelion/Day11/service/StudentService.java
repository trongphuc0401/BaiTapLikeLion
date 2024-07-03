package vn.edu.likelion.Day11.service;

import vn.edu.likelion.Day11.entity.Course;
import vn.edu.likelion.Day11.entity.Student;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * StudentService -
 *
 * @param
 * @return
 * @throws
 */
public class StudentService implements StudentImpl {

    Logger logger  = Logger.getLogger(getClass().getName());

    public void displayDetailCourse(Student student) {
        System.out.println("ID: "+student.getStudentId());
        System.out.println("Student Name: "+student.getNameStudent());
        System.out.println("Age: "+student.getAge());
        System.out.println("Course: "+student.getCourses().toString());
    }
}
