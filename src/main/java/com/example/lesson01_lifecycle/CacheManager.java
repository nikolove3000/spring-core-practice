package com.example.lesson01_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CacheManager {

    /**
     * Initializes new cache
     */
    @PostConstruct
    private void init() {

        System.out.println("Khởi tạo cache...");
    }

    /**
     * Cleans up cache pre destroy
     */
    @PreDestroy
    private void cleanUp() {

        System.out.println("Xóa cache...");
    }

}
