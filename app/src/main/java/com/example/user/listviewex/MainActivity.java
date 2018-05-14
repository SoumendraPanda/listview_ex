package com.example.user.listviewex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lview=findViewById(R.id.lview);
        String path="/storage/sdcard0/";
        File f=new File(path);
        if(!f.exists())
        {
            path="/storage/emulated/0/" ;
            f=new File(path);

        }
        String[]files=f.list();
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,files);
        lview.setAdapter(adapter);

    }
}
