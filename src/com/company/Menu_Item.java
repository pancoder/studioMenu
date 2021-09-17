package com.company;

public class Menu_Item {
//
//    private Map<String, Double> itemName;
//
//    public Menu_Item(String name, double price) {
//
//        this.itemName = new HashMap<>();
//        this.itemName.put(name, price);
//        Date date = new Date();
//    }

    private String description;
        private String price;
        private boolean isNew;
        private String category;

        public Menu_Item(String category, String description, String price, boolean isNew){
            this.category = category;
            this.description = description;
            this.price = price;
            this.isNew = isNew;
        }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }



}
//// ilyane's approach
//    private String description;
//    private String price;
//    public MenuItem(String category; String description; String price){
//        this.category = category;
//        this.description = description;
//        this.price = price;
//    }



