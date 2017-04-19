package com.christang;


public class Food {

    private Integer foodId;
    private String foodName;
    private String foodType;
    private String foodDescription;

    public Food() {
    }

    public Food(Integer foodId, String foodName, String foodType, String foodDescription) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodDescription = foodDescription;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
}
