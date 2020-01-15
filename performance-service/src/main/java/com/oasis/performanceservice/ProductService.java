package com.oasis.performanceservice;

import com.oasis.performancebase.ResultRes;
import com.oasis.performancedao.Product;
import com.oasis.performancedao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;
    public ResultRes<List<Product>> findAll(){
        List<Product> products = productDao.findAll();
        if(CollectionUtils.isEmpty(products)){
            return ResultRes.error(101,"无有效数据");
        }
        System.out.println(products);
        return ResultRes.success(products);
    }
}
