package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.User;
import net.restapi.springbootbackend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }



    //Get All Users
    @GetMapping()
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    //Get Users By ID
    //http://localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable ("id") long id){
        return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
    }



}