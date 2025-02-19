package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    //curl -X POST http://127.0.0.1:8080/student -H "Content-Type: application/json" -d '{"id":123,"name":"henry"}'
    @PostMapping("/student")
    public String createStudent(@RequestBody Student st){
        return "created student";
    }

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable Integer id){
        return "show "+ id + "student";
    }

    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable Integer id, @RequestBody Student st){
        return "update "+ id+ "student";
    }

    @DeleteMapping("/student/{id}")
    public String delStudent(@PathVariable Integer id){
        return "del "+ id + "student"  ;
    }

}
