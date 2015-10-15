package com.example.luda.a00717133_assignment2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class assignment2 extends ActionBarActivity implements View.OnClickListener {
    private Button b;
    private EditText name, pass;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);

        b = (Button) findViewById(R.id.logIn);
        b.setOnClickListener(this);
        name = (EditText) findViewById(R.id.name);
        pass = (EditText) findViewById(R.id.password);
    }
    /*button method*/
    public void onClick(View v){
        if(v == b) {
            if (isEmpty(name) || isEmpty(pass)) {
                Toast.makeText(this, "Please complete all fields.",
                        Toast.LENGTH_LONG).show();
            } else {
            i = new Intent(this, mainMenu.class);
            startActivity(i);
            }
        }
    }
    /*empty string method*/
    private boolean isEmpty(EditText myeditText) {
        return myeditText.getText().toString().trim().length() == 0;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_assignment2, menu);
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
