package com.example.springbootformexample.data;

import com.example.springbootformexample.dto.BlasterDTO;
import com.example.springbootformexample.model.Annons;
import com.example.springbootformexample.model.Blaster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AnnonsRepository extends CrudRepository<Annons, Integer> {
    @Query("SELECT new com.example.springbootformexample.dto.BlasterDTO(b.name, b.ammunitionQuality, b.ammunitionCapacity) FROM Blaster b")
    Set<BlasterDTO> findAllAsDTO();
}

