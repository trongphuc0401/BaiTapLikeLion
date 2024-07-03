package vn.edu.likelion.Day11.service;

import vn.edu.likelion.Day11.entity.Course;
import vn.edu.likelion.Day11.entity.CourseOnline;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CourseOnlineService -
 *
 * @param
 * @return
 * @throws
 */
public class CourseOnlineService implements CourseImpl{
   public static Logger logger  = Logger.getLogger(CourseOnlineService.class.getName());

    @Override
    public void displayDetailCourse(Course course) {

    }

    @Override
    public void displayDetailCourse(CourseOnline courseOnline) {
        System.out.println("ID: "+courseOnline.getCourseId());
        System.out.println("Course Name: "+courseOnline.getCourseName());
        System.out.println("Mentor Name: "+courseOnline.getMentorName());
        System.out.println("Credit: "+courseOnline.getCredit());
        CourseImpl.super.displayDetailCourse(courseOnline);
    }
}
