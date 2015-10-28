package com.tixon.backtothefutureexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText from, to;

    Exchange exchange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exchange = new Exchange(getResources().getStringArray(R.array.dollars), getResources().getStringArray(R.array.pounds));
        exchange.setYearIndex(1);

        from = (EditText) findViewById(R.id.currency_from);
        to = (EditText) findViewById(R.id.currency_to);

        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fromCurrency = Double.parseDouble(from.getText().toString());
                double toCurrency = exchange.dollarsFromRubles(fromCurrency);
                to.setText(String.valueOf(toCurrency));
            }
        });

        startActivity(new Intent(this, ControlPanelActivity.class));
    }
}
