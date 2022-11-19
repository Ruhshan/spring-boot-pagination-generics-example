package paginationexample.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import paginationexample.dto.StudentPaginatedResponseDto;
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
    public StudentPaginatedResponseDto getPaginatedList(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Student> studentsPage = studentRepository.findAll(pageable);

        return new StudentPaginatedResponseDto(studentsPage).get();
    }
}
