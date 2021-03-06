package solution.devdd.recyclerviewdemo.recycleradapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import solution.devdd.recyclerviewdemo.R;
import solution.devdd.recyclerviewdemo.holder.BaseViewHolder;
import solution.devdd.recyclerviewdemo.holder.CardViewHolder;
import solution.devdd.recyclerviewdemo.recyclerconfig.ViewType;

public class MainAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<BaseItem> itemList = new ArrayList<>();

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;

        if (viewType == ViewType.TYPE_CARD_VIEW) {
            v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            return new CardViewHolder(v);
        }

        throw new RuntimeException("type is not match");
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        BaseItem i = itemList.get(position);
        if (holder instanceof CardViewHolder) {
            CardViewItem cardViewItem = (CardViewItem) i;
            ((CardViewHolder) holder).setImage(cardViewItem.getImage());
            ((CardViewHolder) holder).setText(cardViewItem.getText());
        }
    }

    @Override
    public int getItemCount() {
        if (!itemList.isEmpty() || itemList != null) {
            return itemList.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getType();
    }

    public void setItemList(List<BaseItem> itemList) {
        this.itemList = itemList;

        notifyDataSetChanged();
    }
}
