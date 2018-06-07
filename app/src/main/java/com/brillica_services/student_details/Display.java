package com.brillica_services.student_details;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Display extends AppCompatActivity {
    ArrayList<Student> stu;
    ListView result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listlayout);
        TextView tv1=(TextView)findViewById(R.id.tv1);
        TextView tv2=(TextView)findViewById(R.id.tv2);
        TextView tv3=(TextView)findViewById(R.id.tv3);
        tv1.setText(getIntent().getExtras().getString("name"));
        tv2.setText(getIntent().getExtras().getString("course"));
        tv3.setText(getIntent().getExtras().getString("fees"));
    }
}
