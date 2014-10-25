package com.vine.vinemars.app;

import android.support.v4.app.Fragment;

import com.vine.vinemars.app.fragment.SignupFragment;

/**
 * Created by chengfei on 14-10-21.
 */
public class SignupActivity extends CommonActivity {

    @Override
    Fragment getFragment() {
        return SignupFragment.newInstance();
    }
}
