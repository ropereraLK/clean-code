package io.github.ropereralk.clean_code.aop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static final Logger LOGGER = LogManager.getLogger(EmployeeController.class);

    @GetMapping("/{id}")
    public String employee(@PathVariable int id) {
        //Traditional Log
        LOGGER.info("employee() Executing");
        if (id > 0) {
            return "John Doe";
        } else throw new RuntimeException("Employee Id is invalid");
    }
}
