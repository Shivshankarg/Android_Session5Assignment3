package com.shivshankar.session5assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button big,andr,ioss,node,front,cor,adv,cloudc,mango,apache;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        big=(Button)findViewById(R.id.big);
        andr=(Button)findViewById(R.id.andr);
        ioss=(Button)findViewById(R.id.ios);
        node=(Button)findViewById(R.id.nodjs);
        front=(Button)findViewById(R.id.front);
        cor=(Button)findViewById(R.id.corej);
        adv=(Button)findViewById(R.id.advj);
        cloudc=(Button)findViewById(R.id.cloud);
        mango=(Button)findViewById(R.id.mang);
        apache=(Button)findViewById(R.id.apachi);

        big.setOnClickListener(this);
        andr.setOnClickListener(this);
        ioss.setOnClickListener(this);
        node.setOnClickListener(this);
        front.setOnClickListener(this);
        cor.setOnClickListener(this);
        adv.setOnClickListener(this);
        cloudc.setOnClickListener(this);
        mango.setOnClickListener(this);
        apache.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        intent=new Intent(this,MentorName.class);
        Bundle bundle=new Bundle();
        switch (view.getId())
        {
            case R.id.big:
                bundle.putString("course","Big data & Hadoop Development");
               bundle.putString("mentor","Mr. Anuj");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.andr:
                bundle.putString("course","Android Development");
                bundle.putString("mentor","Mr. Vankyatramana");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.ios:
                bundle.putString("course","IOS");
                bundle.putString("mentor","Mr. Andy");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.nodjs:
                bundle.putString("course","Node.js");
                bundle.putString("mentor","Mrs. Vankyat");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.corej:
                bundle.putString("course","Core Java");
                bundle.putString("mentor","Mrs. Priyanka");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.advj:
                bundle.putString("course","Advance Java");
                bundle.putString("mentor","Mr. Shiv");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.front:
                bundle.putString("course","Front end Web Development");
                bundle.putString("mentor","Mr. Vankyat");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.cloud:
                bundle.putString("course","Cloud Computing");
                bundle.putString("mentor","Mrs. Kaur");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mang:
                bundle.putString("course","MangoDB");
                bundle.putString("mentor","Mr. Wasim");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.apachi:
                bundle.putString("course","Apache Spark");
                bundle.putString("mentor","Mr. Jonn");
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }

    }
}
