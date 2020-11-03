package com.example.fakeemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Email> listEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listEmail=new ArrayList<>();
        int n=30;
        this.generateEmail(n);
        String[] sss=new String[n];
        EmailAdapter adapter = new EmailAdapter(this,listEmail,sss);

        ListView listView =(ListView) findViewById(R.id.listMail);
        listView.setAdapter(adapter);
    }

    private void generateEmail(int n){
        Faker faker=new Faker(new Locale("vi"));
        for (int i=0;i<n;i++){
            Email e=new Email();
            e.setName(faker.name().fullName());
            e.setMess(faker.gameOfThrones().quote());
            e.setH(faker.number().numberBetween(0,12));
            e.setM(faker.number().numberBetween(0,59));
            e.setIcon(faker.number().numberBetween(0,1),faker.number().numberBetween(0,3));
            e.setIdColor(faker.number().numberBetween(0,9));
            listEmail.add(e);
        }
    }
}