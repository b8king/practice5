package com.example.demo.repos;


import com.example.demo.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired UserRepo repo;

    public ArrayList<UserEntity> getAll()
    {
        return (ArrayList<UserEntity>) repo.findAll();
    }
    public void add(UserEntity newUser)
    {
        repo.save(newUser);
    }
    public boolean check(UserEntity user){
        ArrayList<UserEntity> users=getAll();
        for (int i=0;i<users.size();i++){
            if (users.get(i).getName().equals(user.getName())){
                System.out.println("Пользователь с таким именем уже существует.");
                return  false;
            }
        }
        return  true;
    }

    public UserEntity findById(long id)
    {
        ArrayList<UserEntity> users=getAll();
        for (int i=0;i<users.size();i++){
            if (id == users.get(i).getUserdId()){
                return users.get(i);
            }
        }
        return null;
    }
}
