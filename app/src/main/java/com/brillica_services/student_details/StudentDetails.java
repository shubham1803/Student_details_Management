package com.brillica_services.student_details;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentDetails extends AppCompatActivity{

    EditText name;
    EditText course;
    EditText fees;
    Button submit;
    Button display;
    Button display_other;
    ListView result;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    ArrayList<Student> obj=new ArrayList<Student>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentdetails);
        name=(EditText)findViewById(R.id.name);
        course=(EditText)findViewById(R.id.course);
        fees=(EditText)findViewById(R.id.fees);
        submit=(Button)findViewById(R.id.submit);
        display=(Button)findViewById(R.id.display);
        display_other=(Button)findViewById(R.id.display_other);
        result=(ListView)findViewById(R.id.list);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname=String.valueOf(name.getText());
                String scourse=String.valueOf(course.getText());
                double sfees=Double.parseDouble(String.valueOf(fees.getText()));
                obj.add(new Student(sname,scourse,sfees));

            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentAdapter adapter=new StudentAdapter(StudentDetails.this,R.layout.listlayout,obj);
                result.setAdapter(adapter);
                }


        });
        display_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentDetails.this,Display.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("course",course.getText().toString());
                intent.putExtra("fees",fees.getText().toString());
                startActivity(intent);


            }
        });
    }
}
