/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.manager;

import java.util.ArrayList;
import com.shop.DAO.ProductDAO;

/**
 *
 * @author aoife
 */
import com.shop.model.Product;
public class ProductService {
    
     public ArrayList<Product> getHomePageProducts(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getTopProducts(6);
        
    }
    
}
