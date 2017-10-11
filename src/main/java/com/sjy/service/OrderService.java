package com.sjy.service;

import com.sjy.response.OrderDetailResponse;
import com.sjy.response.StatisticsOfSale;

import java.util.List;



public interface OrderService {
     List<OrderDetailResponse> getAllOrder(Integer page, Integer size);
     
     StatisticsOfSale get(int pId);
     
     List<OrderDetailResponse> search(String searchType, String searchContent);
     
     Integer sum();
}
