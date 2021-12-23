package com.redblackflower.dcss_m;

import android.view.View;
import android.webkit.WebView;

import java.util.HashMap;

public class ScriptListener implements View.OnClickListener{

    private WebView web_view;
    private ShiftCtrlListener shift_ctrl_listener;
    private HashMap<Integer,Integer> key_table;

    public ScriptListener(WebView wb,ShiftCtrlListener scl){
        web_view = wb;
        shift_ctrl_listener = scl;
        key_table = new HashMap<>();
        key_table.put(R.id.seven_ten_button,36);
        key_table.put(R.id.eight_ten_button,38);
        key_table.put(R.id.nine_ten_button,33);
        key_table.put(R.id.four_ten_button,37);
        key_table.put(R.id.five_ten_button,12);
        key_table.put(R.id.six_ten_button,39);
        key_table.put(R.id.one_ten_button,35);
        key_table.put(R.id.two_ten_button,40);
        key_table.put(R.id.three_ten_button,34);
    }

    @Override
    public void onClick(View v) {
        web_view.loadUrl("javascript:var event = document.createEvent(\"Event\");");
        web_view.loadUrl("javascript:event.initEvent('keydown',true,true);");
        web_view.loadUrl("javascript:event.keyCode = "+Integer.toString(key_table.get(v.getId()))+";");

        switch(shift_ctrl_listener.getFlag()){
            case 0:
                break;
            case 1:
                web_view.loadUrl("javascript:event.shiftKey = true;");
                break;
            case 2:
                web_view.loadUrl("javascript:event.ctrlKey = true;");
                break;
        }
        web_view.loadUrl("javascript:document.getElementById('game').dispatchEvent(event);");
        shift_ctrl_listener.setFlagZero();
    }
}
