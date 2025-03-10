package se.kth.iv1201.group4.recruitment.recruitmentapp.presentation;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.kth.iv1201.group4.recruitment.recruitmentapp.application.PersonService;

import se.kth.iv1201.group4.recruitment.recruitmentapp.domain.Person;
import se.kth.iv1201.group4.recruitment.recruitmentapp.presentation.dto.LoginDTO;
import se.kth.iv1201.group4.recruitment.recruitmentapp.presentation.dto.RegisterDTO;


//@RestController
/**
 * Controller class for handling person-related requests.
 */
@Controller
//@RequestMapping("")
@SessionAttributes("username")
public class PersonController {

    private final PersonService personService;
    /**
     * Constructor for PersonController.
     *
     * @param personService Service for handling person-related operations.
     */
    public PersonController(PersonService personService ){
        this.personService = personService;
    }



    /**
     * Handles GET requests to the dashboard page.
     *
     * @param model Model to hold attributes for the view.
     * @return The name of the dashboard view.
     */
    @GetMapping("/dashboard")
    public String dashboardPage(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();

        Integer roleId = personService.getRoleIdByUsername(username);

        model.addAttribute("username", username);
        model.addAttribute("roleId", roleId);  // Send role ID to Thymeleaf

        return "dashboard";
    }









}