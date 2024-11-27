package com.example.myapplication.config;

import okhttp3.OkHttpClient;


public class OkHttpConfiguration {

    //your configuration of the OkHttpClient goes here:
    private OkHttpClient createClient() {
        return new OkHttpClient.Builder().build();
    }
}