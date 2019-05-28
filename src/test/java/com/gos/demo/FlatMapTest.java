package com.gos.demo;

import com.gos.demo.order.ASellerApi;
import com.gos.demo.order.BSellerApi;
import com.gos.demo.order.CSellerApi;
import com.gos.demo.order.OrderFinder;
import com.gos.demo.seller.Order;
import com.gos.demo.seller.Seller;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class FlatMapTest {

    @Test
    public void testForNotUseFlatMap(){
        List<CompletableFuture<List<Order>>> sellerOrders =
                getOrders().stream()
                        .map(e-> CompletableFuture.supplyAsync((()->e.find())))
                        .collect(Collectors.toList());

        List<List<Order>> orders = sellerOrders.stream().map(CompletableFuture::join).collect(Collectors.toList());
        List<Order> completed = Lists.newArrayList();
        for (List<Order> each : orders){
            if (!CollectionUtils.isEmpty(each)) {completed.addAll(each);}
        }
        display(completed);

    }

    @Test
    public void testForUseFlatMap(){
        List<CompletableFuture<List<Order>>> sellerOrders =
                getOrders().stream()
                        .map(e-> CompletableFuture.supplyAsync((()->e.find())))
                        .collect(Collectors.toList());

        List<Order> orders = sellerOrders.stream().flatMap(f->f.join().stream()).collect(Collectors.toList());
        display(orders);
    }

    private void display(List<Order> orders) {
        orders.forEach(e->{
            System.out.println(e.getId() + " || " + e.getSeller() + " || " + e.getItem());
        });
    }


    private List<OrderFinder> getOrders() {
        return Lists.newArrayList(new ASellerApi(), new BSellerApi(), new CSellerApi());
    }
}
