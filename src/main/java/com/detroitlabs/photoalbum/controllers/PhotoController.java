package com.detroitlabs.photoalbum.controllers;
import com.detroitlabs.photoalbum.data.PhotoRepository;
import com.detroitlabs.photoalbum.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;


    @RequestMapping("/")
    public String home(ModelMap modelMap){
        List<Photo> photo = photoRepository.returnFiveRandom();
        modelMap.put("randomfive", photo);
        return "home";
    }

    @RequestMapping("/sortedbydate")
    public String sortedByDate(ModelMap modelMap){
    List<Photo> photo = photoRepository.sortByDate();
    modelMap.put("sortedbydate", photo);
        return "sortedbydate";
    }



}
