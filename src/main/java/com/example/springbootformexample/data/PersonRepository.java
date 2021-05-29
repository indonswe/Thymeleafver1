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
    @Query("SELECT new com.example.springbootformexample.dto.PersonDTO(b.email, b.name, b.username, b.password, b.phonenumber) FROM Person b")
    Set<PersonDTO> findAllAsDTO();

    @Query("SELECT new com.example.springbootformexample.dto.PersonDTO(b.email, b.name, b.username, b.password, b.phonenumber) FROM Person b WHERE b.id = :personen")
    PersonDTO findByPerson(@Param("personen") Integer person_id);

    @Query("SELECT new com.example.springbootformexample.dto.PersonDTO(b.email, b.name, b.username, b.password, b.phonenumber) FROM Person b WHERE b.username = :username")
    PersonDTO findByUsername(@Param("username") String person_name);
}
