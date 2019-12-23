package com.starlord.calulatex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mikhaellopez.circularimageview.CircularImageView;

public class About extends AppCompatActivity {

    Button VisitBlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        VisitBlog = findViewById(R.id.visitBlog);
        VisitBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingthewarzone.blogspot.com"));
                startActivity(intent);
            }
        });

    }
}
