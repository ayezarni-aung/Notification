package com.azna.notification_channel;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final String CHANNEL_ID="simple_notification";
    private final int NOTIFICATION_ID=01;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void simpleNotification(View view) {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,CHANNEL_ID);
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setContentTitle("Notification");
        builder.setContentText("Hello guy, I am a Notification");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat managerCompat=NotificationManagerCompat.from(this);
        managerCompat.notify(NOTIFICATION_ID,builder.build());
    }
}

