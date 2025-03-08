package se.kth.iv1201.group4.recruitment.recruitmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.kth.iv1201.group4.recruitment.recruitmentapp.domain.Competence;

import se.kth.iv1201.group4.recruitment.recruitmentapp.domain.*;

// JpaRepository<User, Integer> means this repository is managing User entities
// and the data type for the primary key is Integer




/**
 * Repository for handling database operations related to competences.
 */
@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Integer> {
}
