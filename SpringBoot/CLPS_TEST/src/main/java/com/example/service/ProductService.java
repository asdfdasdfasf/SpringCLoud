package com.example.service;

import com.example.dao.ProductDao;
import com.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/22 13:34
 */
@Service
public class ProductService {
    @Autowired
    private ProductDao dao;

    public List<Product> getList(){
        return dao.listProduct();
    }
}
