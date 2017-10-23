package com.sivaram.session15assignment1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 23/10/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<> {

    private ItemData[] itemData;

    public CustomAdapter(ItemData[] itemData) {
        this.itemData = itemData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.version_row,null);

        ViewHolder viewHolder = new ViewHolder(itemLayout);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView versionNameTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            versionNameTextView = (TextView) itemView.findViewById(R.id.versionNameTextView);

        }
    }
}
