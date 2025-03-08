package se.kth.iv1201.group4.recruitment.recruitmentapp.domain;

import jakarta.persistence.*;
import lombok.*;

/**
 * Shows a persons competence profile and years of experience for that specific competence.
 * This class is mapped to the "competence_profile" table in the database.
 */

@Entity
@Table(name = "competence_profile")
@Getter
@Setter
@NoArgsConstructor
public class CompetenceProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "competence_profile_id", nullable = false, updatable = false)
    private Integer competenceProfileId;



    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "competence_id", nullable = false)
    private Competence competence;

    @Column(name = "years_of_experience", nullable = false)
    private Double yearsOfExperience;

    @Column(name = "status")
    private String status;

    public void setcompetenceProfileId(Integer competenceProfileId) {
        this.competenceProfileId = competenceProfileId;

    }


    public CompetenceProfile(Person person, Competence competence, Double yearsOfExperience, String status) {
        this.person = person;
        this.competence = competence;
        this.yearsOfExperience = yearsOfExperience;
        this.status = status;


    }
}
