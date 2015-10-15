package com.example.luda.a00717133_assignment2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class historyMenu extends ActionBarActivity{
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ListView lv;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_menu);

        /*instantiate list*/
        lv = (ListView)findViewById(R.id.list);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        /*anonymous class*/
        @Override
        public void onItemClick(final AdapterView<?> parent,
                                final View itemView,
                                final int position,
                                final long id)
            {
                final TextView item;
                item = (TextView) itemView;

                switch(position){
                    case 0:
                    {
                        i = new Intent(historyMenu.this, history.class);
                        startActivity(i);
                        break;
                    }
                    case 1:
                    {
                        Toast.makeText(historyMenu.this, "No transactions in " + item.getText()
                                + ".", Toast.LENGTH_LONG).show();
                        break;
                    }
                    case 2:
                    {
                        Toast.makeText(historyMenu.this, "No transactions in " + item.getText()
                                + ".", Toast.LENGTH_LONG).show();
                        break;
                    }
                    case 3:
                    {
                        Toast.makeText(historyMenu.this, "No transactions in " + item.getText()
                                + ".", Toast.LENGTH_LONG).show();
                        break;
                    }
                    case 4:
                    {
                        Toast.makeText(historyMenu.this, "No transactions in " + item.getText()
                                + ".", Toast.LENGTH_LONG).show();
                        break;
                    }
                    case 5:
                    {
                        Toast.makeText(historyMenu.this, "No transactions in " + item.getText()
                                + ".", Toast.LENGTH_LONG).show();
                        break;
                    }
                    default: {
                        break;
                    }
                }//end switch case
            }//end onItemClick method
        });//end anonymous class
    }//end onCreate method

    /*method for button*/
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.home: {
                i = new Intent(this, mainMenu.class);
                startActivity(i);
                break;
            }
            default:
            {
                break;
            }
        }//end switch case
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_history_menu, menu);
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
