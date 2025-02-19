package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    @Qualifier("hpPrinter")
    private Printer p;

    @RequestMapping("/test")
    public String test(){
        //System.out.println("hello");
        p.print("documents");
        return "Hello this is Mycontroller";
    }

    @RequestMapping("/studenttest")
    public Student st(){
        Student stu = new Student();
        stu.setName("henry");
        return stu; //JSON format

    }

    @RequestMapping("/api/{id}")
    public String ap(@PathVariable String id){
        return id;
    }
}
