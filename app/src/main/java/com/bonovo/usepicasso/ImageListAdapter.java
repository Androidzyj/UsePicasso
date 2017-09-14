package com.bonovo.usepicasso;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2017/8/22.
 */

public class ImageListAdapter extends BaseAdapter {
    private Context context;

    private String[] imageUrls;

    public ImageListAdapter(Context context,String[] imageUrls){
         this.context = context;
          this.imageUrls = imageUrls;
    }




    @Override
    public int getCount() {
        return imageUrls.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = View.inflate(context,R.layout.item_picasso,null);
        }
        ImageView imageView = (ImageView) convertView;
        if (TextUtils.isEmpty(imageUrls[position])){
            Picasso
                    .with(context)
                    .cancelRequest(imageView);
            imageView.setImageDrawable(null);
        }else {
            Picasso
                    .with(context)
                    .load(imageUrls[position])
                    .into((ImageView) convertView);

        }

         Picasso
                  .with(context)
                 .setIndicatorsEnabled(true);

        return convertView;
    }
}
