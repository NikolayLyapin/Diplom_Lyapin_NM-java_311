package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Обо мне");
        return "about";
    }

    @GetMapping("/travel")
    public String travel(Model model) {
        model.addAttribute("title", "Путеводитель");
        return "travel";
    }
    @GetMapping("/travel/action")
    public String travel_action(Model model) {
        model.addAttribute("title", "Путеводитель");
        return "travel_action";
    }
    @GetMapping("/travel_2")
    public String travel_2(Model model) {
        model.addAttribute("title", "Путеводитель");
        return "travel_2";
    }
    @GetMapping("/cafe")
    public String cafe(Model model) {
        model.addAttribute("title", "Кафе");
        return "cafe";
    }
    @GetMapping("/rest_nature")
    public String rest_nature(Model model) {
        model.addAttribute("title", "Отдых и путешествия");
        return "rest_nature";
    }
    @GetMapping("/attractions")
    public String attractions(Model model) {
        model.addAttribute("title", "Достопримечательности");
        return "attractions";
    }
}
