package com.yadavsk.csjm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class website_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website_item);
    }

    public void MyResult(View view){

        openUrl("http://www.google.com");
    }

    public void MyCollege(View view){

        openUrl("http://www.google.com");
    }

    public void MyBteup(View view){

        openUrl("http://www.google.com");
    }

    private void openUrl(String url) {

        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
}