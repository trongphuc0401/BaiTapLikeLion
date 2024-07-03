package vn.edu.likelion.Day11.app;

import vn.edu.likelion.Day11.entity.Student;
import vn.edu.likelion.Day11.entity.Course;
import vn.edu.likelion.Day11.entity.CourseOnline;
import vn.edu.likelion.Day11.service.CourseOnlineService;
import vn.edu.likelion.Day11.service.CourseService;
import vn.edu.likelion.Day11.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * CourseApp -
 *
 * @param
 * @return
 * @throws
 */
public class CourseApp {

    // danh sasch student
    static List<Student> studentList = new ArrayList<>();
    static List<Course> coursesList = new ArrayList<>();
    static List<CourseOnline> courseOnlineList = new ArrayList<>();

    // tạo instance cho mỗi service service trong 1 class.
    static StudentService studentService = new StudentService();
    static CourseService courseService = new CourseService();
    static CourseOnlineService courseOnlineService = new CourseOnlineService();

    public static void main(String[] args) {
        Student phanAn = new Student(1, "Phan Thanh An", 19, true,coursesList);
        studentList.add(phanAn);


        Course lapTrinhWeb= new Course(1,"Lập trình web","Nguyễn Anh Tuấn",12);
        coursesList.add(lapTrinhWeb);
        Course  thietKeWeb= new Course(2,"Thiết kế web","Phan Anh Tuấn",13);
        coursesList.add(thietKeWeb);
        Course cauTrucDuLieuVaGiaiThuat= new Course(3,"Cấu trúc dữ liệu và giải thuật","Trần Anh Tuấn",12);
        coursesList.add(cauTrucDuLieuVaGiaiThuat);

        CourseOnline english= new CourseOnline(1,"Eglish","Jhoe",12,"english.com",150);
        courseOnlineList.add(english);
        CourseOnline  japanese= new CourseOnline(2,"Japanese","Suki",12,"amanaki.jp",150);
        courseOnlineList.add(japanese);
        CourseOnline  korean= new CourseOnline(2,"Korean","Minho",12,"toboki.kr",150);
        courseOnlineList.add(korean);


        studentService.displayDetailCourse(phanAn);
        System.out.println("");
        courseService.displayDetailCourse(lapTrinhWeb);
        System.out.println("");
        courseService.displayDetailCourse(thietKeWeb);
        System.out.println("");
        courseService.displayDetailCourse(cauTrucDuLieuVaGiaiThuat);
        System.out.println("");
        courseOnlineService.displayDetailCourse(english);
        System.out.println("");
        courseOnlineService.displayDetailCourse(japanese);
        System.out.println("");
        courseOnlineService.displayDetailCourse(korean);
        System.out.println("");




    }
}
