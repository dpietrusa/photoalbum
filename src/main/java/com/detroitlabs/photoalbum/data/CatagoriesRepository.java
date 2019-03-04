package com.detroitlabs.photoalbum.data;

import com.detroitlabs.photoalbum.model.Category;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class CatagoriesRepository {

    public static final List<Category> CATAGORY_LIST = Arrays.asList (
    new Category(1,"Reds"),
    new Category(2, "Greens"),
    new Category(3, "Blues/Violets")
    );


public List<Category> returnCategories(){
    return CATAGORY_LIST;
}

public Category findByCategory(int idNumber){
    for (Category category : CATAGORY_LIST){
        if (category.getId() == idNumber);
        return category;
    }
    return null;
}


}





