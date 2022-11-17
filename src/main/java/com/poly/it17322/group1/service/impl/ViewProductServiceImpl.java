/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17322.group1.service.impl;

import com.poly.it17322.group1.custommodel.ViewProductCustomModel;
import com.poly.it17322.group1.repository.ProductRepository;
import com.poly.it17322.group1.service.ViewProductService;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class ViewProductServiceImpl implements ViewProductService{

    private ProductRepository productRepository = new ProductRepository();
    
    @Override
    public List<ViewProductCustomModel> getAll() {
        return productRepository.getAll();
    }
    
}
