package com.example.gonna;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        List<Feed_detail>  detail = new ArrayList<>();
        //int pic = R.mipmap.ic_launcher;
        Resources res;
        res = getResources();
        Drawable drawable = ResourcesCompat.getDrawable(res, R.mipmap.ic_launcher, null);
        detail.add(new Feed_detail("成功大學電機系館", "_yang1029", "thu", "OCT", 2020, drawable));
        detail.add(new Feed_detail("台南一中", "fong27_","thu", "OCT", 2021, drawable));
        detail.add(new Feed_detail("成功大學電機系館", "parker","wed", "MAY", 2023, drawable));
        detail.add(new Feed_detail("台中一中", "erichuang","thu", "OCT", 2026, drawable));
        detail.add(new Feed_detail("卓別林", "tzjnn","thu", "OCT", 2022, drawable));
        detail.add(new Feed_detail("屏東", "williamchergan","thu", "OCT", 2027, drawable));
        detail.add(new Feed_detail("漁光島", "kevin0910b","thu", "OCT", 2028, drawable));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.feed_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new Feed_adapter(this, detail));
    }


    private class Feed_adapter extends RecyclerView.Adapter<Feed_adapter.ViewHolder> {

        private Context context;
        private List<Feed_detail> detail;

        Feed_adapter(Context context, List<Feed_detail> detail) {
            this.context = context;
            this.detail = detail;
        }

        @Override  //初始化Adapter  onCreateViewHolder：調用R.layout建立View，以此建立一個新的ViewHolder
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.actitviy_feed_detail, parent, false);
            return new Feed_adapter.ViewHolder(view);
        }

        @SuppressLint("SetTextI18n")
        @Override //onBindViewHolder：透過position找到data，以此設置ViewHolder裡的View
        public void onBindViewHolder(@NonNull Feed_adapter.ViewHolder holder, int position) {
            final Feed_detail data = detail.get(position);
            holder.loc.setText(data.get_loc());
            holder.name.setText(data.get_name());
            holder.date.setText(data.get_day()+ ", " + data.get_mon() +", "+ data.get_yrs());
            holder.profile.setImageDrawable(data.get_pic());
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView loc, name, date;
            de.hdodenhof.circleimageview.CircleImageView profile;
            Button like, comment, share, accept, collect, option;
            ViewHolder(@NonNull View itemView) {
                super(itemView);

                loc = (TextView) itemView.findViewById(R.id.loc_text); //找到detail裡的Textview
                name = (TextView) itemView.findViewById(R.id.name_text);
                date = (TextView) itemView.findViewById(R.id.time_text);
                accept = (Button) itemView.findViewById(R.id.accept);
                like = (Button) itemView.findViewById(R.id.like);
                comment = (Button) itemView.findViewById(R.id.comment);
                share = (Button) itemView.findViewById(R.id.share);
                collect = (Button) itemView.findViewById(R.id.collection);
                option = (Button) itemView.findViewById(R.id.option);
                profile = (de.hdodenhof.circleimageview.CircleImageView) itemView.findViewById(R.id.profile_image);

                collect.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                collect.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }

        }
        @Override
        public int getItemCount() {
            return detail.size();
        }
    }
}


