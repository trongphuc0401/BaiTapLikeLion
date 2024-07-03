package vn.edu.likelion.Day12.service;

import vn.edu.likelion.Day12.entity.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

/**
 * StudentService -
 *
 * @param
 * @return
 * @throws
 */
public class StudentService implements StudentImpl{
    static Scanner scanner = new Scanner(System.in);
    @Override
    public Student save(Student student, List<Student> list) {
        if (student.getStudentId() == null) {
            UUID uuid = UUID.randomUUID();
            String studentId = uuid.toString();
            student.setStudentId(studentId);
            list.add(student);
            System.out.println("Add student register");
        }else {
            System.out.println("Student have exits");
        }
        return student;
    }
    public void inputStudentAttributes(Student student) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        student.setName(name);

        LocalDate dateOfBirth = null;
        while (dateOfBirth == null) {
            System.out.print("Enter date of birth (yyyy-MM-dd): ");
            String dobInput = scanner.nextLine();
            try {
                dateOfBirth = LocalDate.parse(dobInput, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please try again.");
            }
        }
        student.setDateOfBirth(dateOfBirth);

        System.out.print("Enter ID number: ");
        String idNumber = scanner.nextLine();
        student.setIdNumber(idNumber);
    }

    @Override
    public Optional<Student> findById(List<Student> studentList,String s) {

        return studentList.stream().filter(student -> student.getStudentId().equals(s)).findFirst();
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void displayListStudent(List<Student> studentList) {
        int count = 0;
        if (!studentList.isEmpty()) {
            for (Student student: studentList) {
                System.out.println("Student details: " + count);
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Name: " + student.getName());
                System.out.println("Date of Birth: " + student.getDateOfBirth());
                System.out.println("ID Number: " + student.getIdNumber());
            }
        }else {
            System.out.println("List Null");
        }


    }

    @Override
    public void updateStudent(String id, List<Student> studentList) {
       Optional<Student> studentOptional = studentList.stream()
               .filter(student->student.getStudentId().equals(id)).findFirst();

       for (Student s: studentList) {
           System.out.print("Enter name: ");
           String name = scanner.nextLine();
           // studentOptional.isPresent(student-> {s.setName()})
       }

    }
}
