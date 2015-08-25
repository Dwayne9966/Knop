package com.example.dwayne.knop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class number4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);
    }

    Integer[] integers = Number.getRandomNumbers();
    public void twoloud(View view) {Intent intent = new Intent(getApplicationContext(),Number.class);
        intent.putExtra("number", integers[0]);        startActivity(intent);
    }
}
