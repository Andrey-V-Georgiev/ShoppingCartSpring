package com.shopping_cart.models.service_models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductServiceModel extends BaseServiceModel {

    private String name;
    private String description;
    private String pictureUrl;
    private BigDecimal price;
    private LocalDateTime addedOn;

    public ProductServiceModel() {
    }

    public ProductServiceModel(String name, String description, String pictureUrl, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.price = price;
    }

    public ProductServiceModel(String name, String description, String pictureUrl, BigDecimal price, LocalDateTime addedOn) {
        this.name = name;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.price = price;
        this.addedOn = addedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDateTime addedOn) {
        this.addedOn = addedOn;
    }
}
