package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


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
        Random rand = new Random();
        int value = rand.nextInt(9);
        List<Photo> randomFive = new ArrayList<>();

        int i = 0;
        while (i <= 4) {
        randomFive.add(ALL_PHOTOS.get(value));
        i++;
        }return randomFive;
    }


}
