package com.example.springbootformexample.data;

import com.example.springbootformexample.dto.AnnonsDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface PersonRepository {
    @Query("SELECT new com.example.springbootformexample.dto.AnnonsDTO(b.name, b.person, b.provins, b.kommun, b.size_of_area, b.size_of_buildings, b.price, b.category) FROM Annons b")
    Set<AnnonsDTO> findAllAsDTO();

    @Query("SELECT new com.example.springbootformexample.dto.AnnonsDTO(b.name, b.person, b.provins, b.kommun, b.size_of_area, b.size_of_buildings, b.price, b.category) FROM Annons b WHERE b.person.id = :personen")

    Set<AnnonsDTO> findByPerson(@Param("personen") Integer person_id);
}
