package com.example.springbootformexample.data;

import com.example.springbootformexample.dto.AnnonsDTO;
import com.example.springbootformexample.dto.BlasterDTO;
import com.example.springbootformexample.model.Annons;
import com.example.springbootformexample.model.Blaster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface AnnonsRepository extends CrudRepository<Annons, Integer> {

        @Query("SELECT new com.example.springbootformexample.dto.AnnonsDTO(b.name, b.person, b.provins, b.kommun, b.size_of_area, b.size_of_buildings, b.price, b.category, b.image) FROM Annons b ORDER BY b.price")

    Set<AnnonsDTO> findAllAsDTO();

    @Query("SELECT new com.example.springbootformexample.dto.AnnonsDTO(b.name, b.person, b.provins, b.kommun, b.size_of_area, b.size_of_buildings, b.price, b.category, b.image) FROM Annons b WHERE b.person.id = :personen")

    Set<AnnonsDTO> findByPerson(@Param ("personen") Integer person_id);
}

