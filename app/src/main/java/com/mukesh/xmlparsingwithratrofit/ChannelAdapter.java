package com.mukesh.xmlparsingwithratrofit;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 13-02-2017.
 */

public class ChannelAdapter extends BaseAdapter {
    Context context;
    List<Channel.Item> list;

    ChannelAdapter(Context context, List<Channel.Item> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return list.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tv_Desc = (TextView) convertView.findViewById(R.id.tv_Desc);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tv_title.setText(list.get(position).getTitle());
        viewHolder.tv_Desc.setText(Html.fromHtml(list.get(position).getDescription()).toString());
        return convertView;
    }

    /*private view holder class*/
    private class ViewHolder {
        TextView tv_title;
        TextView tv_Desc;

    }

}
