package com.example.swaggerexampletest.model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

@ApiModel(value = "User Api model documentation", description = "Model")
public class User {

    @ApiModelProperty(value = "Uniqueidfieldofuserobject")
    private int id;

    @ApiModelProperty(value = "UserNamefieldofuserobject")
    private String userName;

    @ApiModelProperty(value = "firstNamefieldofuserobject")
    private String firstName;

    @ApiModelProperty(value = "lastNamefieldofuserobject")
    private String lastName;

    @ApiModelProperty(value = "emailAddressfieldofuserobject")
    private String emailAddress;

    @ApiModelProperty(value = "Datefieldofuserobject")
    private Date date;

}
