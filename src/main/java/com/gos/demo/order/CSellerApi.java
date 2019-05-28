package com.gos.demo.order;

import com.gos.demo.seller.Order;
import com.gos.demo.seller.Seller;

import java.util.Arrays;
import java.util.List;

public class CSellerApi implements OrderFinder {


    @Override
    public List<Order> find() {
        return Arrays.asList(new Order(Seller.C, 1L,"C-ITEM"), new Order(Seller.C, 2L,"C-ITEM"), new Order(Seller.C, 3L,"C-ITEM"), new Order(Seller.C, 4L,"C-4-ITEM"));
    }
}
