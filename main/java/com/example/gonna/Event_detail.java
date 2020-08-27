package com.example.gonna;
import android.graphics.drawable.Drawable;
import android.util.EventLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

//Event的class
public class Event_detail {
        private String event;
        public Event_detail(){
            super();
        }
        public Event_detail(String events) {
            super();
            this.event = events;
        }
        public String get_event(){
            return event;
        }
}
