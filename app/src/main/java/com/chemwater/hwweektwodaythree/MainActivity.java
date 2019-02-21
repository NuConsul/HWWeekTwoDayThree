package com.chemwater.hwweektwodaythree;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView ;

public class MainActivity extends Activity {

    TextView tvOne, tvTwo, tvThree, tvFour, tvFive ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne = (TextView) findViewById(R.id.tvFirstView) ;
        tvTwo = (TextView) findViewById(R.id.tvSecondView) ;
        tvThree = (TextView) findViewById(R.id.tvThirdView) ;
        tvFour = (TextView) findViewById(R.id.tvFourthView) ;
        tvFive = (TextView) findViewById(R.id.tvFifthView) ;

    }




}




/*
Use localization to make 5 different translations for 5 different strings.
Display the 5 strings to 5 different textviews
Play around with view attributes for textView
 */