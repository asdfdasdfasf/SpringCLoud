package com.example.dao;

import com.example.entity.Product;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface ProductDao {

    List<Product> listProduct();
}
