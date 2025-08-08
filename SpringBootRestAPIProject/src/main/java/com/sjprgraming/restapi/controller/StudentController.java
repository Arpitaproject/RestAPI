package com.sjprgraming.restapi.controller;

import java.util.List;
import java.util.Optional;

import com.sjprgraming.restapi.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // Get all students
    @GetMapping(value = "{id}")
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // Get student by id
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        Optional<Student> student = repo.findById(id);
        return student.orElse(null);  // you may want better exception handling
    }

    // Create new student
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    // Update existing student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        Optional<Student> existingStudentOpt = repo.findById(id);
        if (existingStudentOpt.isPresent()) {
            Student existingStudent = existingStudentOpt.get();
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setPercentage(updatedStudent.getPercentage());
            return repo.save(existingStudent);
        } else {
            return null;  // Or throw an exception for not found
        }
    }

    // Delete student by id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeStudent(@PathVariable int id) {
        repo.deleteById(id);
    }
}
