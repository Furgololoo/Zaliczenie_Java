package com.example.StronaFurgol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculator")
public class CalorieController {

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("formularzKalorii", new FormularzKalorii());
        return "calculatorForm";
    }

    @PostMapping
    public String calculate(@ModelAttribute FormularzKalorii formData, Model model) {
        double result = formData.calculateCalories();
        model.addAttribute("result", result);
        model.addAttribute("formData", formData);
        return "result";
    }

}
