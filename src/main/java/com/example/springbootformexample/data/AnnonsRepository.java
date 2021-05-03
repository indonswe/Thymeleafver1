package com.example.springbootformexample.data;

import com.example.springbootformexample.dto.AnnonsDTO;
import com.example.springbootformexample.dto.BlasterDTO;
import com.example.springbootformexample.model.Annons;
import com.example.springbootformexample.model.Blaster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AnnonsRepository extends CrudRepository<Annons, Integer> {

        @Query("SELECT new com.example.springbootformexample.dto.AnnonsDTO(b.name, b.provins, b.kommun, b.size_of_area, b.size_of_buildings, b.price, b.category) FROM Annons b")

    Set<AnnonsDTO> findAllAsDTO();
}

