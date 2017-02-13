package com.mukesh.xmlparsingwithratrofit;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 13-02-2017.
 */

public class FoodAdapter extends BaseAdapter {
    Context context;
    List<Food> food;

    FoodAdapter(Context context, List<Food> food) {
        this.context = context;
        this.food = food;
    }

    @Override
    public int getCount() {
        return food.size();
    }

    @Override
    public Object getItem(int position) {
        return food.get(position);
    }

    @Override
    public long getItemId(int position) {
        return food.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_foodName = (TextView) convertView.findViewById(R.id.tv_foodName);
            viewHolder.txtDesc = (TextView) convertView.findViewById(R.id.tv_foodDesc);
            viewHolder.tv_foodPrice = (TextView) convertView.findViewById(R.id.tv_foodPrice);
            viewHolder.tv_foodCalorise = (TextView) convertView.findViewById(R.id.tv_foodCalorise);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // food rowItem = (food) getItem(position);
        viewHolder.tv_foodName.setText(food.get(position).name);
        viewHolder.txtDesc.setText(food.get(position).description);
        viewHolder.tv_foodPrice.setText(food.get(position).price);
        viewHolder.tv_foodCalorise.setText(food.get(position).calories);
        return convertView;
    }

    /*private view holder class*/
    private class ViewHolder {
        TextView tv_foodName;
        TextView txtDesc;
        TextView tv_foodPrice;
        TextView tv_foodCalorise;
    }

}
