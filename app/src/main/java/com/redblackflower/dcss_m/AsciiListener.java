package com.redblackflower.dcss_m;

import android.view.View;
import android.webkit.WebView;

import java.util.HashMap;

public class AsciiListener implements View.OnClickListener{

    private WebView web_view;
    private ShiftCtrlListener shift_ctrl_listener;
    private HashMap<Integer,Integer> key_table;

    public AsciiListener(WebView wb, ShiftCtrlListener scl){
        web_view = wb;
        shift_ctrl_listener = scl;
        key_table = new HashMap<>();
        key_table.put(R.id.grave_accent_button,96);
        key_table.put(R.id.one_button,49);
        key_table.put(R.id.two_button,50);
        key_table.put(R.id.three_button,51);
        key_table.put(R.id.four_button,52);
        key_table.put(R.id.five_button,53);
        key_table.put(R.id.six_button,54);
        key_table.put(R.id.seven_button,55);
        key_table.put(R.id.eight_button,56);
        key_table.put(R.id.nine_button,57);
        key_table.put(R.id.zero_button,48);
        key_table.put(R.id.zero_next_button,45);
        key_table.put(R.id.equel_button,61);
        key_table.put(R.id.q_button,113);
        key_table.put(R.id.w_button,119);
        key_table.put(R.id.e_button,101);
        key_table.put(R.id.r_button,114);
        key_table.put(R.id.t_button,116);
        key_table.put(R.id.y_button,121);
        key_table.put(R.id.u_button,117);
        key_table.put(R.id.i_button,105);
        key_table.put(R.id.o_button,111);
        key_table.put(R.id.p_button,112);
        key_table.put(R.id.p_next_button,91);
        key_table.put(R.id.p_nextnext_button,93);
        key_table.put(R.id.a_button,97);
        key_table.put(R.id.s_button,115);
        key_table.put(R.id.d_button,100);
        key_table.put(R.id.f_button,102);
        key_table.put(R.id.g_button,103);
        key_table.put(R.id.h_button,104);
        key_table.put(R.id.j_button,106);
        key_table.put(R.id.k_button,107);
        key_table.put(R.id.l_button,108);
        key_table.put(R.id.l_next_button,59);
        key_table.put(R.id.l_nextnext_button,39);
        key_table.put(R.id.l_nextnextnext_button,92);
        key_table.put(R.id.z_button,122);
        key_table.put(R.id.x_button,120);
        key_table.put(R.id.c_button,99);
        key_table.put(R.id.v_button,118);
        key_table.put(R.id.b_button,98);
        key_table.put(R.id.n_button,110);
        key_table.put(R.id.m_button,109);
        key_table.put(R.id.m_next_button,44);
        key_table.put(R.id.m_nextnext_button,46);
        key_table.put(R.id.m_nextnextnext_button,47);
        //
        key_table.put(R.id.grave_accent_button+1000000,126);
        key_table.put(R.id.one_button+1000000,33);
        key_table.put(R.id.two_button+1000000,64);
        key_table.put(R.id.three_button+1000000,35);
        key_table.put(R.id.four_button+1000000,36);
        key_table.put(R.id.five_button+1000000,37);
        key_table.put(R.id.six_button+1000000,94);
        key_table.put(R.id.seven_button+1000000,38);
        key_table.put(R.id.eight_button+1000000,42);
        key_table.put(R.id.nine_button+1000000,40);
        key_table.put(R.id.zero_button+1000000,41);
        key_table.put(R.id.zero_next_button+1000000,95);
        key_table.put(R.id.equel_button+1000000,43);
        key_table.put(R.id.q_button+1000000,81);
        key_table.put(R.id.w_button+1000000,87);
        key_table.put(R.id.e_button+1000000,69);
        key_table.put(R.id.r_button+1000000,82);
        key_table.put(R.id.t_button+1000000,84);
        key_table.put(R.id.y_button+1000000,89);
        key_table.put(R.id.u_button+1000000,85);
        key_table.put(R.id.i_button+1000000,73);
        key_table.put(R.id.o_button+1000000,79);
        key_table.put(R.id.p_button+1000000,80);
        key_table.put(R.id.p_next_button+1000000,123);
        key_table.put(R.id.p_nextnext_button+1000000,125);
        key_table.put(R.id.a_button+1000000,65);
        key_table.put(R.id.s_button+1000000,83);
        key_table.put(R.id.d_button+1000000,68);
        key_table.put(R.id.f_button+1000000,70);
        key_table.put(R.id.g_button+1000000,71);
        key_table.put(R.id.h_button+1000000,72);
        key_table.put(R.id.j_button+1000000,74);
        key_table.put(R.id.k_button+1000000,75);
        key_table.put(R.id.l_button+1000000,76);
        key_table.put(R.id.l_next_button+1000000,58);
        key_table.put(R.id.l_nextnext_button+1000000,34);
        key_table.put(R.id.l_nextnextnext_button+1000000,124);
        key_table.put(R.id.z_button+1000000,90);
        key_table.put(R.id.x_button+1000000,88);
        key_table.put(R.id.c_button+1000000,67);
        key_table.put(R.id.v_button+1000000,86);
        key_table.put(R.id.b_button+1000000,66);
        key_table.put(R.id.n_button+1000000,78);
        key_table.put(R.id.m_button+1000000,77);
        key_table.put(R.id.m_next_button+1000000,60);
        key_table.put(R.id.m_nextnext_button+1000000,62);
        key_table.put(R.id.m_nextnextnext_button+1000000,63);
        //
        key_table.put(R.id.grave_accent_button+2000000,0);
        key_table.put(R.id.one_button+2000000,0);
        key_table.put(R.id.two_button+2000000,0);
        key_table.put(R.id.three_button+2000000,0);
        key_table.put(R.id.four_button+2000000,0);
        key_table.put(R.id.five_button+2000000,0);
        key_table.put(R.id.six_button+2000000,30);
        key_table.put(R.id.seven_button+2000000,0);
        key_table.put(R.id.eight_button+2000000,0);
        key_table.put(R.id.nine_button+2000000,0);
        key_table.put(R.id.zero_button+2000000,0);
        key_table.put(R.id.zero_next_button+2000000,31);
        key_table.put(R.id.equel_button+2000000,0);
        key_table.put(R.id.q_button+2000000,17);
        key_table.put(R.id.w_button+2000000,23);
        key_table.put(R.id.e_button+2000000,5);
        key_table.put(R.id.r_button+2000000,18);
        key_table.put(R.id.t_button+2000000,20);
        key_table.put(R.id.y_button+2000000,25);
        key_table.put(R.id.u_button+2000000,21);
        key_table.put(R.id.i_button+2000000,9);
        key_table.put(R.id.o_button+2000000,15);
        key_table.put(R.id.p_button+2000000,16);
        key_table.put(R.id.p_next_button+2000000,27);
        key_table.put(R.id.p_nextnext_button+2000000,29);
        key_table.put(R.id.a_button+2000000,1);
        key_table.put(R.id.s_button+2000000,19);
        key_table.put(R.id.d_button+2000000,4);
        key_table.put(R.id.f_button+2000000,6);
        key_table.put(R.id.g_button+2000000,7);
        key_table.put(R.id.h_button+2000000,8);
        key_table.put(R.id.j_button+2000000,10);
        key_table.put(R.id.k_button+2000000,11);
        key_table.put(R.id.l_button+2000000,12);
        key_table.put(R.id.l_next_button+2000000,0);
        key_table.put(R.id.l_nextnext_button+2000000,0);
        key_table.put(R.id.l_nextnextnext_button+2000000,28);
        key_table.put(R.id.z_button+2000000,26);
        key_table.put(R.id.x_button+2000000,24);
        key_table.put(R.id.c_button+2000000,3);
        key_table.put(R.id.v_button+2000000,22);
        key_table.put(R.id.b_button+2000000,2);
        key_table.put(R.id.n_button+2000000,14);
        key_table.put(R.id.m_button+2000000,13);
        key_table.put(R.id.m_next_button+2000000,0);
        key_table.put(R.id.m_nextnext_button+2000000,0);
        key_table.put(R.id.m_nextnextnext_button+2000000,0);
    }

    public void KeyScript(int key){
        web_view.loadUrl("javascript:var event = document.createEvent(\"Event\");event.initEvent('keypress',true,true);event.keyCode = "+ Integer.toString(key_table.get(key+(shift_ctrl_listener.getFlag()*1000000))) +";document.getElementById('game').dispatchEvent(event);");
    }

    @Override
    public void onClick(View v) {
        KeyScript(v.getId());
        shift_ctrl_listener.setFlagZero();
    }
}
