package vn.edu.likelion.Day11.service;

import vn.edu.likelion.Day11.entity.Course;
import vn.edu.likelion.Day11.entity.CourseOnline;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CourseImpl -
 *
 * @param
 * @return
 * @throws
 */
public interface CourseImpl {
    Logger logger = CourseOnlineService.logger;


    void displayDetailCourse(Course course);

    default void displayDetailCourse(CourseOnline courseOnline){
        System.out.println("Platform: "+courseOnline.getNentang());
        System.out.println("Duration: "+courseOnline.getThoiluong());
    }
}
