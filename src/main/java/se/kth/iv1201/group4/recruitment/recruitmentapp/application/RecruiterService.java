package se.kth.iv1201.group4.recruitment.recruitmentapp.application;

import jakarta.persistence.Tuple;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import se.kth.iv1201.group4.recruitment.recruitmentapp.domain.Availability;
import se.kth.iv1201.group4.recruitment.recruitmentapp.domain.CompetenceProfile;
import se.kth.iv1201.group4.recruitment.recruitmentapp.domain.Person;
import se.kth.iv1201.group4.recruitment.recruitmentapp.presentation.dto.PersonStatusDTO;
import se.kth.iv1201.group4.recruitment.recruitmentapp.repository.AvailabilityRepository;
import se.kth.iv1201.group4.recruitment.recruitmentapp.repository.CompetenceProfileRepository;
import se.kth.iv1201.group4.recruitment.recruitmentapp.repository.CompetenceRepository;
import se.kth.iv1201.group4.recruitment.recruitmentapp.repository.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RecruiterService {
    private final AvailabilityRepository availabilityRepository;
    private final CompetenceRepository competenceRepository;
    private final CompetenceProfileRepository competenceProfileRepository;
    private final PersonRepository personRepository;

    public RecruiterService(AvailabilityRepository availabilityRepository, CompetenceRepository competenceRepository, CompetenceProfileRepository competenceProfileRepository, PersonRepository personRepository) {
        this.availabilityRepository = availabilityRepository;
        this.competenceRepository = competenceRepository;
        this.competenceProfileRepository = competenceProfileRepository;
        this.personRepository = personRepository;
    }

    public List<Availability> getAllAvailabilities() {
        return availabilityRepository.findAll(Sort.by(Sort.Direction.ASC, "personId"));
    }
    public List<CompetenceProfile> getAllCompetenceProfiles(){
        return competenceProfileRepository.findAll(Sort.by(Sort.Direction.ASC, "personId"));
    }
    public List<PersonStatusDTO> getAllPersonStatus() {
        //List<Tuple> personStatus = competenceProfileRepository.findPersonIdsAndStatuses();
        List<PersonStatusDTO> personStatus = competenceProfileRepository.findPersonIdsAndStatuses();
        //personStatus = personStatus.stream().distinct().collect(Collectors.toList());

        return personStatus;
    }

    public List<Person> getAllCompetencePersons(){
        return personRepository.findPersonsWithCompetenceProfiles();
    }



}
