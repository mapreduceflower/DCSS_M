package com.redblackflower.dcss_m;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class QwertyFragment extends Fragment {

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
        View v = inflater.inflate(R.layout.qwerty_fragment, container, false);

        v.findViewById(R.id.one_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.two_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.three_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.four_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.five_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.six_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.seven_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.eight_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.nine_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.zero_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.back_button).setOnClickListener(android_listener);  //android
        v.findViewById(R.id.q_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.w_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.e_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.r_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.t_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.y_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.u_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.i_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.o_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.p_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.a_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.s_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.d_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.f_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.g_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.h_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.j_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.k_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.l_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.enter_button).setOnClickListener(android_listener); //android
        v.findViewById(R.id.shift_button).setOnClickListener(shift_ctrl_listener);  //  scl
        v.findViewById(R.id.z_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.x_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.c_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.v_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.b_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.n_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.ctrl_button).setOnClickListener(shift_ctrl_listener);   //  scl
        v.findViewById(R.id.space_button).setOnClickListener(android_listener); //android
        v.findViewById(R.id.change2_button).setOnClickListener(fragment_listener);   //Fragment


        return v;
    }
}
