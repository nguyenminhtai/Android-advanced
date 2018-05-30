package edu.eiu.tourist_app;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TouristRecyclerAdapter extends RecyclerView.Adapter<TouristRecyclerAdapter.TouristViewHolder> {
    private List<String> items;

    public TouristRecyclerAdapter (List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public TouristViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        TouristViewHolder viewHolder = new TouristViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TouristViewHolder holder, int position) {
        holder.bindView(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class TouristViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public TouristViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }

        private void bindView(String itemText) {
            textView.setText(itemText);
        }
    }

}
