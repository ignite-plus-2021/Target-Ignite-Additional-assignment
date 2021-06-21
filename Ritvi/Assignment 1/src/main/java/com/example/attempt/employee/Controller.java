package com.example.attempt.employee;

import java.util.List;

import com.example.attempt.EmailValidator;
import com.example.attempt.MobileValidator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Controller {

    private final Repository repository;
    private final EmailValidator emailValidator;
    private final MobileValidator mobileValidator;

    Controller(Repository repository, EmailValidator emailValidator, MobileValidator mobileValidator) {
        this.repository = repository;
        this.emailValidator = emailValidator;
        this.mobileValidator = mobileValidator;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/employees")
    Employee newEmployee(@Validated @RequestBody Employee newEmployee) {
        if (!emailValidator.test(newEmployee.getEmail())) {
            throw new ApiRequestException(newEmployee.getEmail() + " is not valid");
        }
        if (!mobileValidator.test(newEmployee.getMobile())) {
            throw new ApiRequestException(newEmployee.getMobile() + " is not valid");
        }
        return repository.save(newEmployee);

    }

    // Single item

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmpNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setEmail(newEmployee.getEmail());
                    employee.setMobile(newEmployee.getMobile());
                    employee.setCompany(newEmployee.getCompany());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
