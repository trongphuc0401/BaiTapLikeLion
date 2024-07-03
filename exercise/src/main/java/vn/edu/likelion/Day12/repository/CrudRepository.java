package vn.edu.likelion.Day12.repository;

import java.util.List;
import java.util.Optional;

/**
 * CrudRepository -
 *
 * @param
 * @return
 * @throws
 */
public interface CrudRepository<T,ID> {

    T save(T entity , List<T> list);
    Optional<T> findById(List<T> list,ID id);
    List<T> findAll();
    void deleteById(ID id);
}
