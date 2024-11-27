package com.example.myapplication.service;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FCMService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    // 一旦token有变化，onNewToken方法就会被回调
    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.e(TAG, "new token " + token);
    }

    @Override
    public void onMessageReceived(RemoteMessage message) {
        super.onMessageReceived(message);
        if (message.getNotification() == null) {
            Log.e(TAG, "Data Title: " + message.getData().get("title"));
            Log.e(TAG, "Data Body: " + message.getData().get("body"));
            Log.e(TAG, "Data data: " + message.getData().get("data"));
        } else {
            Log.e(TAG, "Notify Title :" + message.getNotification().getTitle());
            Log.e(TAG, "Notify Body :" + message.getNotification().getBody());
            Log.e(TAG, "Notify data: " + message.getData());
        }
    }

    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
        Log.e(TAG, "onDeletedMessages");
    }
}
