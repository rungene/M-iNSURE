package com.rungene.m_insure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button britam,heritage,uap,icea,madison;
        //declaration - global
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find views  by ids
        britam = (Button) findViewById(R.id.britam);
        heritage = (Button) findViewById(R.id.heritage);
        uap= (Button) findViewById(R.id.uap);
        madison = (Button) findViewById(R.id.madison);
        icea = (Button) findViewById(R.id.icea);

        //objects can listen to actions

        uap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent glues together the activities
                Intent intent = new Intent(MainActivity.this,UAPActivity.class);
                startActivity(intent);
                //finish();


            }
        });//end
        britam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });//end
        heritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent glues together the activities
                Intent intent = new Intent(MainActivity.this,HeritageActivity.class);
                startActivity(intent);
                //finish();

                //TextView
            }
        });//end
        madison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent glues together the activities
                Intent intent = new Intent(MainActivity.this,MadisonActivity.class);
                startActivity(intent);
                //finish();


            }
        });//end
  /*      icea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent glues together the activities
                Intent intent = new Intent(MainActivity.this,ICEAActivity.class);
                startActivity(intent);
                //finish();


            }
        });//end*/
  icea.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent = new Intent(MainActivity.this,ICEAActivity.class);
          startActivity(intent);
      }
  });

    }//end
}//end
