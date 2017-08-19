package com.example.devanshu.notifier;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationCompat.Builder notification;
    private static final int uniqueID = 54656;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);

    }

    public void notify(View view){

        notification.setSmallIcon(R.mipmap.devanshu);
        notification.setTicker("You have been warned!");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Notification Popup");
        notification.setContentText("The Champ is HERE!!");

        Intent intent = new Intent(this , MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0 , intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pi);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID , notification.build());

    }

}
