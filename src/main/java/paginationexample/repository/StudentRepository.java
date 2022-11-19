package paginationexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paginationexample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
