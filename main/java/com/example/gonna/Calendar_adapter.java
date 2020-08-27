package com.example.gonna;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Calendar_adapter extends RecyclerView.Adapter<Calendar_adapter.ViewHolder> {

        private Context context;
        private List<Event_detail> event_detail;
        //每個類標配的建構函式
        public Calendar_adapter(Context context, List<Event_detail>list) {
            this.context = context;
            this.event_detail = list;
        }

        public class cal_ViewHolder extends RecyclerView.ViewHolder {
            TextView Date;
            ListView event_list;
            ListAdapter listAdapter;
            cal_ViewHolder(@NonNull View itemView) {
                super(itemView);
                Date = (TextView)itemView.findViewById(R.id.date);
                    /*event_list = (ListView) findViewById(R.id.event);
                    listAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, data);
                    event_list.setAdapter(listAdapter);*/
            }

        }
        public class event_ViewHolder extends RecyclerView.ViewHolder {
            TextView Event;
            ListView event_list;
            ListAdapter listAdapter;
            event_ViewHolder(@NonNull View itemView) {
                super(itemView);
                Event = (TextView)itemView.findViewById(R.id.event_content);
                    /*event_list = (ListView) findViewById(R.id.event);
                    listAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, data);
                    event_list.setAdapter(listAdapter);*/
            }

        }
        public Calendar_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.activity_event, parent, false);
            com.example.gonna.Event_adapter.ViewHolder holder = new com.example.gonna.Event_adapter.ViewHolder(view);
            return holder;
        }


        public void onBindViewHolder(com.example.gonna.Event_adapter.ViewHolder holder, int position) {
           
        }

        public int getItemCount() {
            return event_detail.size();
        }

    }

}
