package com.andani.animesh.androidhive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SingleContactActivity extends ActionBarActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_contact);

    t1=(TextView)findViewById(R.id.name);
        t2=(TextView)findViewById(R.id.email);
        t3=(TextView)findViewById(R.id.mobile);
        Intent intent=getIntent();
        if(intent!=null)
        {
            String name=intent.getStringExtra("NAME");
            String email=intent.getStringExtra("EMAIL");
            String num=intent.getStringExtra("MOBILE");
            t1.setText(name);
            t2.setText(email);
            t3.setText(num);
        }




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single_contact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
