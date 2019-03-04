package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.text.Collator;
import java.time.LocalDate;
import java.util.*;


@Component
public class PhotoRepository {
    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("Emerald 2013", LocalDate.of(2013, 7, 26),2),
            new Photo("Greenery 2017", LocalDate.of(2017, 9, 26),2),
            new Photo("Honeysuckle 2011", LocalDate.of(2011, 8, 26),1),
            new Photo("Living Coral 2019", LocalDate.of(2019, 10, 26),1),
            new Photo("Marsala 2015", LocalDate.of(2015, 6, 26),1),
            new Photo("Radiant Orchid 2014", LocalDate.of(2014, 2, 26),1),
            new Photo("Rose Quartz 2016", LocalDate.of(2016, 4, 26),1),
            new Photo("Tangerine Tango 2012", LocalDate.of(2012, 3, 26),1),
            new Photo("Turquoise 2010", LocalDate.of(2010, 5, 26),3),
            new Photo("Ultra Violet 2018", LocalDate.of(2018, 1, 26), 3)
    );

    public List<Photo> returnFiveRandom(){
        List<Photo> randomFiveImages = new ArrayList<>();
        ArrayList<Integer> randomIntArray = new ArrayList<>();

        for (int i = 0; i < ALL_PHOTOS.size(); i++) {
            randomIntArray.add(i);
        } Collections.shuffle(randomIntArray);

        for (int i = 0; i < 5; i++) {
            randomFiveImages.add(ALL_PHOTOS.get(randomIntArray.indexOf(i)));
        } return randomFiveImages;
    }


    public List<Photo> sortByDate(){
        ALL_PHOTOS.sort(Comparator.comparing(Photo::getDateUploaded));
        return ALL_PHOTOS;
    }

    public List<Photo> sortByName(){
        ALL_PHOTOS.sort(Comparator.comparing(Photo::getName));
        return ALL_PHOTOS;
    }

    public List<Photo> sortById(int id){
        List<Photo> sortedPhotos = new ArrayList<>();
        for (Photo photo: ALL_PHOTOS){
            if (photo.getId() == id){
                sortedPhotos.add(photo);
            }
        }
        return sortedPhotos;
    }









}



