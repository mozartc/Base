package cn.pccc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class userController {
	@RequestMapping("/index/*.do")  
    public Model HelloWorld(Model model){  
        return model;  
    } 
}
