package com.quantum.app.course;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hua on 2016/1/14.
 */
public class LoginFragment extends Fragment {

    public LoginFragment() {

    }

    Button loginBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        loginBtn = (Button) view.findViewById(R.id.login_btn);
        loginBtn.getBackground().setAlpha(200);

        return view;
    }



}
