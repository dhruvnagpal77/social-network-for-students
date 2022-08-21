package com.dheerajproject.socialnetworkforstudents.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class StudentRequest {

    @NotNull(message = "First name should not be null/empty")
    private String firstName;
    @NotNull(message = "Last name should not be null/empty")
    private String lastName;
    @Email(message = "Not a valid email")
    private String emailId;
    @NotNull(message = "Phone number should not be null/empty")
    private long phoneNumber;
    @NotNull(message = "Address should not be null/empty")
    private String address;
}
