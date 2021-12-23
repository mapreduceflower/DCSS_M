package com.redblackflower.dcss_m;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentListener implements View.OnClickListener {

    private Fragment qwerty_fragment, tenkey_fragment;
    private FragmentManager keyboard_manager;

    public FragmentListener(Fragment qf, Fragment tf, FragmentManager fm){
        qwerty_fragment = qf;
        tenkey_fragment = tf;
        keyboard_manager = fm;
    }

    public void toTenkey(){
        FragmentTransaction fragmentTransaction = keyboard_manager.beginTransaction();
        fragmentTransaction.hide(qwerty_fragment);
        fragmentTransaction.show(tenkey_fragment);
        fragmentTransaction.commit();
    }

    public void toQwerty(){
        FragmentTransaction fragmentTransaction = keyboard_manager.beginTransaction();
        fragmentTransaction.show(qwerty_fragment);
        fragmentTransaction.hide(tenkey_fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.change2_button:
                toTenkey();
                break;
            case R.id.change1_button:
                toQwerty();
                break;
        }
    }
}
