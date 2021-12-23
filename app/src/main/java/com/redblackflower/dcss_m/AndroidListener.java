package com.redblackflower.dcss_m;

import android.app.Instrumentation;
import android.view.KeyEvent;
import android.view.View;

import java.util.HashMap;

public class AndroidListener implements View.OnClickListener{

    private HashMap<Integer,Integer> key_table;
    private ShiftCtrlListener shift_ctrl_listener;

    public AndroidListener(ShiftCtrlListener scl){
        shift_ctrl_listener = scl;
        key_table = new HashMap<>();
        key_table.put(R.id.back_button, KeyEvent.KEYCODE_BACK);
        key_table.put(R.id.tab_button, KeyEvent.KEYCODE_TAB);
        key_table.put(R.id.delete_button,KeyEvent.KEYCODE_FORWARD_DEL);
        key_table.put(R.id.cap_button, KeyEvent.KEYCODE_CAPS_LOCK);
        key_table.put(R.id.enter_button,KeyEvent.KEYCODE_ENTER);
        key_table.put(R.id.win_button,KeyEvent.KEYCODE_WINDOW);
        key_table.put(R.id.alt_button,KeyEvent.KEYCODE_ALT_LEFT);
        key_table.put(R.id.space_button,KeyEvent.KEYCODE_SPACE);
        key_table.put(R.id.alt2_button,KeyEvent.KEYCODE_ALT_RIGHT);
        key_table.put(R.id.win2_button,KeyEvent.KEYCODE_WINDOW);
        key_table.put(R.id.context_button,KeyEvent.KEYCODE_TV_MEDIA_CONTEXT_MENU);
    }
    @Override
    public void onClick(View v) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Instrumentation().sendKeyDownUpSync(key_table.get(v.getId()));
            }
        }).start();
        shift_ctrl_listener.setFlagZero();
    }
}
