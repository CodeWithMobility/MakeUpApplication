package com.mobiledev.makeapp.data.model;

import java.util.List;

import lombok.Data;

/**
 * Created by manu on 2/18/2018.
 */

@Data
public class ProductModel {

    private int id;
    private String brand;
    private String name;
    private String price;
    private String price_sign;
    private String currency;
    private String image_link;
    private String product_link;
    private String website_link;
    private String description;
    private Object rating;
    private String category;
    private String product_type;
    private String created_at;
    private String updated_at;
    private String product_api_url;
    private String api_featured_image;
    private List<?> tag_list;
    private List<ProductColorsBean> product_colors;
}

