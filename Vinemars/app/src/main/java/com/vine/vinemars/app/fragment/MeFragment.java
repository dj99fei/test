package com.vine.vinemars.app.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vine.vinemars.R;
import com.vine.vinemars.app.SignupActivity;

import butterknife.InjectView;

/**
 * Created by chengfei on 14-10-24.
 */
public class MeFragment extends BaseFragment {

    @InjectView(R.id.info_layout)
    protected View infoLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        infoLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        getActivity().startActivity(new Intent(getActivity(), SignupActivity.class));
    }


}
