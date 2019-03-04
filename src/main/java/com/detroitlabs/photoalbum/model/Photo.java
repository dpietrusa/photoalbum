package com.detroitlabs.photoalbum.model;

import java.time.LocalDate;

public class Photo {

    String name;
    LocalDate dateUploaded;
    int id;

    public Photo(String name, LocalDate dateUploaded, int id) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
