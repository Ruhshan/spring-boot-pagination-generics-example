package paginationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import paginationexample.entity.Teacher;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenericPaginatedResponseDto<U>{
    private int size;
    private long totalElements;
    private int totalPages;
    private List<U> content;
    private int currentPage;

    public <T> GenericPaginatedResponseDto(Page<T> pageResult, Function<T, U> function){
        this.setSize(pageResult.getSize());
        this.setTotalElements(pageResult.getTotalElements());
        this.setTotalPages(pageResult.getTotalPages());
        this.setCurrentPage(pageResult.getPageable().getPageNumber());
        this.setContent(pageResult.getContent().stream().map(function).collect(Collectors.toList()));
    }



    public GenericPaginatedResponseDto<U> get(){
        return this;
    }
}
