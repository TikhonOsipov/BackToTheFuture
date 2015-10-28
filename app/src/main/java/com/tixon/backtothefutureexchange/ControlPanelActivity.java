package com.tixon.backtothefutureexchange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tixon.backtothefutureexchange.ui.ControlPanelItem;

public class ControlPanelActivity extends AppCompatActivity {

    private ControlPanelItem destinationTime, presentTime, lastTimeDeparted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_panel_activity_layout);

        initPanel();
    }

    private void initPanel() {
        destinationTime = (ControlPanelItem) findViewById(R.id.destination_time_panel);
        presentTime = (ControlPanelItem) findViewById(R.id.present_time_panel);
        lastTimeDeparted = (ControlPanelItem) findViewById(R.id.last_time_departed_panel);

        destinationTime.setTextColor(ControlPanelItem.GREEN);
        presentTime.setTextColor(ControlPanelItem.YELLOW);
        lastTimeDeparted.setTextColor(ControlPanelItem.RED);
    }
}
