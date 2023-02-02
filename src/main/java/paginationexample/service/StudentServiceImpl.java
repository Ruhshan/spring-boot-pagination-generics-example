package paginationexample.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import paginationexample.dto.GenericPaginatedResponseDto;
import paginationexample.entity.Student;
import paginationexample.repository.StudentRepository;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public GenericPaginatedResponseDto<Student, Student> getPaginatedList(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Student> studentsPage = studentRepository.findAll(pageable);
        return new GenericPaginatedResponseDto<Student, Student>(studentsPage, studentsPage.getContent()).get();
    }
}
