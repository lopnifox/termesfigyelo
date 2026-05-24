package com.example.models;

public class Crop {
    private int id;
    private String name;
    private String field;
    private int yield;
    private String harvestEnd;

    public Crop() {
    }

    public Crop(int id, String name, String field, int yield, String harvestEnd) {
        this.id = id;
        this.name = name;
        this.field = field;
        this.yield = yield;
        this.harvestEnd = harvestEnd;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getField() { return field; }
    public void setField(String field) { this.field = field; }

    public int getYield() { return yield; }
    public void setYield(int yield) { this.yield = yield; }

    public String getHarvestEnd() { return harvestEnd; }
    public void setHarvestEnd(String harvestEnd) { this.harvestEnd = harvestEnd; }
}