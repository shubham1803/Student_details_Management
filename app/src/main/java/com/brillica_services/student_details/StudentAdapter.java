package com.brillica_services.student_details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {

   private Context mcontext;
   int mResourse;
    public StudentAdapter(Context context,int resource,ArrayList<Student> student){
        super(context,resource,student);
        mcontext=context;
        mResourse=resource;
    }
    public View getView(int position, View convertView, ViewGroup parent){
       String name=getItem(position).getName();
       String course=getItem(position).getCourse();
       double fees=getItem(position).getFees();
       Student student=new Student(name,course,fees);
       LayoutInflater inflater=LayoutInflater.from(mcontext);
       convertView=inflater.inflate(mResourse,parent,false);

        TextView tv1=(TextView)convertView.findViewById(R.id.tv1);
        TextView tv2=(TextView)convertView.findViewById(R.id.tv2);
        TextView tv3=(TextView)convertView.findViewById(R.id.tv3);
        tv1.setText(name);
        tv2.setText(course);
        tv3.setText(String.valueOf(fees));
        return convertView;

    }

}
