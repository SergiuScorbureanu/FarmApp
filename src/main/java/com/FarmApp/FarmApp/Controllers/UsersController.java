package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.User;
import com.FarmApp.FarmApp.Services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping
    public List<User> getUsers(){
        return usersService.getUsers();
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        usersService.createUsers(user);
    }

    @PutMapping(path = "{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        usersService.updateUsers(id, user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable Long id){
        usersService.deleteUsers(id);
    }
}
