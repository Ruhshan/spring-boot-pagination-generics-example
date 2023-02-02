package paginationexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import paginationexample.entity.Teacher;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherSummaryDto {
    private Long id;
    private String email;
    private String phoneNumber;
    private String joiningDate;
    private String name;

    public static TeacherSummaryDto fromEntity(Teacher teacher){
        TeacherSummaryDto teacherSummaryDto = new TeacherSummaryDto();
        teacherSummaryDto.setId(teacher.getId());
        teacherSummaryDto.setEmail(teacher.getEmail());
        teacherSummaryDto.setPhoneNumber(teacher.getPhoneNumber());
        teacherSummaryDto.setJoiningDate(teacher.getJoiningDate());

        return teacherSummaryDto;

    }
}
