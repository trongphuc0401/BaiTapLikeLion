package vn.edu.likelion.Day12.app;

import vn.edu.likelion.Day12.entity.ClassRoom;
import vn.edu.likelion.Day12.entity.Student;
import vn.edu.likelion.Day12.entity.Teacher;
import vn.edu.likelion.Day12.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main -
 *
 * @param
 * @return
 * @throws
 */
public class Main {
    //Database
    static ArrayList<Student> studentList = new ArrayList<Student>();
    static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    static ArrayList<ClassRoom> classRoomList = new ArrayList<>();

    static StudentService studentService = new StudentService();


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();


        Boolean close = false;
        String choose = "";
        menuConsole();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentService.inputStudentAttributes(student);
                    studentService.save(student,studentList);
                    break;
                // case "2":
                //     controller.search();
                //     break;
                // case "3":
                //     controller.edit();
                //     break;
                // case "4":
                //     controller.delete();
                //     break;
                case "5":
                    studentService.displayListStudent(studentList);
                    break;
                // case "6":
                //     controller.displayAveragePercentage();
                //     break;
                // case "7":
                //     controller.showStudent();
                //     break;
                // case "8":
                //     controller.showStudent();
                //     break;
                // case "9":
                //     controller.showStudent();
                //     break;
                // case "10":
                //     controller.showStudent();
                //     break;
                // case "0":
                //     close = true;
                //     break;
                // default:
                //     System.out.println("invalid! please choose action in below menu:");
                //     break;
            }if(close) {
                break;
            }
            menuConsole();
        }

    }
    public static void menuConsole() {
        System.out.print("##------------ Menu Student--------------##");   System.out.print("    ##------------ Menu Teacher-------------##");System.out.print("    ##------------ Menu Class-------------##\n\n");
        System.out.print("|----------------------------------------|"); System.out.print("     |----------------------------------------|");System.out.print("     |----------------------------------------|\n");
        System.out.print("| Option 1 - Add student                 |"); System.out.print("     | Option 8 - Register class for Student  |");System.out.print("     | Option 10 - Display Student on class    |\n");
        System.out.print("| Option 2 - Find student by Id          |"); System.out.print("     | Option 9 - Display List Student        |\n");
        System.out.print("| Option 3 - Edit student by Id          |\n");
        System.out.print("| Option 4 - Delete student by Id        |\n");
        System.out.print("| Option 5 - Display List Student        |\n");
        System.out.print("| Option 6 - Register Class              |\n");
        System.out.print("| Option 7 - Mark Student dropped out    |\n");
        System.out.print("| Option 0 - Exit                        |\n");
        System.out.print("|----------------------------------------|\n");
        System.out.print("Choose something: ");
    }
}
