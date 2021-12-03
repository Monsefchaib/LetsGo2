package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.letsgo.dao.LoginDao;
import com.example.letsgo.model.User;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    Button letsgo_button;
    ImageView imageView;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annonces);

        imageView=findViewById(R.id.imageView3);

        letsgo_button=findViewById(R.id.buttonT);
        letsgo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("auth","Auth");
                try {
                    user=new LoginDao().execute().get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                Intent intent = new Intent (MainActivity.this, DetailsAnnonce.class);
//                startActivity(intent);
            }
        });
    }
}

