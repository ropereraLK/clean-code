package io.github.ropereralk.clean_code.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerConroller {
    @GetMapping("/{id}")
    public String employee(@PathVariable int id){
        if (id > 0){
            return "Manager John Doe";
        } else throw new RuntimeException("Manager Id is invalid");
    }
}
