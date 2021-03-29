package com.example.androidmusicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class SendMessageActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view)
    {
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view)
    {
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view)
    {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickPlaylist(View view)
    {
        MainActivity.redirectActivity(this, PlaylistActivity.class);
    }

    public void ClickSendMessage(View view)
    {
        recreate();
    }

    public void  ClickLogout(View view)
    {
        MainActivity.logout(this);
    }

    protected void onPause()
    {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }
}