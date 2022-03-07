package com.hellogroup.service;

import com.hellogroup.dto.TestDTO;
import com.hellogroup.model.Test;
import org.springframework.stereotype.Component;

@Component
public interface CurrencyService {
    String latestRates();
    Test testApi2(Test test);
}
