package com.hellogroup.controller;

import com.hellogroup.dto.TestDTO;
import com.hellogroup.model.Test;
import com.hellogroup.service.CurrencyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/hellogroup")
public class CurrencyController {

    final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    // curl -X POST --header "Content-Type: application/json" --header "Accept: application/json" -d @test.json "http://localhost:8080/api/hellogroup/test"
//    @PostMapping(value = "/test")
//    public TestDTO benny(@RequestBody TestDTO testDTO) {
//        System.out.println("BENNY");
//        return currencyService.testApi(testDTO);
//    }

    @PostMapping(value = "/test")
    public Test benny2(@RequestBody Test test) {
        System.out.println("BENNY");
        return currencyService.testApi2(test);
    }

//    @PostMapping(value = "/rates")
//    public String latestRates() {
//        return this.currencyService.latestRates();
//    }

}
