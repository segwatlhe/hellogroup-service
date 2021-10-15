package com.hellogroup.service;

import org.springframework.stereotype.Component;

@Component
public interface CurrencyService {
    String latestRates();
}
