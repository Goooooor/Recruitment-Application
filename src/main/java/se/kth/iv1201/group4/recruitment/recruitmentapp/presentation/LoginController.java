package se.kth.iv1201.group4.recruitment.recruitmentapp.presentation;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.kth.iv1201.group4.recruitment.recruitmentapp.application.PersonService;
//import se.kth.iv1201.group4.recruitment.recruitmentapp.application.UserService;
import se.kth.iv1201.group4.recruitment.recruitmentapp.presentation.dto.LoginDTO;
import se.kth.iv1201.group4.recruitment.recruitmentapp.presentation.dto.RegisterDTO;



//@RestController
@Controller
@RequestMapping("/login")
@SessionAttributes("username")
public class LoginController {

    private final PersonService personService;

    public LoginController(PersonService personService ){
        this.personService = personService;
    }


    @GetMapping("")
    public String loginPage(Model model) {
        //generatePassword();
        model.addAttribute("LoginDTO", new LoginDTO());
        return "login";
    }









}