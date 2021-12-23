package com.redblackflower.dcss_m;

import android.view.View;

public class ShiftCtrlListener implements View.OnClickListener{
    private int flag;

    public ShiftCtrlListener(){
        flag = 0;
        // 0 = none, 1 = Shift, 2 = ctrl
    }

    public void ShiftControl(){
        if (flag == 1){
            flag = 0;
        } else{
            flag = 1;
        }
    }

    public void CtrlControl(){
        if (flag == 2){
            flag = 0;
        } else{
            flag = 2;
        }
    }

    public int getFlag(){
        return flag;
    }

    public void setFlagZero() {flag = 0;}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.shift_button:
            case R.id.shift2_button:
                ShiftControl();
                break;
            case R.id.ctrl_button:
            case R.id.ctrl2_button:
                CtrlControl();
                break;
        }
    }
}
