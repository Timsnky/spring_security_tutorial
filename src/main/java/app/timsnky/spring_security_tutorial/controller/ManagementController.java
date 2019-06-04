package app.timsnky.spring_security_tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("management")
public class ManagementController {

    @GetMapping("index")
    public String index()
    {
        return "management/index";
    }
}
