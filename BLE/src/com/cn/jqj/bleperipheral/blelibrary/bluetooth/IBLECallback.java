package com.cn.jqj.bleperipheral.blelibrary.bluetooth;

/**
 * Created by andy on 2016/1/14.
 *
 */
public interface IBLECallback {
    /**
     * 杩炴帴鎴愬姛
     */
    void onConnected();

    /**
     * 杩炴帴鏂紑
     */
    void onDisconnected();

    /**
     * 姝ゆ柟娉曚細鍦ㄦ敹鍒版暟鎹椂璋冪敤
     * @param data 鏀跺埌鐨勬暟鎹�     */
    void onDataReceived(byte[] data);
}
