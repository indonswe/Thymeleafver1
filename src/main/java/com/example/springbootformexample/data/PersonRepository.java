package com.example.springbootformexample.data;

import com.example.springbootformexample.dto.AnnonsDTO;
import com.example.springbootformexample.dto.PersonDTO;
import com.example.springbootformexample.model.Annons;
import com.example.springbootformexample.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    @Query("SELECT new com.example.springbootformexample.dto.AnnonsDTO(b.name, b.person, b.provins, b.kommun, b.size_of_area, b.size_of_buildings, b.price, b.category) FROM Annons b")
    Set<PersonDTO> findAllAsDTO();

    @Query("SELECT new com.example.springbootformexample.dto.AnnonsDTO(b.name, b.person, b.provins, b.kommun, b.size_of_area, b.size_of_buildings, b.price, b.category) FROM Annons b WHERE b.person.id = :personen")

    Set<PersonDTO> findByPerson(@Param("personen") Integer person_id);
}
