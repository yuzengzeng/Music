package com.vivo.yzz.music;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.vivo.yzz.music.music.Music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/25.
 */

public class MyApplication extends Application {
    static public Context context;
    static public List<Activity>  activityList;
    static public Map<String,Music> musicList=new HashMap<>();

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
        activityList=new ArrayList<Activity>();
    }
}
