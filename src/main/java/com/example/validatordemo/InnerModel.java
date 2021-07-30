package com.example.validatordemo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel
public class InnerModel {

    @Size(min = 2, max = 50, message = "firstName can not be below 2 above 50")
    private String firstName;

    @Size(min = 1, max = 50, message = "lastname can not be above 50")
    private String lastName;

    @Max(value = 120 , message = "can not be above 120", groups = BasicValidation.class)
    @Min(value = 0, message = "can not be negitive")
    private int age;
}
