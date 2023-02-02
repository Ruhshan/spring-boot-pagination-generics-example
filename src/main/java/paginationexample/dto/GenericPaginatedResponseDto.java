package paginationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenericPaginatedResponseDto<T>{
    private int size;
    private long totalElements;
    private int totalPages;
    private List<T> content;
    private int currentPage;

    public GenericPaginatedResponseDto(Page<T> pageResult){
        this.setSize(pageResult.getSize());
        this.setTotalElements(pageResult.getTotalElements());
        this.setTotalPages(pageResult.getTotalPages());
        this.setCurrentPage(pageResult.getPageable().getPageNumber());
        this.setContent(pageResult.getContent());
    }

    public GenericPaginatedResponseDto<T> get(){
        return this;
    }
}
