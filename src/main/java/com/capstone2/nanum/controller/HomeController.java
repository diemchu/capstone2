package com.capstone2.nanum.controller;


import com.capstone2.nanum.database.Room;
import com.capstone2.nanum.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {
    private final RoomService roomService;

    @Autowired
    public HomeController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/home")
    public  String home(){
        return  "home/home";
    }
    @GetMapping("/board-view")
    public String board(Model model) {
        List<Room> rooms = roomService.findAllRooms();
        model.addAttribute("rooms", rooms);
        return "board/board";
    }

    @GetMapping("/user-info-view")
    public  String user_info(){
        return  "home/user-info";
    }


}
