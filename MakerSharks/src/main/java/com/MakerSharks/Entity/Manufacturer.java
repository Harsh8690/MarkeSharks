package com.MakerSharks.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Manufacturer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long supplier_id;

    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;

    @ElementCollection
    private List<String> manufacturingProcesses;

    public Manufacturer() {

    }

    public Manufacturer(long supplier_id, String companyName, String website, String location, String natureOfBusiness, List<String> manufacturingProcesses) {
        this.supplier_id = supplier_id;
        this.companyName = companyName;
        this.website = website;
        this.location = location;
        this.natureOfBusiness = natureOfBusiness;
        this.manufacturingProcesses = manufacturingProcesses;
    }

    public long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public List<String> getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(List<String> manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }

}
