package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;


@Component
public class PhotoRepository {
    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("office1", LocalDate.of(2019, 2, 26),1),
            new Photo("office2", LocalDate.of(2019, 2, 26),1),
            new Photo("office3", LocalDate.of(2019, 2, 26),1),
            new Photo("office4", LocalDate.of(2019, 2, 26),1),
            new Photo("freshprince1", LocalDate.of(2019, 2, 26),2),
            new Photo("freshprince2", LocalDate.of(2019, 2, 26),2),
            new Photo("freshprince3", LocalDate.of(2019, 2, 26),2),
            new Photo("retro4", LocalDate.of(2019, 2, 26),3),
            new Photo("retro5", LocalDate.of(2019, 2, 26),3),
            new Photo("retro7", LocalDate.of(2019, 2, 26),3)
    );

    public List<Photo> returnFiveRandom(){
        List<Photo> randomFiveImages = new ArrayList<>();
        ArrayList<Integer> randomIntArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randomIntArray.add(i);
        } Collections.shuffle(randomIntArray);

        for (int i = 0; i < 5; i++) {
            randomFiveImages.add(ALL_PHOTOS.get(randomIntArray.indexOf(i)));
        } return randomFiveImages;
    }

    }



