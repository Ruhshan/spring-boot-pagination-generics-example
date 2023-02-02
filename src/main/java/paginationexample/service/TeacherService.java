package paginationexample.service;

import paginationexample.dto.GenericPaginatedResponseDto;
import paginationexample.dto.TeacherSummaryDto;
import paginationexample.entity.Teacher;

public interface TeacherService {
    GenericPaginatedResponseDto<Teacher, TeacherSummaryDto> getPaginatedList(int page, int size);
}
