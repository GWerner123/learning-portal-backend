package com.gavinwernercodes.learningportal.service;

import com.gavinwernercodes.learningportal.entity.Instructor;
import com.gavinwernercodes.learningportal.entity.Student;
import com.gavinwernercodes.learningportal.repository.InstructorRepository;
import com.gavinwernercodes.learningportal.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final InstructorRepository instructorRepository;
    private final StudentRepository studentRepository;

    public RegistrationService(InstructorRepository instructorRepository, StudentRepository studentRepository) {
        this.instructorRepository = instructorRepository;
        this.studentRepository = studentRepository;
    }

    @Transactional
    public void createInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }

    @Transactional
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

}
