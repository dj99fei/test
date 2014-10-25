package com.vine.vinemars.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.vine.vinemars.R;

/**
 * Created by chengfei on 14-10-25.
 */
public abstract  class CommonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc_search_view);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, getFragment()).commit();
    }

    abstract Fragment getFragment();

    String getTag() {
        return this.getClass().getSimpleName();
    }

}
