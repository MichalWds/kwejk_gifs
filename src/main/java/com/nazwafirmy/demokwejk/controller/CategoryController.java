package com.nazwafirmy.demokwejk.controller;


import com.nazwafirmy.demokwejk.data.CategoryRepository;
import com.nazwafirmy.demokwejk.data.GifRepository;
import com.nazwafirmy.demokwejk.model.Category;
import com.nazwafirmy.demokwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    CategoryRepository categoryRepository;

//request mapping przekierowuje z html do konkretnej metody
@RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){
    List<Category> categories = categoryRepository.getAllCategories();
    modelMap.put("categories", categories);
return "categories";
}

@Autowired
GifRepository gifRepository;

@GetMapping("/category/{id}")
    public String idCategories(@PathVariable int id, ModelMap modelMap){

    List<Gif> gifs = gifRepository.getGifsByCategoryId(id);
    modelMap.put("gifs",gifs);
    modelMap.put("category", categoryRepository.getCategoryById(id-1));
    return "category";


}







}


