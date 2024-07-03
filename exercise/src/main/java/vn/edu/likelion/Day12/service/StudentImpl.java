package vn.edu.likelion.Day12.service;

import vn.edu.likelion.Day12.entity.Student;
import vn.edu.likelion.Day12.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * StudentImpl -
 *
 * @param
 * @return
 * @throws
 */
public interface StudentImpl extends CrudRepository<Student,String> {
    @Override
    Student save(Student entity , List<Student> list);

    @Override
    Optional<Student> findById(List<Student> studentList,String s);

    @Override
    List<Student> findAll();

    @Override
    void deleteById(String s);

    void displayListStudent(List<Student> studentList);

    void updateStudent(String id , List<Student> studentList);

}
