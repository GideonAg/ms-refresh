package com.redeemerlives.studentsservice.service.impl;

import com.redeemerlives.studentsservice.dto.StudentDto;
import com.redeemerlives.studentsservice.entities.Students;
import com.redeemerlives.studentsservice.service.StudentService;
import com.redeemerlives.studentsservice.service.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String createStudent(StudentDto studentDto) {
        var student = Students.builder()
                .email(studentDto.email())
                .password(passwordEncoder.encode(studentDto.password()))
                .build();
        studentRepository.save(student);
        return "Student created successfully";
    }
}
