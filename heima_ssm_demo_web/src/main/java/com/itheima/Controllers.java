package com.itheima;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class Controllers {
    @Controller
    @RequestMapping("/product")
    private class ProductController {
        @Autowired
        private ProductService productService;

        @RequestMapping("/findAll")
        public ModelAndView findDetail() {
            ModelAndView mv = new ModelAndView();
            List<Product> products = productService.findAll();
            mv.addObject("productList", products);
            mv.setViewName("product-list");
            return mv;
        }
    }
}