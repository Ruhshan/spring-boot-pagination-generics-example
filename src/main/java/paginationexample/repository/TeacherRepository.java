package paginationexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paginationexample.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
