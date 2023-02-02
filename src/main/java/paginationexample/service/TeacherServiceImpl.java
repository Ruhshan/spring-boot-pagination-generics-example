package paginationexample.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import paginationexample.dto.GenericPaginatedResponseDto;
import paginationexample.entity.Teacher;
import paginationexample.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService{
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public GenericPaginatedResponseDto<Teacher> getPaginatedList(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Teacher> teacherPage = teacherRepository.findAll(pageable);
        return new GenericPaginatedResponseDto<Teacher>(teacherPage).get();
    }
}
