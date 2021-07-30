package com.example.validatordemo;

import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ValidatorController {

    @ApiOperation(value = "getValidated")
    @PostMapping(path = "/validate")
    public String getValidated(@Validated(value = BasicValidation.class) @RequestBody OuterModel outerModel) {
        return "Hello"+outerModel.getInnerModelList().size();
    }
}
