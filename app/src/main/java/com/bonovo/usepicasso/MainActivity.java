package com.bonovo.usepicasso;

import android.content.Context;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RemoteViews;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Context context;
    public static String[] imageUrls = {
            "http://i.imgur.com/rFLNqWI.jpg",
            "http://i.imgur.com/C9pBVt7.jpg",
            "http://i.imgur.com/rT5vXE1.jpg",
            "http://i.imgur.com/aIy5R2k.jpg",
            "http://i.imgur.com/MoJs9pT.jpg",
            "http://i.imgur.com/S963yEM.jpg",
            "http://i.imgur.com/rLR2cyc.jpg",
            "http://i.imgur.com/SEPdUIx.jpg",
            "http://i.imgur.com/aC9OjaM.jpg",
            "http://i.imgur.com/76Jfv9b.jpg",
            "http://i.imgur.com/fUX7EIB.jpg",
            "http://i.imgur.com/syELajx.jpg",
            "http://i.imgur.com/COzBnru.jpg",
            "http://i.imgur.com/Z3QjilA.jpg",
    };

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        imageView = (ImageView) findViewById(R.id.Image_IV);

        String Url1 = "http://i.imgur.com/rFLNqWI.jpg";
       /* final String Url2 = "http://i.imgur.com/COzBnru.jpg";
       // int resourceid = R.mipmap.dragon;
       //  File file =new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),"picturename.jpg");
        //三种基本加载方式，①：从网络上的URL地址加载，②：从本地mipmap或者drawable中加载，③：从本地存储文件中加载


        Picasso
                .with(context)
                .load(Url1)
                .placeholder(R.mipmap.dragon)
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        Picasso
                                .with(context)
                                .load(Url2)
                                .noPlaceholder()
                                .into(imageView);
                    }

                    @Override
                    public void onError() {

                    }
                });*/







      lv = (ListView) findViewById(R.id.list_LV);
        lv.setAdapter(new ImageListAdapter(context,imageUrls));
         /* lv.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                final  Picasso picasso = Picasso.with(context);

                if (scrollState == SCROLL_STATE_IDLE||scrollState == SCROLL_STATE_TOUCH_SCROLL){
                    picasso.resumeTag("Profile ListView");
                }else {
                    picasso.pauseTag("Profile ListView");
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });*/

    }


    public void testRemoteViewNotification(){
        RemoteViews remoteViews = new RemoteViews(getPackageName(),R.layout.item_picasso);
         //remoteViews.setImageViewResource();



    }
}
