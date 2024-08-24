package com.MakerSharks.Sevice;

import com.MakerSharks.Entity.Manufacturer;
import com.MakerSharks.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {

    @Autowired
    private Repo repo;

    public List<Manufacturer> getManufacturers(String location, String natureOfBusiness, String manufacturingProcess) {
        return repo.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                location, natureOfBusiness, manufacturingProcess);
    }
}
