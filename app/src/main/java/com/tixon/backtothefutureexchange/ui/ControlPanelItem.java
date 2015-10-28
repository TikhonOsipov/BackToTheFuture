package com.tixon.backtothefutureexchange.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.tixon.backtothefutureexchange.R;

public class ControlPanelItem extends RelativeLayout {

    public static final int GREEN = 1;
    public static final int YELLOW = 2;
    public static final int RED = 3;

    private EditText etMonth, etDay, etYear, etHour, etMinute;

    public ControlPanelItem(Context context) {
        super(context);
        init();
    }

    public ControlPanelItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ControlPanelItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout view = (RelativeLayout) inflater.inflate(R.layout.control_panel, this, true);

        etMonth = (EditText) view.findViewById(R.id.et_month);
        etDay = (EditText) view.findViewById(R.id.et_day);
        etYear = (EditText) view.findViewById(R.id.et_year);
        etHour = (EditText) view.findViewById(R.id.et_hour);
        etMinute = (EditText) view.findViewById(R.id.et_minute);

        etMonth.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "ds_digit_font.ttf"));
        etDay.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "ds_digit_font.ttf"));
        etYear.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "ds_digit_font.ttf"));
        etHour.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "ds_digit_font.ttf"));
        etMinute.setTypeface(Typeface.createFromAsset(getResources().getAssets(), "ds_digit_font.ttf"));
    }

    public void setTextColor(int colorIndex) {
        switch (colorIndex) {
            case GREEN:
                //set green
                setColorForEditTexts(getResources().getColor(R.color.green));
                break;
            case YELLOW:
                //set yellow
                setColorForEditTexts(getResources().getColor(R.color.yellow));
                break;
            case RED:
                //set red
                setColorForEditTexts(getResources().getColor(R.color.red));
                break;
            default: break;
        }
    }

    //set colors for each editText
    private void setColorForEditTexts(int color) {
        etMonth.setTextColor(color);
        etDay.setTextColor(color);
        etYear.setTextColor(color);
        etHour.setTextColor(color);
        etMinute.setTextColor(color);
    }
}
