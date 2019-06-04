package app.timsnky.spring_security_tutorial.controller;

import app.timsnky.spring_security_tutorial.db.UserRepository;
import app.timsnky.spring_security_tutorial.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public")
@CrossOrigin
public class PublicRestApiController {

    private UserRepository userRepository;

    public PublicRestApiController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("test")
    public String test1() {
        return  "API Test";
    }

    @GetMapping("management/reports")
    public String test2() {
        return  "Some report data";
    }

    @GetMapping("admin/users")
    public List<User> users() {
        return this.userRepository.findAll();
    }
}
