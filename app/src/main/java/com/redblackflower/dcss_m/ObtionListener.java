package com.redblackflower.dcss_m;

import android.view.View;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class ObtionListener implements View.OnClickListener{

    private WebView web_view;
    private Fragment keyboard_fragment;
    private FragmentManager keyboard_manager;
    private double zoom_size;
    private boolean keyboard_visible;

    public ObtionListener(WebView wb, Fragment kf, FragmentManager fm){
        web_view = wb;
        keyboard_fragment = kf;
        keyboard_manager = fm;
        zoom_size = 1.00;
        keyboard_visible = true;
    }

    public void Exit(){
        web_view.loadUrl("javascript:var event = document.createEvent(\"Event\");event.initEvent('keypress',true,true);event.keyCode = "+ Integer.toString(27) +";document.getElementById('game').dispatchEvent(event);");
    }

    public void ZoomIn(){
        if (zoom_size < 5.00){
            zoom_size += 0.10;
            web_view.loadUrl("javascript:document.body.style.zoom = " + Double.toString(zoom_size) + ";");
        }
    }

    public void ZoomOut(){
        if (0.30 < zoom_size) {
            zoom_size -= 0.10;
            web_view.loadUrl("javascript:document.body.style.zoom = " + Double.toString(zoom_size) + ";");
        }
    }

    public void KeyboardVisibility(){
        if (keyboard_visible == true){
            keyboard_manager.beginTransaction().hide(keyboard_fragment).commit();
            keyboard_visible = false;
        }
        else {
            keyboard_manager.beginTransaction().show(keyboard_fragment).commit();
            keyboard_visible = true;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.esc_button:
                Exit();
                break;
            case R.id.zoomin_button:
                ZoomIn();
                break;
            case R.id.zoomout_button:
                ZoomOut();
                break;
            case R.id.keyboard_button:
                KeyboardVisibility();
                break;
        }
    }
}
