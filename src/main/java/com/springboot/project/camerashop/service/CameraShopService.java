package com.springboot.project.camerashop.service;

import com.springboot.project.camerashop.entity.ItemList;

import java.util.List;

public interface CameraShopService {

    List<ItemList> findAll();

    ItemList findById(int theId);

    ItemList save(ItemList theItem);

    void deleteById(int theId);
}
