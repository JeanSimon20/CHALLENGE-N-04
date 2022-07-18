package com.ms.pedido.vallegrande.domain;

import org.springframework.stereotype.Component;

@Component
public class StockHystrixFallbackFactory implements StockClient{
    @Override
    public Stock findItemById(String id) {
        return null;
    }
}
