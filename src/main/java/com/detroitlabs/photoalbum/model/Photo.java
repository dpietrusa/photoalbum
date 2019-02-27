package com.detroitlabs.photoalbum.model;

import java.time.LocalDate;

public class Photo {

    String name;
    LocalDate dateUploaded;
    int idTag;

    public Photo(String name, LocalDate dateUploaded, int idTag) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.idTag = idTag;
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

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }
}
