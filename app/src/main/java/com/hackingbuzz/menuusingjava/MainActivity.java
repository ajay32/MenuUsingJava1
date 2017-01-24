package com.hackingbuzz.menuusingjava;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);

        menu.add(0, 1, 2, "RED");
        menu.add(0, 2, 3, "GREEN");
        menu.add(0, 3, 4, "CYAN");
        menu.add(0,4,1,"Yellow").setIcon(R.drawable.i);
        menu.add(0, 5, 5, "PINK");
        menu.add(0,6,6,"CLOSE");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rla);

        switch (item.getItemId()) {

            case 1: rl.setBackgroundColor(Color.RED); break;
            case 2: rl.setBackgroundColor(Color.GREEN); break;
            case 3:  rl.setBackgroundColor(Color.CYAN); break;
            case 4: rl.setBackgroundColor(Color.YELLOW); break;
            case 5: rl.setBackgroundColor(Color.BLUE); break;
            case 6: finish(); break;
            default: rl.setBackgroundColor(Color.BLACK); break;
        }


        return super.onOptionsItemSelected(item);
    }
}
