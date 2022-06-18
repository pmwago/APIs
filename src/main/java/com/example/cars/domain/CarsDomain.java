package com.example.cars.domain;

public class CarsDomain {
    private String id;
    private String brand;
    private String rego;
    private String model;
    private String createTime;
    private String updateTime;

    public CarsDomain(String id, String brand, String rego, String model, String createTime, String updateTime) {
        this.id = id;
        this.brand = brand;
        this.rego = rego;
        this.model = model;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRego() {
        return rego;
    }

    public void setRego(String rego) {
        this.rego = rego;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    @Override
    public String toString() {
        return "carsDomain{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", rego='" + rego + '\'' +
                ", model='" + model + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
