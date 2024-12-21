package com.example.springbootapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    @RequestMapping("/api/v1/getUserDetails")
    public ResponseEntity<Map<String, String>> getUserDetails() {
        Map<String, String> response = new HashMap<>();
        response.put("userId", "12345");
        response.put("name", "John Doe");
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/api/v1/updateUser", method = RequestMethod.POST)
    public ResponseEntity<String> updateUser(Map<String, String> user) {
        return ResponseEntity.ok("User updated: " + user.get("name"));
    }

    @RequestMapping("/api/v1/getProductDetails")
    public ResponseEntity<Map<String, String>> getProductDetails() {
        Map<String, String> response = new HashMap<>();
        response.put("productId", "67890");
        response.put("productName", "Product A");
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/api/v1/submitOrder", method = RequestMethod.POST)
    public ResponseEntity<String> submitOrder(Map<String, String> orderDetails) {
        return ResponseEntity.ok("Order submitted for product ID: " + orderDetails.get("productId"));
    }
}
