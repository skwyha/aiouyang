package one.aiouyang.community.controller;

import one.aiouyang.community.mapper.UserMapper;
import one.aiouyang.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HelloController {


    @GetMapping("/index")
    public String index() {
        return "index";
    }




}