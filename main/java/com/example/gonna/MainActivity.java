package com.example.gonna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String event = "找老師";
    private String event2 = "期末考";
   private static final String TAG = "cool";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button search_btn = (Button) findViewById(R.id.search_button); //利用物件id定位
        Button feed_btn = (Button) findViewById(R.id.feed_button);
        List<Calendar_data>cal_data = new ArrayList<>();

        cal_data.add(new Calendar_data(event, 1));
        cal_data.add(new Calendar_data(event2, 2));
        cal_data.add(new Calendar_data(event, 3));
        cal_data.add(new Calendar_data(event2, 4));
        cal_data.add(new Calendar_data(event, 5));
        cal_data.add(new Calendar_data(event2, 6));
        cal_data.add(new Calendar_data(event, 7));
        cal_data.add(new Calendar_data(event2, 1));

      /*  search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(); //宣告一個意圖
                intent.setClass(MainActivity.this, Event.class);
                startActivity(intent);
            }
        });*/

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.calendar_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this,7));
        recyclerView.setAdapter(new cal_adapter(this, cal_data));
    }

    private class cal_adapter extends RecyclerView.Adapter<cal_adapter.cal_ViewHolder> {

        private Context context;
        private List<Calendar_data> data;

        cal_adapter(Context context, List<Calendar_data> list) {
            this.context = context;
            this.data = list;
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
        @Override  //初始化Adapter  onCreateViewHolder：調用R.layout建立View，以此建立一個新的ViewHolder
        public cal_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.activity_calendar_data, parent, false);
            return new cal_adapter.cal_ViewHolder(view);
        }


        @SuppressLint("SetTextI18n")
        @Override //onBindViewHolder：透過position找到data，以此設置ViewHolder裡的View
        public void onBindViewHolder(@NonNull cal_adapter.cal_ViewHolder holder, int position) {
            Calendar_data cal_data = data.get(position);
            holder.Date.setText(Integer.toString(cal_data.get_date()));

        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }
}

