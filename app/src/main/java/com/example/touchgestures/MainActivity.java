package com.example.touchgestures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onTouchEvent(MotionEvent motionEvent){
        int action = motionEvent.getActionMasked();
        switch (action){
            case(MotionEvent.ACTION_DOWN):
                Toast.makeText(this, "Action was DOWN", Toast.LENGTH_SHORT).show();
                return true;
            case(MotionEvent.ACTION_MOVE):
                Toast.makeText(this, "Action was MOVE", Toast.LENGTH_SHORT).show();
                return true;
            case(MotionEvent.ACTION_UP):
                Toast.makeText(this, "Action was UP", Toast.LENGTH_SHORT).show();
                return true;
            case(MotionEvent.ACTION_CANCEL):
                Toast.makeText(this, "Action was CANCEL", Toast.LENGTH_SHORT).show();
                return true;
            case(MotionEvent.ACTION_OUTSIDE):
                Toast.makeText(this, "Movement occurred outside bounds " +
                        "of current screen element", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onTouchEvent(motionEvent);

        }
    }

}