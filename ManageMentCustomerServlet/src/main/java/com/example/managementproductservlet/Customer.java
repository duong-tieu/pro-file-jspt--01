package com.example.managementproductservlet;

 class Customer {
     private String Name;
     private String birthDay;
     private String address;
     private String Picture = "img/default.png";

     public Customer(String name, String birthDay, String address, String picture) {
         Name = name;
         this.birthDay = birthDay;
         this.address = address;
         Picture = picture;
     }

     public String getName() {
         return Name;
     }

     public void setName(String name) {
         Name = name;
     }

     public String getBirthDay() {
         return birthDay;
     }

     public void setBirthDay(String birthDay) {
         this.birthDay = birthDay;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public String getPicture() {
         return Picture;
     }

     public void setPicture(String picture) {
         Picture = picture;
     }

     @Override
     public String toString() {
         return "Customer{" +
                 "Name='" + Name + '\'' +
                 ", birthDay='" + birthDay + '\'' +
                 ", address='" + address + '\'' +
                 ", Picture='" + Picture + '\'' +
                 '}';
     }
 }
