package com.example.admin.w4d3recyclerviewtest;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by evin on 4/19/16.
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    private ArrayList<String> mArrayList;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private static final String TAG = "SimpleAdapterTAG_";
        public final TextView textViewName;
        public String value;

        public ViewHolder(final View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.r_item_text);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), value, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(v.getContext(), SecondActivity.class);
                    intent.putExtra("VALUE", value);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }

    public SimpleAdapter(ArrayList<String> arrayList) {
        this.mArrayList = arrayList;
    }

    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View termView = inflater.inflate(R.layout.recycler_item, parent, false);

        return new ViewHolder(termView);
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.ViewHolder holder, int position) {
        String string = mArrayList.get(position);

        TextView textViewName = holder.textViewName;
        textViewName.setText(string);
        holder.value = string;
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

}
