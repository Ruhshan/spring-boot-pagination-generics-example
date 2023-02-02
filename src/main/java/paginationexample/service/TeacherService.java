package paginationexample.service;

import paginationexample.dto.GenericPaginatedResponseDto;
import paginationexample.entity.Teacher;

public interface TeacherService {
    GenericPaginatedResponseDto<Teacher> getPaginatedList(int page, int size);
}
