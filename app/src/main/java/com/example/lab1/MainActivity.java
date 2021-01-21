package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    EditText eName;
    Button bClick;
    TextView tName;
    TextView popupText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = (EditText) findViewById(R.id.eName);
        bClick = (Button) findViewById(R.id.bClick);
        tName = (TextView) findViewById(R.id.tName);
        popupText = (TextView) findViewById(R.id.popupText);
    }

    public void clicked(View view){
        switch (view.getId()){
            case R.id.bClick:
                String name = eName.getText().toString();
                tName.setText("Hello, " + name + "!");
                //popupText.setText("Hello, " + name + "!");

                // create popup_layout window
                PopupWindow popup = new PopupWindow();
                popup.showPopupWindow(view, name);;

                break;
        }
    }
}