package com.MakerSharks.Controller;


import com.MakerSharks.Entity.Manufacturer;
import com.MakerSharks.Sevice.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/manufacturers")
public class Controller {
    @Autowired
    private ManufacturerService manufacturerService;



    @GetMapping("/search")
    public List<Manufacturer> searchManufacturers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcess) {

        return manufacturerService.getManufacturers(location, natureOfBusiness, manufacturingProcess);
    }
}
