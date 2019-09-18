package com.quming;

import com.quming.entity.Order;
import com.quming.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QumingQuickApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    public void contextLoads() {
        List<Order> orders = orderService.selectAllOrder();
        orders.forEach(order -> {
            System.out.println(String.format("订单id：%d,订单状态：%d",order.getOrderId(),order.getOrderState()));
        });
    }

}
