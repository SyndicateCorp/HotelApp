package com.syndicate.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://media-cdn.tripadvisor.com/media/photo-s/15/9d/e1/3e/double-six-luxury-hotel.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}