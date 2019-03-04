package com.detroitlabs.photoalbum.controllers;
import com.detroitlabs.photoalbum.data.CatagoriesRepository;
import com.detroitlabs.photoalbum.data.PhotoRepository;
import com.detroitlabs.photoalbum.model.Category;
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

    @Autowired
    private CatagoriesRepository categoriesRepository;


    @RequestMapping("/")
    public String home(ModelMap modelMap) {
        List<Photo> photo = photoRepository.returnFiveRandom();
        modelMap.put("randomfive", photo);
        return "home";
    }

    @RequestMapping("/sortedbydate")
    public String sortedByDate(ModelMap modelMap) {
        List<Photo> photo = photoRepository.sortByDate();
        modelMap.put("sortedbydate", photo);
        return "sortedbydate";
    }

    @RequestMapping("/sortedbyname")
    public String sortedByName(ModelMap modelMap) {
        List<Photo> photo = photoRepository.sortByName();
        modelMap.put("sortedbyname", photo);
        return "sortedbyname";
    }

    @RequestMapping("/categories")
    public String getAllCategories(ModelMap modelMap) {
    List<Category> categories = categoriesRepository.returnCategories();
        modelMap.put("categories", categories);
        return"categories";

}





}
