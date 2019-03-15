package com.nazwafirmy.demokwejk.controller;


import com.nazwafirmy.demokwejk.data.GifRepository;
import com.nazwafirmy.demokwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GifController {

@Autowired
 GifRepository gifRepository;


    @RequestMapping("/")
    public String listGif(ModelMap modelMap){
    //1. yciaganie gifow
       // List<Gif> gifs = gifRepository.ALL_GIFS;   mzoemy tez zrobic, tak, bo finalne tez sa niesatyczne. taka niepisana zasada
        List<Gif> gifs11 =gifRepository.getAllGifts();

       modelMap.put("gifs3", gifs11);
//nasza wartosc gifs2 do  wartosci listy czyli
    //2. przekazanie figa do view
        return "home";
    }


    @RequestMapping("/favorites")
    public String gifFavorites(ModelMap modelMap){
List<Gif> gifs = gifRepository.getFavoritesGifs();
modelMap.put("gifs", gifs);
        return "favorites";
    }


}
