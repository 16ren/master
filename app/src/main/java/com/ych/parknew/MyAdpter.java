package com.ych.parknew;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 2015/8/21.
 */

public class MyAdpter extends RecyclerView.Adapter<MyAdpter.ViewHolder> {

    private List<Park> parks;

    public MyAdpter(List<Park> parks) {
        this.parks = parks;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvname.setText(parks.get(position).getDescribe());
        holder.tvaddress.setText(parks.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        if (parks == null) {
            return 0;
        }
        return parks.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvname;
        public TextView tvaddress;
        public Button btopen;
        public Button btclose;

        public ViewHolder(View itemView) {
            super(itemView);
            tvaddress = (TextView) itemView.findViewById(R.id.tv_item_address);
            tvname = (TextView) itemView.findViewById(R.id.tv_item_name);
            btclose = (Button) itemView.findViewById(R.id.bt_item_close);
            btopen = (Button) itemView.findViewById(R.id.bt_item_open);
        }
    }
}
