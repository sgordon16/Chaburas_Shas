package sgordon16.student.touro.edu.chaburashashas;

import java.util.Calendar;

import net.sourceforge.zmanim.hebrewcalendar.Daf;
import net.sourceforge.zmanim.hebrewcalendar.JewishCalendar;

public class ChaburasHaShas {

    private Calendar cal;
    private Calendar tempCal = Calendar.getInstance();
    private JewishCalendar jcal;

    public ChaburasHaShas(Calendar cal) {
        this.cal = cal;
        this.jcal = new JewishCalendar(cal);
    }
    public ChaburasHaShas() {
        cal = Calendar.getInstance();
        jcal = new JewishCalendar(cal);
    }
    public Daf getTodaysDaf() {
        return jcal.getDafYomiBavli();
    }
    public Daf getYesterdayDaf() {
        tempCal.setTime(cal.getTime());
        tempCal.add(Calendar.DATE, -1);
        jcal.setDate(tempCal);
        return jcal.getDafYomiBavli();
    }
    public Daf getDay7Daf() {
        tempCal.setTime(cal.getTime());
        tempCal.add(Calendar.DATE, -7);
        jcal.setDate(tempCal);
        return jcal.getDafYomiBavli();
    }
    public Daf getDay30Daf() {
        tempCal.setTime(cal.getTime());
        tempCal.add(Calendar.DATE, -30);
        jcal.setDate(tempCal);
        return jcal.getDafYomiBavli();
    }
    public Daf getDay90Daf() {
        tempCal.setTime(cal.getTime());
        tempCal.add(Calendar.DATE, -90);
        jcal.setDate(tempCal);
        return jcal.getDafYomiBavli();
    }
    public Daf getLastyearsDaf() {
        tempCal.setTime(cal.getTime());
        tempCal.add(Calendar.DATE, -365);
        jcal.setDate(tempCal);
        return jcal.getDafYomiBavli();
    }
}
