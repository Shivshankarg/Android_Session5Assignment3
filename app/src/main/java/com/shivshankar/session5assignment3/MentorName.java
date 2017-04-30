package com.shivshankar.session5assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MentorName extends AppCompatActivity {


    TextView textView,textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor_name);

        textView=(TextView)findViewById(R.id.mentor_name);
        textView1=(TextView)findViewById(R.id.course_name);
        //Intent intent=getIntent();
        //String s=intent.getStringExtra("msg");


        Bundle bundle=getIntent().getExtras();
        String c=bundle.getString("course");
        String m=bundle.getString("mentor");
        textView1.setText("Course Name= "+c);
        textView.setText("Mentor Name= "+m);
    }


    public void onBack(View view) {
       Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
