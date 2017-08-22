package com.exam.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/hi")
    public @ResponseBody  String sayHI(){
        return "hi";
    }

    @RequestMapping(value = "/add")
    public @ResponseBody
    String addDemoUser() {
        User user = new User();
        user.setEmail("ade@gmail.com");
        user.setName("ade");
        userRepository.save(user);
        return "Success";
    }

        @RequestMapping(value = "/all")
        public @ResponseBody List<User> findall(){
        return userRepository.findAll();
        }

    }

