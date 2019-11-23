package ru.mirea.gudzhal.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk, btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.btnCancel);

         View.OnClickListener oclBtnOk = new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, OkActivity.class);
                startActivity(intent);
            }
        };
        btnOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, CancelActivity.class);
                startActivity(intent);
            }
        };
        btnCancel.setOnClickListener(oclBtnCancel);
    }

}
