package solution.devdd.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import solution.devdd.recyclerviewdemo.recycleradapter.BaseItem;
import solution.devdd.recyclerviewdemo.recycleradapter.CardViewItem;
import solution.devdd.recyclerviewdemo.recycleradapter.MainAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter = new MainAdapter();
        adapter.setItemList(createItem());
        recyclerView.setAdapter(adapter);
    }

    private List<BaseItem> createItem() {
        List<BaseItem> itemList = new ArrayList<>();
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher)
                .setText("Hello World"));
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher_round)
                .setText("Hello RecyclerView"));
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher)
                .setText("Hello Android"));
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher)
                .setText("Hello World"));
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher_round)
                .setText("Hello RecyclerView"));
        itemList.add(new CardViewItem()
                .setImage(R.mipmap.ic_launcher)
                .setText("Hello Android"));
        return itemList;
    }
}
