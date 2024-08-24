package com.MakerSharks.Repo;

import com.MakerSharks.Entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repo extends JpaRepository<Manufacturer,Long> {
    List<Manufacturer> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location, String natureOfBusiness, String manufacturingProcess);
}
