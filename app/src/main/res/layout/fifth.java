package com.example.riabirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class fifth extends AppCompatActivity {
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;

    private LinearLayout activity_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);



            final Button test = (Button) findViewById(R.id.abhi);
            test.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    layoutInflater=(LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                    View popupView=layoutInflater.inflate(R.layout.popup,null);
                    final PopupWindow popupWindow =  new PopupWindow(popupView,400,400,true);
                    Button dismiss=(Button)popupView.findViewById(R.id.dismiss);
                    dismiss.setOnClickListener(new Button.OnClickListener(){

                        @Override
                        public void onClick(View v) {
                            // TODO Auto-generated method stub
                            popupWindow.dismiss();
                        }});

                    popupWindow.showAsDropDown(test, 50, -30);

                }}); }

    public void next4(View view){
        Intent intent=new Intent(this,sixth.class);
        startActivity(intent);


    }

    }



