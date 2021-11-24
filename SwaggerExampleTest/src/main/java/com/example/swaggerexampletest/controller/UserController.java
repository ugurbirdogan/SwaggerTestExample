package com.example.swaggerexampletest.controller;


import com.example.swaggerexampletest.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "User Api documentation")
public class UserController {

    private final List<User> userList = new ArrayList<>();

    @PostConstruct
    public void init(){

        userList.add(new User(1,"ugurbirdogan","ugur","birdogan","ugurbirdogan34@gmail.com",new Date()));
    }


    @PostMapping("/newuser")
    @ApiOperation(value = "New User adding method")
    public ResponseEntity<User> save(@RequestBody User user){

        userList.add(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    @ApiOperation(value = "User list Method")
    public ResponseEntity<List<User>> getAll(){
        return  ResponseEntity.ok(userList);
    }

}
