package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.Category;
import com.FarmApp.FarmApp.Entities.Farm;
import com.FarmApp.FarmApp.Entities.User;
import com.FarmApp.FarmApp.Repositories.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public List<User> getUsers(){
        return usersRepository.findAll();
    }

    public void createUsers(User user){
        usersRepository.save(user);
    }

    public void updateUsers(Long id, User user) {
        User userToUpdate = usersRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("plm")));
        userToUpdate.setName(user.getName());
        userToUpdate.setAddress(user.getAddress());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPhone(user.getPhone());
        usersRepository.save(userToUpdate);
    }

    public void deleteUsers(Long id){
        usersRepository.deleteById(id);
    }
}
