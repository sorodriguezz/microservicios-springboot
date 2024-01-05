package com.wannacode.bookingmicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// este nombre se saca desde el spring.application.name de la 2da aplicacion
@FeignClient(name = "stock-microservice")
public interface StockClient {

    @RequestMapping("/api/stock/{code}")
    boolean stockAvailable(@PathVariable String code);
}
