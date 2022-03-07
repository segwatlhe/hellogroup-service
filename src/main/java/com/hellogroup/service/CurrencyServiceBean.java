package com.hellogroup.service;

import com.hellogroup.model.Test;
import com.hellogroup.repository.MeetingDetailsRepository;
import com.hellogroup.repository.ParticpantRepository;
import com.hellogroup.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class CurrencyServiceBean implements CurrencyService {

    // private ModelMapper modelMapper = new ModelMapper();
    final TestRepository testRepository;
    final ParticpantRepository particpantRepository;
    final MeetingDetailsRepository meetingDetailsRepository;

    public CurrencyServiceBean(TestRepository testRepository, ParticpantRepository particpantRepository, MeetingDetailsRepository meetingDetailsRepository) {
        this.testRepository = testRepository;
        this.particpantRepository = particpantRepository;
        this.meetingDetailsRepository = meetingDetailsRepository;
    }

    @Override
    public String latestRates() {
        // latest rates
        String latest = null;
        try {
            String url = "https://freecurrencyapi.net/api/v2/latest?apikey=f28e9f00-2d7a-11ec-9771-cfa941141e65";
            URL urlForGetRequest = new URL(url);
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            int responseCode = conection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
                latest = response.toString();
                // System.out.println(response.toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return latest;
    }

    @Override
    public Test testApi2(Test test) {
        testRepository.save(test);
        return test;
    }
}
