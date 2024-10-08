package com.fsd2425.projectback.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private String ingredients;
    private String photo;

  
    public User() {}

    
    public User(String name, double price, int quantity, String description, String ingredients, String photo) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.ingredients = ingredients;
        this.photo = photo;
    }

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

	@Override
	public String toString() {
		return ("{\"id\":\""+id+
				"\",\n\"name\":\""+ name+
				"\",\n\"price\":\""+price+
				"\",\n\"quantity\":\""+quantity+
				"\",\n\"description\":\""+description+
				"\",\n\"ingredients\":\""+ingredients+
				"\",\n\"photo\":\""+photo+
				"\"}");
	}
}
