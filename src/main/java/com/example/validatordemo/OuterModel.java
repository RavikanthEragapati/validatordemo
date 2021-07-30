package com.example.validatordemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OuterModel {

    @NotNull(message = "InnerMode cant me null" , groups = BasicValidation.class)
    @Size(min = 0, max = 10, message = "minimum 0, maximum 10", groups = BasicValidation.class)
    @Valid
    private List<InnerModel> innerModelList;
}
