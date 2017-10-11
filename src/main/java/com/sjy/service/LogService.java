package com.sjy.service;

import com.sjy.response.Log;

import java.util.List;


public interface LogService {
    List<Log> getAllLog(Integer page, Integer size);
    
    int sum();
}
