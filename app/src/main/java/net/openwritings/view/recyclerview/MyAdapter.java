package net.openwritings.view.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    //--------------- MyViewHolder implementation starts here ---------------------
    // Provide definition of what it holds and allow MyAdapter
    //  to access all the data.
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public Button button; // Give MyAdapter access.

        public MyViewHolder(Button btn) {
            super(btn);
            this.button = btn;
        }
    }

    //--------------- MyAdapter implementation starts here ---------------------
    private ArrayList<String> dataSet; // Data source.

    public MyAdapter(ArrayList<String> dataSet) {
        this.dataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Create a new button and put it in the ViewHolder for shipping to the Layout Manager.
        Button btn = new Button(parent.getContext());
        MyViewHolder myViewHolder = new MyViewHolder(btn);
        return myViewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // How do you want to update the content.
        //  MyAdapter access member(button) of MyViewHolder.
        holder.button.setText(this.dataSet.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return this.dataSet.size();
    }
}