package com.redblackflower.dcss_m;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class KeyboardFragment extends Fragment {

    private AsciiListener ascii_listener;
    private ShiftCtrlListener shift_ctrl_listener;
    private AndroidListener android_listener;
    private ScriptListener script_listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof ListenerGetter){
            ascii_listener = ((ListenerGetter) context).getAsciiListener();
            shift_ctrl_listener = ((ListenerGetter) context).getShiftCtrlListener();
            android_listener = ((ListenerGetter) context).getAndroidListener();
            script_listener = ((ListenerGetter) context).getScriptListener();
        }else {
            throw new RuntimeException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.keyboard_fragment, container, false);

        v.findViewById(R.id.grave_accent_button).setOnClickListener(ascii_listener);
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
        v.findViewById(R.id.zero_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.equel_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.back_button).setOnClickListener(android_listener);  //android
        v.findViewById(R.id.tab_button).setOnClickListener(android_listener);   //android
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
        v.findViewById(R.id.p_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.p_nextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.delete_button).setOnClickListener(android_listener);    //android
        v.findViewById(R.id.cap_button).setOnClickListener(android_listener);   //android
        v.findViewById(R.id.a_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.s_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.d_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.f_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.g_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.h_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.j_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.k_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.l_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.l_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.l_nextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.l_nextnextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.enter_button).setOnClickListener(android_listener); //android
        v.findViewById(R.id.shift_button).setOnClickListener(shift_ctrl_listener);  //  scl
        v.findViewById(R.id.z_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.x_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.c_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.v_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.b_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.n_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_next_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_nextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.m_nextnextnext_button).setOnClickListener(ascii_listener);
        v.findViewById(R.id.shift2_button).setOnClickListener(shift_ctrl_listener); //  scl
        v.findViewById(R.id.ctrl_button).setOnClickListener(shift_ctrl_listener);   //  scl
        v.findViewById(R.id.win_button).setOnClickListener(android_listener);   //android
        v.findViewById(R.id.alt_button).setOnClickListener(android_listener);   //android
        v.findViewById(R.id.space_button).setOnClickListener(android_listener); //android
        v.findViewById(R.id.alt2_button).setOnClickListener(android_listener);  //android
        v.findViewById(R.id.win2_button).setOnClickListener(android_listener);  //android
        v.findViewById(R.id.context_button).setOnClickListener(android_listener);   //android
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

        return v;
    }
}
