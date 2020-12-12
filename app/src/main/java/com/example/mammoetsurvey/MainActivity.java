package com.example.mammoetsurvey;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText km, desc;
    private ImageView photo, scr;
    private DatabaseReference mDataBase;
    private String Metka = "Metka";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        km = findViewById(R.id.km);
        desc = findViewById(R.id.desc);
        photo = findViewById(R.id.photo);
        scr = findViewById(R.id.scr);
        mDataBase = FirebaseDatabase.getInstance().getReference(Metka);

    }

    public void OnClickSave(View view){
        String id = mDataBase.getKey();
        String Km = km.getText().toString();
        String Desc = desc.getText().toString();
        Image Photo = photo.getI;

    }

    public void OnClickRead(View view){

    }
}