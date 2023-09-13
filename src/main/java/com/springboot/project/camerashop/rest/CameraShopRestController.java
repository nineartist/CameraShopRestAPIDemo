package com.springboot.project.camerashop.rest;

import com.springboot.project.camerashop.entity.ItemList;
import com.springboot.project.camerashop.service.CameraShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class CameraShopRestController {

    private CameraShopService cameraShopService;

    public CameraShopRestController(CameraShopService theCameraShopService) {
        cameraShopService = theCameraShopService;
    }

    //Expose "/cameraItem" and return a list of camera
    @GetMapping("/cameraItem")
    public List<ItemList> findAll() {
        return cameraShopService.findAll();
    }

    // add get mapping for find by id
    @GetMapping("/cameraItem/{itemId}")
    public ItemList getEmployee(@PathVariable int itemId){
        ItemList theItem = cameraShopService.findById(itemId);

        if (theItem == null) {
            throw new RuntimeException("Item id not found - "+ itemId);
        }

        return theItem;
    }

    // Add mapping for POST cameraItem as Add new item
    @PostMapping("/cameraItem")
    public ItemList addItem(@RequestBody ItemList theItem) {

        theItem.setId(0);

        ItemList dbItem = cameraShopService.save(theItem);

        return dbItem;
    }


    // Add mapping for put method to update item data
    @PutMapping("/cameraItem")
    public ItemList updateItem(@RequestBody ItemList theItem) {
        ItemList dbItem = cameraShopService.save(theItem);

        return dbItem;
    }

    // Add mapping to delete item
    @DeleteMapping("/cameraItem/{itemId}")
    public String deleteItem(@PathVariable int itemId){
        ItemList tempItem = cameraShopService.findById(itemId);

        if (tempItem == null) {
            throw new RuntimeException("Item Id not found " + itemId);
        }

        cameraShopService.deleteById(itemId);

        return "Deleted item id -" + itemId;
    }



}
