package com.example.martnear;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.HashMap;

public class ExpandListAdapter extends BaseAdapter {


    String [] item;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;

    public ExpandListAdapter(Context context, String[] item, int[] imageId) {
       this.context = context;
       this.item = item;
       this.imageId = imageId;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }





    public class Holder
    {
        TextView item_name;
        ImageView item_image;
        ImageView expand_list;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        View view;
        view = inflater.inflate(R.layout.expand_carview, null);

        holder.item_name=(TextView) view.findViewById(R.id.expandText);
        holder.item_image=(ImageView) view.findViewById(R.id.expandImage);
        holder.expand_list = view.findViewById(R.id.expandList);
        holder.item_name.setText(item[position]);
        Picasso.with(context).load(imageId[position]).into(holder.item_image);
        Picasso.with(context).load(R.drawable.ic_expand_more).placeholder(R.drawable.ic_expand_more).into(holder.expand_list);
        return view;
    }
}
