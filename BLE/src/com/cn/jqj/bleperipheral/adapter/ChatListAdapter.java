package com.cn.jqj.bleperipheral.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import com.cn.jqj.bleperipheral.datas.MsgData;

/**
 * Created by jqj on 2016/5/24.
 *
 */
public final class ChatListAdapter extends BaseAdapter {
    private List<MsgData> list;
    private Context mContext;

    public ChatListAdapter(List<MsgData> list, Context context) {
        this.list = list;
        this.mContext = context;
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView=new TextView(mContext);
        textView.setText(list.get(position).getMessage());
        return textView;
    }
}
