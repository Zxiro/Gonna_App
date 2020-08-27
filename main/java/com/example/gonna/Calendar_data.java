package com.example.gonna;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Calendar_data {
    private String[] event;
    private int date;
    /*private int getMonthLastDay(int year, int month) {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);//把日期設定為當月第一天
        a.roll(Calendar.DATE, -1);//日期回滾一天，也就是最後一天
        return a.get(Calendar.DATE);
    }*/
    public Calendar_data(){
        super();
    }
    public Calendar_data( String[] event, int date){
        super();
        this.date = date;
        this.event = event;
    }
    public int get_date(){
        return date;
    }
    /*public void requestData() {
        int last_state = 0;
        int state_count = 0;
        ArrayList<Calendar_data> datas = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int currYear = calendar.get(Calendar.YEAR);
        int currMouth = calendar.get(Calendar.MONTH) + 1;
        int currDay = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(year, month - 1, 0);

        int i1 = calendar.get(Calendar.DAY_OF_WEEK);
        if (i1 > 6)//如果大於6天，也就是一個星期的天數，就不用新增，否則顯示一行空白
            i1 = 0;

        for (int i = 0; i < i1; i++) {
            datas.add(new Calendar_data(true));
        }

        for (int i = 0; i < getMonthLastDay(year, month); i++) {
            Calendar_data data = new Calendar_data();
            if (currYear == year && currMouth == month && currDay == i + 1)
                data.setToday(true);
            data.setState(new Random().nextInt(4));//設定這一天的狀態的
            if (last_state == 0) {
                last_state = data.getState();
                state_count = 1;
            } else if (last_state == data.getState()) {
                ++state_count;
                datas.get(i + i1 - 1).setState_count(state_count);
                data.setState_count(state_count);
            } else {
                last_state = data.getState();
                state_count = 1;
            }
            datas.add(data);
        }
    }*/
}
