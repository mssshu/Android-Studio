package com.example.luda.a00717133_assignment2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class payBills extends ActionBarActivity {
    private Intent i;
    private EditText name,amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bills);
        name = (EditText) findViewById(R.id.payee);
        amount = (EditText) findViewById(R.id.amount);
    }
    /*button class*/
    public void onClick(View v){
        switch(v.getId()){
            case R.id.payBtn: {
                if (isEmpty(name) || isEmpty(amount)) {
                    Toast.makeText(this, "Please complete all fields.",
                            Toast.LENGTH_LONG).show();
                    break;
                } else {
                    messages();
                    break;
                }
            }
            case R.id.home: {
                i = new Intent(this, mainMenu.class);
                startActivity(i);
                break;
            }
            default:{
                break;
            }
        }//end switch case
    }
    /*put messages into receiptPage.class*/
    public void messages(){
        final String nm,amt;
        i = new Intent(this, receiptPage.class);
        nm = name.getText().toString();
        amt = amount.getText().toString();
        i.putExtra("payee", nm);
        i.putExtra("amount", amt);
        startActivity(i);
    }
    /*empty string method*/
    private boolean isEmpty(EditText myeditText) {
        return myeditText.getText().toString().trim().length() == 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pay_bills, menu);
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
