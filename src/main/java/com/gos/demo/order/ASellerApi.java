package com.gos.demo.order;

import com.gos.demo.seller.Order;
import com.gos.demo.seller.Seller;

import java.util.Arrays;
import java.util.List;

public class ASellerApi implements OrderFinder {

    @Override
    public List<Order> find() {
        return Arrays.asList(new Order(Seller.A, 1L,"A-ITEM"), new Order(Seller.A, 2L,"A-ITEM"), new Order(Seller.A, 3L,"A-ITEM"), new Order(Seller.A, 4L,"A-4-ITEM"));
    }
}
