package net.openwritings.view.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // If you know that changes in content don't change the layout size,
        //  then set to true. RecyclerView will not waste time to recalculate the layout size.
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // MyAdapter is not yet implemented.
        myAdapter = new MyAdapter(this.getDataSet());
        recyclerView.setAdapter(myAdapter);
    }

    // Fetch data.
    private ArrayList<String> getDataSet(){
        ArrayList<String> longList = new ArrayList<String>();
        for(int i=0; i<400; i++)
            longList.add(String.valueOf(i));
        return longList;
    }
}