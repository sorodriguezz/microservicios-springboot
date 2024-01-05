package com.wannacode.bookingmicroservice.dto;

import com.wannacode.bookingmicroservice.entity.OrderItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderDto {
    private List<OrderItem> orderItemList;
}
