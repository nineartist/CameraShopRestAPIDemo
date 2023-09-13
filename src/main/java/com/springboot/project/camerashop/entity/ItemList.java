package com.springboot.project.camerashop.entity;

import jakarta.persistence.*;

@Entity
@Table(name="item_list")
public class ItemList {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="item_name")
    private String itemName;

    @Column(name="owner")
    private String owner;

    @Column(name="contact")
    private String contact;

    // define constructor
    public ItemList() {

    }

    public ItemList(String itemName, String owner, String contact) {
        this.itemName = itemName;
        this.owner = owner;
        this.contact = contact;
    }


    // Define Getter Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    // define toString


    @Override
    public String toString() {
        return "ItemList{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", owner='" + owner + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
