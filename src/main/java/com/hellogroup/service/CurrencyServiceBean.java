package com.hellogroup.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class CurrencyServiceBean implements CurrencyService{

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
}
