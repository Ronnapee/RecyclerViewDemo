package solution.devdd.recyclerviewdemo.recycleradapter;

import solution.devdd.recyclerviewdemo.recyclerconfig.ViewType;

public class CardViewItem extends BaseItem{
    private int cardViewImage;
    private String cardViewText;

    public CardViewItem(){
        super(ViewType.TYPE_CARD_VIEW);
    }

    public int getImage() {
        return cardViewImage;
    }

    public CardViewItem setImage(int cardViewImage) {
        this.cardViewImage = cardViewImage;
        return this;
    }

    public String getText() {
        return cardViewText;
    }

    public CardViewItem setText(String cardViewText) {
        this.cardViewText = cardViewText;
        return this;
    }
}
