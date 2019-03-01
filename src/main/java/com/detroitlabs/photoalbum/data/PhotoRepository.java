package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;


@Component
public class PhotoRepository {
    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("office1", LocalDate.of(2019, 7, 26),1),
            new Photo("office2", LocalDate.of(2019, 9, 26),1),
            new Photo("office3", LocalDate.of(2019, 8, 26),1),
            new Photo("office4", LocalDate.of(2019, 10, 26),1),
            new Photo("freshprince1", LocalDate.of(2019, 6, 26),2),
            new Photo("freshprince2", LocalDate.of(2019, 2, 26),2),
            new Photo("freshprince3", LocalDate.of(2019, 4, 26),2),
            new Photo("retro4", LocalDate.of(2019, 3, 26),3),
            new Photo("retro5", LocalDate.of(2019, 5, 26),3),
            new Photo("retro7", LocalDate.of(2019, 1, 26),3)
    );

    public List<Photo> returnFiveRandom(){
        List<Photo> randomFiveImages = new ArrayList<>();
        ArrayList<Integer> randomIntArray = new ArrayList<>();

        for (int i = 0; i <= ALL_PHOTOS.size(); i++) {
            randomIntArray.add(i);
        } Collections.shuffle(randomIntArray);

        for (int i = 0; i < 5; i++) {
            randomFiveImages.add(ALL_PHOTOS.get(randomIntArray.indexOf(i)));
        } return randomFiveImages;
    }


    public List<Photo> sortByDate(){
        Collections.sort(ALL_PHOTOS, new Comparator<Photo>() {
            public int compare(Photo i1, Photo i2) {
                return i1.getDateUploaded().compareTo(i2.getDateUploaded());
            }
        }); return ALL_PHOTOS;
    }








}



