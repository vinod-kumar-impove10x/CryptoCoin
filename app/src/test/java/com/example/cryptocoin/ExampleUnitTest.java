package com.example.cryptocoin;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.cryptocoin.model.CryptoCoin;
import com.example.cryptocoin.network.CryptoCoinApi;
import com.example.cryptocoin.network.CryptoCoinService;
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
    public void getPeopleGenerateUsers() throws IOException {
        CryptoCoinApi cryptoCoinApi = new CryptoCoinApi();
        CryptoCoinService cryptoCoinService = cryptoCoinApi.createCryptoCoinService();
        Call<List<CryptoCoin>> call = cryptoCoinService.fetchCryptoCoins();
        List<CryptoCoin> cryptoCoinList = call.execute().body();
        assertNotNull(cryptoCoinList);
        assertFalse(cryptoCoinList.isEmpty());
        System.out.println(new Gson().toJson(cryptoCoinList));
    }
}