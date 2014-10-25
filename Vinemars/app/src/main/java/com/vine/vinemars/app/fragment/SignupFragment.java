package com.vine.vinemars.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vine.vinemars.R;

import butterknife.InjectView;

/**
 * Created by chengfei on 14-10-25.
 */
public class SignupFragment extends BaseFragment {
    @InjectView(R.id.signup)
    protected Button signupButton;

    public static SignupFragment newInstance() {
        return new SignupFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signup, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        signupButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
