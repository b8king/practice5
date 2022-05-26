package com.example.demo;

import com.example.demo.domain.UserEntity;
import com.example.demo.repos.UserRepo;
import com.example.demo.repos.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class LoginController {
    private @Autowired UserService service;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new UserEntity());
        return "login";
    }

    @PostMapping("/login")
    public String check(Model model, UserEntity user) {
        ArrayList<UserEntity> users = service.getAll();
        for (int i = 0; i < users.size(); i++) {
            if (user.getName().equals(users.get(i).getName())
                    && user.getPass().equals(users.get(i).getPass())) {
                model.addAttribute("user", users.get(i));
                System.out.println("Такой пользователь существует");
                return "login";
            }
        }
        System.out.println(user.getName());
        return "login";
    }

    @Autowired
    private UserRepo userRepository;

    @GetMapping("/")
    public String mainReg(Model model) {
        Iterable<UserEntity> user = userRepository.findAll();
        model.addAttribute("user", user);
        return "reg";
    }

    @GetMapping("/reg")
    public String addReg(Model model) {
        return "reg";
    }

    @PostMapping("/reg")
    public String adduser(@RequestParam String name,
                          @RequestParam String pass,
                          @RequestParam String mail,
                          @RequestParam String profile,
                          @RequestParam String city,
                          @RequestParam String birthday,
                          Model model) {
        UserEntity userEntity = new UserEntity(name, pass,mail,profile,city,birthday);
        userRepository.save(userEntity);
        return "redirect:/login";
    }


    @PostMapping("/login/profile")
    public String profile( Model model) {
        Iterable<UserEntity> user = userRepository.findAll();
        model.addAttribute("list", user);
        return "profile";
    }
}