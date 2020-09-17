package com.example.pruebalist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin",
            "Gerardo", "Carlos", "David", "Sofía"};
    private String edades [] = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//ya hice otra prueba que ondas te sale 123456
        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.texview, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i] + " años" );
            }
        });
    }
}