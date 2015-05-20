package com.vishal.spidertask1.vishaltask1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainScreen extends ActionBarActivity {

    Button HelloButton1,HelloButton2;
    TextView HelloText,InfoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        HelloButton1 = (Button) findViewById(R.id.HelloButton1);
        HelloButton2 = (Button) findViewById(R.id.HelloButton2);
        HelloText = (TextView) findViewById(R.id.HelloText);
        InfoText = (TextView) findViewById(R.id.InfoText);

            HelloButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HelloText.setText("Hello World!");
                    InfoText.setText("Displays the required text");
                                            }
                                        }
        );
            HelloButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HelloText.setText(" ");
                    InfoText.setText("Erases the existing text");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
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
