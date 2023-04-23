package com.resturant.resturantmanagementsystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Department_dto {
    private  Integer id;

    @NotNull(message="Department can not be null.")
    private  String departmentName;




}
