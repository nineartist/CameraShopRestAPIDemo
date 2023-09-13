package com.springboot.project.camerashop.service;

import com.springboot.project.camerashop.dao.ItemListRepository;
import com.springboot.project.camerashop.entity.ItemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CameraShopServiceImpl implements CameraShopService {

    private ItemListRepository itemListRepository;

    @Autowired
    public CameraShopServiceImpl(ItemListRepository theItemListRepository) {
        itemListRepository = theItemListRepository;
    }
    @Override
    public List<ItemList> findAll() {
        return itemListRepository.findAll();
    }

    @Override
    public ItemList findById(int theId) {
        Optional<ItemList> result =  itemListRepository.findById(theId);
        ItemList theItem = null;

        if (result.isPresent()){
            theItem = result.get();
        } else {
            throw new RuntimeException("Did not found item id - "+ theId);
        }
        return theItem;
    }

    @Override
    public ItemList save(ItemList theItem) {
        return itemListRepository.save(theItem);
    }

    @Override
    public void deleteById(int theId) {
        itemListRepository.deleteById(theId);

    }
}
