package com.mobiledev.makeapp.utils.arrayUtils;


/**
 * Created by manu on 2/22/2018.
 */

public class ArrayUtils {

    String[] brandList = {"almay", "anna sui", "annabelle", "benefit",
            "burt's bees", "butter london", "cargo cosmetics", "china glaze", "clinique", "covergirl",
            "dalish", "dior", "dr. hauschka", "e.l.f.", "essie", "fenty", "glossier", "iman", "l'oreal",
            "marcelle", "maybelline", "milani", "mineral fusion", "misa", "mistura", "moov", "nyx",
            "orly", "pacifica", "physicians formula", "piggy paint", "pure anada", "revlon", "salon perfect",
            "sante", "sinful colours", "smashbox", "stila", "suncoat", "wet n wild", "zorah"};

    String[] tagList = {"Canadian" ,"Dairy Free","Fair Trade" , "Gluten Free" ,"Natural" , "Non-GMO" ,
            "Organic" , "Peanut Free Product", "Sugar Free" , "Vegan"};

    String[] typeList = {"blush", "Bronzer", "Eyebrow", "Eyeliner", "Eyeshadow", "Foundation", "Lip liner", "Lipstick", "Mascara", "Nail polish"};

    public String[] getTagList(){
        return  tagList;
    }

    public String[] getBrandList(){
        return  brandList;
    }

    public String[] getTypeList(){
        return  typeList;
    }
}
