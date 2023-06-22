package com.example.cryptocoin;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.cryptocoin.model.coindetails.CoinDetails;
import com.example.cryptocoin.model.CryptoCoin;
import com.example.cryptocoin.network.coindetailsnetwork.CoinDetailsApi;
import com.example.cryptocoin.network.coindetailsnetwork.CoinDetailsService;
import com.example.cryptocoin.network.cryptocoinnetwork.CryptoCoinApi;
import com.example.cryptocoin.network.cryptocoinnetwork.CryptoCoinService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void getCryptoCoins() throws IOException {
        CryptoCoinApi cryptoCoinApi = new CryptoCoinApi();
        CryptoCoinService cryptoCoinService = cryptoCoinApi.createCryptoCoinService();
        Call<List<CryptoCoin>> call = cryptoCoinService.fetchCryptoCoins();
        List<CryptoCoin> cryptoCoinList = call.execute().body();
        assertNotNull(cryptoCoinList);
        assertFalse(cryptoCoinList.isEmpty());
        System.out.println(new Gson().toJson(cryptoCoinList));
    }

    @Test
    public void getCoinDetails() throws IOException {
        CoinDetailsApi coinDetailsApi = new CoinDetailsApi();
        CoinDetailsService coinDetailsService = coinDetailsApi.createCoinDetailsService();
        Call<CoinDetails> call = coinDetailsService.fetchCoinDetails("btc-bitcoin");
        CoinDetails coinDetailsList = call.execute().body();
        assertNotNull(coinDetailsList);
        System.out.println(new Gson().toJson(coinDetailsList));
    }
}