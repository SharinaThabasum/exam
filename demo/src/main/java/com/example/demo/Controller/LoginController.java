package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Simple authentication logic (replace with actual authentication)
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/dashboard"; // Redirect to dashboard on successful login
        } else {
            model.addAttribute("error", true);
            return "login";
        }
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }
}
