package com.gos.demo.order;

import com.gos.demo.seller.Order;
import com.gos.demo.seller.Seller;

import java.util.Arrays;
import java.util.List;

public class BSellerApi implements OrderFinder {

    @Override
    public List<Order> find() {
        return Arrays.asList(new Order(Seller.B, 1L,"B-ITEM"), new Order(Seller.B, 2L,"B-ITEM"), new Order(Seller.B, 3L,"B-ITEM"), new Order(Seller.B, 4L,"B-4-ITEM"));
    }
}
