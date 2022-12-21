package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.Users;
import net.restapi.springbootbackend.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        super();
        this.usersService = usersService;
    }



    //Get All Users
    @GetMapping()
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    //Get Users By ID
    //http://localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<Users> getUserById(@PathVariable ("id") long id){
        return new ResponseEntity<Users>(usersService.getUserById(id), HttpStatus.OK);
    }



}
