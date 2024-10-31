package com.redeemerlives.studentsservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;

@Builder
public record StudentDto(
        @Email(message = "Enter a valid email")
        @NotBlank(message = "Email is required")
        String email,

        @Length(min = 6, max = 18, message = "Password should be between 6 to 18 characters")
        String password
) {
}
