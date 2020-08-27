package com.example.gonna;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class Event_adapter extends RecyclerView.Adapter<Event_adapter.ViewHolder> {

        private Context context;
        private List<Event_detail> event_detail;
        //每個類標配的建構函式
        public Event_adapter(Context context, List<Event_detail>list) {
            this.context = context;
            this.event_detail = list;
        }
        //這裡的是ImageView和TextView縱向排列的佈局
        static class ViewHolder extends RecyclerView.ViewHolder {
            TextView fruitName;

            public ViewHolder(View view){
                super(view);
                //fruitName = (TextView) view.findViewById(R.id.fruit_name_top);
            }
        }

        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.activity_event, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }


        public void onBindViewHolder(ViewHolder holder, int position) {
                Event_detail event = event_detail.get(position);
                //holder.fruitImage.setImageResource(fruit.getImageId());
                holder.fruitName.setText(event.get_event());
            }

        public int getItemCount() {
            return event_detail.size();
        }

    }
