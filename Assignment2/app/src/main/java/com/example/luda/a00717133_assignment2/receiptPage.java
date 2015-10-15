package com.example.luda.a00717133_assignment2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class receiptPage extends ActionBarActivity {
    private TextView textout, randNum;
    private Intent i;
    private Random r = new Random();
    private int rand = (r.nextInt(8000) + 654321);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_page);

        randNum = (TextView) findViewById(R.id.receiptNum);
        textout = (TextView) findViewById(R.id.display);

        getMessage();
    }
    /*get intent messages from payBills.class*/
    public void getMessage(){
        final String payee,amount;

        i = getIntent();
        payee = i.getStringExtra("payee");
        amount = i.getStringExtra("amount");

        randNum.setText("Your reciept number is:\n " + rand);
        textout.setText("You paid $" + amount + ""
                + " to " + payee + ".");
    }
    /*method for button*/
    public void onClick(View v){
        switch(v.getId()){
            case R.id.home: {
                i = new Intent(this, mainMenu.class);
                startActivity(i);
                break;
            }
            default: {
                break;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_receipt_page, menu);
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
