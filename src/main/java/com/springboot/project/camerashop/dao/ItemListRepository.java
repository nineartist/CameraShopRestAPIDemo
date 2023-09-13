package com.springboot.project.camerashop.dao;

import com.springboot.project.camerashop.entity.ItemList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemListRepository extends JpaRepository<ItemList, Integer> {
}
