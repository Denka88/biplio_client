package org.example.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpService {

    private static OkHttpClient client = new OkHttpClient();

    public static String get(String url) {
        String result = "";
        Request request = new Request
                .Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Запрос к серверу не был успешен: " + response.code() + " " + response.message());
            }
            result = response.body().string();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            return result;
        }
    }

}
