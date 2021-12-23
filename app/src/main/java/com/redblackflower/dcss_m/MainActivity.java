package com.redblackflower.dcss_m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ListenerGetter {

    private WebView web_view;
    private Fragment qwerty_fragment, tenkey_fragment;
    private Button esc_button, zoomin_button, zoomout_button, keyboard_button;
    private ObtionListener obtion_listener;
    private FragmentManager keyboard_manager;

    private FragmentListener fragment_listener;
    private ShiftCtrlListener shift_ctrl_listener;
    private AsciiListener ascii_listener;
    private AndroidListener android_listener;
    private ScriptListener script_listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web_view = (WebView) findViewById(R.id.web_view);
        WebSetting(web_view);

        shift_ctrl_listener = new ShiftCtrlListener();
        ascii_listener = new AsciiListener(web_view,shift_ctrl_listener);
        android_listener = new AndroidListener(shift_ctrl_listener);
        script_listener = new ScriptListener(web_view,shift_ctrl_listener);

        qwerty_fragment = new QwertyFragment();
        tenkey_fragment = new TenkeyFragment();
        keyboard_manager = getSupportFragmentManager();
        FragmentSetting(qwerty_fragment, tenkey_fragment, keyboard_manager);

        fragment_listener = new FragmentListener(qwerty_fragment, tenkey_fragment, keyboard_manager);
        obtion_listener = new ObtionListener(web_view, qwerty_fragment, tenkey_fragment, keyboard_manager);

        esc_button = (Button) findViewById(R.id.esc_button);
        zoomin_button = (Button) findViewById(R.id.zoomin_button);
        zoomout_button = (Button) findViewById(R.id.zoomout_button);
        keyboard_button = (Button) findViewById(R.id.keyboard_button);
        esc_button.setOnClickListener(obtion_listener);
        zoomin_button.setOnClickListener(obtion_listener);
        zoomout_button.setOnClickListener(obtion_listener);
        keyboard_button.setOnClickListener(obtion_listener);
    }

    public void WebSetting(WebView wb){
        WebSettings screen_web_setting = wb.getSettings();
        screen_web_setting.setJavaScriptEnabled(true);
        screen_web_setting.setUseWideViewPort(true);
        screen_web_setting.setLoadWithOverviewMode(true);
        screen_web_setting.setSupportZoom(true);
        screen_web_setting.setBuiltInZoomControls(true);
        screen_web_setting.setDisplayZoomControls(false);
        InitURL(wb,"http://webzook.net:8080/#lobby");
    }

    public void InitURL(WebView wb, String url){
        wb.loadUrl(url);
    }

    public void FragmentSetting(Fragment qf,Fragment tf, FragmentManager fm){
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.screen_container, qf);
        fragmentTransaction.add(R.id.screen_container, tf);
        fragmentTransaction.hide(qf);
        fragmentTransaction.commit();
    }

    @Override
    public AsciiListener getAsciiListener(){
        return ascii_listener;
    }

    @Override
    public ShiftCtrlListener getShiftCtrlListener() {return shift_ctrl_listener;}

    @Override
    public AndroidListener getAndroidListener() {return android_listener;}

    @Override
    public ScriptListener getScriptListener() {return script_listener;}

    @Override
    public FragmentListener getFragmentListener() {return fragment_listener;}
}