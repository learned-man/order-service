package com.dmall.orderservice.adapter.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

//TODO change to use feign client
@FeignClient(value = "inventory-service" )
public interface InventoryClient {
    @PostMapping("/inventories/lock")
    String lock(Lock lock);

    @PutMapping("/inventories/lock/{lockId}")
    void unlock(@PathVariable("lockId") String lockId);
}
