package com.example.projet;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

abstract class BaseActivity extends AppCompatActivity  implements MainInterface {

        public void showBaseError(){
            Toast.makeText(this, "Erreur", Toast.LENGTH_LONG).show();
        }
}
