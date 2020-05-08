package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainButton = findViewById(R.id.button);
        mainButton.setBackgroundColor(Color.GREEN);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Appuyé", Toast.LENGTH_LONG).show();
            }
        });
        People NouvellePersonne = new People("tom","Ramin",12,181);
       /* NouvellePersonne.setAge(12);
        NouvellePersonne.setFirstName("Tom");
        NouvellePersonne.setLastName("Ramin");
        NouvellePersonne.setSize(181);*/
        showBaseError();
    }

    @Override
    public void showList(List<People> list) {

    }

    @Override
    public void showLoader() {

    }

    @Override
    public void showError() {

    }
}
