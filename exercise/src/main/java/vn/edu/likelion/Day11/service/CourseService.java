package vn.edu.likelion.Day11.service;

import vn.edu.likelion.Day11.entity.Course;


import java.util.logging.Logger;

/**
 * CourseService -
 *
 * @param
 * @return
 * @throws
 */
public class CourseService implements CourseImpl{

    Logger logger  = Logger.getLogger(getClass().getName());

    /**
     * displayDetailCourse sẽ là một method chung để hiển thị chi tiết thuộc tính khóa học của 2 class <p>
     * {@code Course} và {@code CourseApp}
     */
    public void displayDetailCourse(Course course) {
        System.out.println("ID: "+course.getCourseId());
        System.out.println("Course Name: "+course.getCourseName());
        System.out.println("Mentor Name: "+course.getMentorName());
        System.out.println("Credit: "+course.getCredit());
    }
    
}
