package com.example.sharingapp;

import android.graphics.Bitmap;

/**
 * ItemController is responsible for all communication between views and Item object
 */
public class ItemController {
    private Item item;
    public ItemController(Item item)
    {
        this.item = item;
    }
    public String getId(){
        return this.item.getId();
    }
    public void setId(){
        this.item.setId();
    }
    public void setTitle(String title){
        this.item.setTitle(title);
    }
    public String getTitle(){
        return this.item.getTitle();
    }
    public void setMaker(String maker){
        this.item.setMaker(maker);
    }
    public String getMaker(){
        return this.item.getMaker();
    }
    public void setDescription(String description){
        this.item.setDescription(description);
    }
    public String getDescription(){
        return this.item.getDescription();
    }
    public void setDimensions(String length,String width,String height){
        this.item.setDimensions(length,width,height);
    }
    public String getLength(){
        return this.item.getLength();
    }
    public String getWidth(){
        return this.item.getWidth();
    }
    public String getHeight(){
        return this.item.getHeight();
    }
    public void setStatus(String status){
        this.item.setStatus(status);
    }
    public String getStatus(){
        return this.item.getStatus();
    }
    public void setBorrower(Contact borrower){
        this.item.setBorrower(borrower);
    }
    public Contact getBorrower(){
        return this.item.getBorrower();
    }
    public void addImage(Bitmap new_image){
        this.item.addImage(new_image);
    }
    public Bitmap getImage(){
        return this.item.getImage();
    }
    public Item getItem(){
        return this.item;
    }
    public void addObserver(Observer observer){
        this.item.addObserver(observer);
    }
    public void removeObserver(Observer observer){
        this.item.removeObserver(observer);
    }
}