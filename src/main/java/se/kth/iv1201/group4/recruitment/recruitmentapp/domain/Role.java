package se.kth.iv1201.group4.recruitment.recruitmentapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**

 * Entity representing a role in the system.
 */

 /** Represents the role of a person, recruiter or applicant
 * This class is mapped to the "role" table in the database.
 */


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role {

    @Id
    @Column(name = "role_id")
    private Integer id;

    @Column(name = "name")
    private String name;

     /**
      * Getters and setters
      */

     public void setId(Integer id) {
         this.id = id;
     }

     public Integer getId() {
         return id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
}
