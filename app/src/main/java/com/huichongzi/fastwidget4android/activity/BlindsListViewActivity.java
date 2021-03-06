package com.huichongzi.fastwidget4android.activity;

import android.app.Activity;
import android.os.Bundle;

import com.huichongzi.fastwidget4android.R;
import com.huichongzi.fastwidget4android.adapter.AnimationListAdapter;
import com.huichongzi.fastwidget4android.widget.AnimationListView;
import com.huichongzi.fastwidget4android.widget.BlindsView;

/**
 * @author chz
 * @description
 * @date 2016/1/27 9:42
 */
public class BlindsListViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blinds_listview_act);
        initView();
    }

    private void initView(){
        AnimationListView blindsListView = (AnimationListView)findViewById(R.id.blinds_listview_act_list);
        blindsListView.setAdapter(new AnimationListAdapter(this));
        blindsListView.setAnimationClass(BlindsView.class);
        blindsListView.setIsVertical(false);
    }
}
