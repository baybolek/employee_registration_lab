package com.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

//    @NotNull  //everything besides NULL will be accepted. ex: ""
//    @NotEmpty  //does not accept null+"" but it will accept " "
//    @NotBlank  // does not accept null+""+" "

//    notes from instructor
//    @NotNull  === > Except null, anything can be accepted
//    @NotEmpty === > Except null and empty String, anything can be accepted
//    @NotBlank === > Except null, empty String and only space, anything will be accepted

    @NotBlank
    @Size(max=12, min=2)
    private String firstName;
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
