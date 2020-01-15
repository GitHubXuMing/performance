package com.oasis.performanceweb;

import com.oasis.performancebase.ResultRes;
import com.oasis.performancedao.Product;
import com.oasis.performanceservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductAction {
    @Autowired
    ProductService productService;
    @GetMapping("findAll.do")
    public ResultRes findAll(){
        return productService.findAll();
    }
}
