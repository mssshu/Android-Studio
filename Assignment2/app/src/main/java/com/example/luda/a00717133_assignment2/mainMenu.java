package com.example.luda.a00717133_assignment2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class mainMenu extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    /*buttons method*/
    public void onClick(View v){
        final Intent ii;
        final Class page;

        switch(v.getId()){
            case R.id.checkHistory: {
                page = historyMenu.class;
                break;
            }
            case R.id.payBills: {
                page = payBills.class;
                break;
            }
            case R.id.contactUs: {
                page = contactUs.class;
                break;
            }
            case R.id.logOut: {
                page = assignment2.class;
                break;
            }
            default:
            {
                page = null;
                break;
            }
        }
        ii = new Intent(this, page);
        startActivity(ii);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
