package se.kth.iv1201.group4.recruitment.recruitmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.kth.iv1201.group4.recruitment.recruitmentapp.domain.Availability;

import java.util.List;


/**
 * Repository for handling database operations related to availability periods.
 */
@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Integer> {

    /**
     * Retrieves all availability periods for a given person.
     *
     * @param personId The ID of the person.
     * @return A list of availability periods associated with the person.
     */
    List<Availability> findByPerson_Id(Integer personId);

    /**
     * Finds a list of {@link Availability} entities by the given person ID.
     * This method allows retrieving all availabilities for a specific person.
     *
     * @param personId The ID of the person that you want the availabilities for
     * @return A list of {@link Availability} entities associated with the specified person ID
     */

    List<Availability> findByPersonId(Integer personId);
}

// JpaRepository<User, Integer> means this repository is managing User entities
// and the data type for the primary key is Integer
/**
 * The repository that is mapped to the availability table.
 */


