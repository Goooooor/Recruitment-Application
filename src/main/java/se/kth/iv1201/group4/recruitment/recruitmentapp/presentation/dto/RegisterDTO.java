package se.kth.iv1201.group4.recruitment.recruitmentapp.presentation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A Data Transfer Object (DTO) for registering a new user.
 * <p>
 * This DTO encapsulates the registration details required for a new user,
 * including first name, last name, email, person number, username, and password.
 * Validation constraints are applied to ensure that none of these fields are left blank
 * and that the email is in a valid format.
 * </p>
 * <p>
 * Lombok annotations (@Data, @NoArgsConstructor, @AllArgsConstructor) are used to reduce
 * boilerplate code by automatically generating getters, setters, constructors, and other
 * common methods.
 * </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

    /**
     * The first name of the user.
     * Must not be blank.
     */
    @NotBlank(message = "First name is required.")
    private String firstName;

    /**
     * The last name of the user.
     * Must not be blank.
     */
    @NotBlank(message = "Last name is required.")
    private String lastName;

    /**
     * The email address of the user.
     * Must be in a valid email format and not blank.
     */
    @Email(message = "Invalid email format.")
    @NotBlank(message = "Email is required.")
    private String email;

    /**
     * The personal identification number of the user.
     * Must not be blank.
     */
    @NotBlank(message = "Person number is required.")
    private String personNumber;

    /**
     * The username chosen by the user.
     * Must not be blank.
     */
    @NotBlank(message = "Username is required.")
    private String username;

    /**
     * The password chosen by the user.
     * Must not be blank.
     */
    @NotBlank(message = "Password is required.")
    private String password;
}
