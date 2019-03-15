package com.nazwafirmy.demokwejk.data;

import com.nazwafirmy.demokwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




@Component
public class GifRepository {
                    //obiekt git, rownie dobrze, mzoe byc string lub int lub twoj stary
 public final static List<Gif> ALL_GIFS = Arrays.asList(
   new Gif("infinite-andrew","damian",true,1),
   new Gif("cowboy-coder","marcin",false,1),
   new Gif("compiler-bot","karmowski",false,1),
   new Gif("book-dominos","pawlo",true,1)
 );

    public static List<Gif> getFavoritesGifs() {

        List<Gif> favorites = new ArrayList<>();

        for (Gif gif : ALL_GIFS) {

            if (gif.getFavorite()== true) ;

            favorites.add(gif);

        }

        return favorites;

    }

 public static List<Gif> getAllGifts(){
     return ALL_GIFS;
 }

}
