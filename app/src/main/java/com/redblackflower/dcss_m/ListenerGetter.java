package com.redblackflower.dcss_m;

public interface ListenerGetter{
    AsciiListener getAsciiListener();
    ShiftCtrlListener getShiftCtrlListener();
    AndroidListener getAndroidListener();
    ScriptListener getScriptListener();
}