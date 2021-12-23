package com.redblackflower.dcss_m;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TenkeyFragment extends Fragment {

    private AsciiListener ascii_listener;
    private ShiftCtrlListener shift_ctrl_listener;
    private AndroidListener android_listener;
    private ScriptListener script_listener;
    private FragmentListener fragment_listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof ListenerGetter){
            ascii_listener = ((ListenerGetter) context).getAsciiListener();
            shift_ctrl_listener = ((ListenerGetter) context).getShiftCtrlListener();
            android_listener = ((ListenerGetter) context).getAndroidListener();
            script_listener = ((ListenerGetter) context).getScriptListener();
            fragment_listener = ((ListenerGetter) context).getFragmentListener();
        }else {
            throw new RuntimeException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tenkey_fragment, container, false);

        v.findViewById(R.id.grave_accent_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.zero_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.equel_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.tab_button).setOnClickListener(android_listener);   //android
        v.findViewById(R.id.p_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.p_nextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.cap_button).setOnClickListener(android_listener);   //android
        v.findViewById(R.id.l_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.l_nextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.l_nextnextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_nextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_nextnextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.shift2_button).setOnClickListener(shift_ctrl_listener); //  scl
        v.findViewById(R.id.ctrl2_button).setOnClickListener(shift_ctrl_listener);  //scl
        v.findViewById(R.id.seven_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.eight_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.nine_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.four_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.five_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.six_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.one_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.two_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.three_ten_button).setOnClickListener(script_listener);  //script
        v.findViewById(R.id.change1_button).setOnClickListener(fragment_listener);  //fragment


        //v.findViewById(R.id.delete_button).setOnClickListener(android_listener);    //android
        //v.findViewById(R.id.win_button).setOnClickListener(android_listener);   //android
        //v.findViewById(R.id.alt_button).setOnClickListener(android_listener);   //android
        //v.findViewById(R.id.alt2_button).setOnClickListener(android_listener);  //android
        //v.findViewById(R.id.win2_button).setOnClickListener(android_listener);  //android
        //v.findViewById(R.id.context_button).setOnClickListener(android_listener);   //android

        return v;
    }
}
