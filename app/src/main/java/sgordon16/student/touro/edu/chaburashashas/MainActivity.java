package sgordon16.student.touro.edu.chaburashashas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.sourceforge.zmanim.hebrewcalendar.Daf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChaburasHaShas ch = new ChaburasHaShas();
        Daf todaysDaf = ch.getTodaysDaf();
        Daf yeserdaysDaf = ch.getYesterdayDaf();
        Daf Day7Daf = ch.getDay7Daf();
        Daf Day30Daf = ch.getDay30Daf();
        Daf Day90Daf = ch.getDay90Daf();
        Daf lastYearsDaf = ch.getLastyearsDaf();

        TextView view1 = findViewById(R.id.todaysDaf_txt);
        TextView view2 = findViewById(R.id.yesterdaysDaf_txt);
        TextView view3 = findViewById(R.id.lastWeeksDaf_txt);
        TextView view4 = findViewById(R.id.lastMonthsDaf_txt);
        TextView view5 = findViewById(R.id.day90Daf_txt);
        TextView view6 = findViewById(R.id.lastYearsDaf_txt);

        view1.setText(todaysDaf.getMasechtaTransliterated() + " " + todaysDaf.getDaf());
        view2.setText(yeserdaysDaf.getMasechtaTransliterated() + " " + yeserdaysDaf.getDaf());
        view3.setText(Day7Daf.getMasechtaTransliterated() + " " + Day7Daf.getDaf());
        view4.setText(Day30Daf.getMasechtaTransliterated() + " " + Day30Daf.getDaf());
        view5.setText(Day90Daf.getMasechtaTransliterated() + " " + Day90Daf.getDaf());
        view6.setText(lastYearsDaf.getMasechtaTransliterated() + " " + lastYearsDaf.getDaf());
    }
}
