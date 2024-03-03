package com.example.demo.controller;

import com.example.demo.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LikesController {

    @Autowired
    LikesService likesService;

    @ResponseBody
    @RequestMapping(path = "/post/{id}/like", method = RequestMethod.POST)
    public String like(@ModelAttribute("id") Long id) {
        int likes = likesService.like(id);
        return "" + likes;
    }
}
