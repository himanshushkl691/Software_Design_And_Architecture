package com.example.sharingapp;

public class ContactController {
    private Contact contact;
    public ContactController(Contact contact){
        this.contact = contact;
    }
    public String getId(){
        return this.contact.getId();
    }
    public void setId(){
        this.contact.setId();
    }
    public void updateId(String id){
        this.contact.updateId(id);
    }
    public String getUsername(){
        return this.contact.getUsername();
    }
    public void setUsername(String username){
        this.contact.setUsername(username);
    }
    public String getEmail(){
        return this.contact.getEmail();
    }
    public void setEmail(String email){
        this.contact.setEmail(email);
    }
}
