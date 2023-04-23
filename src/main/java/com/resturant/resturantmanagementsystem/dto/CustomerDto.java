package com.resturant.resturantmanagementsystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private  Integer id;
    private  String customerName;
    @NotNull(message="Username can not be null.")
    @NotEmpty(message="Username can not be empty.")
    @NotBlank

    private String CustomerDto;
}
