package com.fujimic.hss3.model;


import lombok.Getter;
import lombok.Setter;

public class SettingsModel {

    // TODO インスタンス化の際にファイルを読み込む
    public SettingsModel(){
        backlightBrightness=0;
        focusThresholds2=0;
        lowPowerModeInterval=0;
        sensorID=0;
        externalAccessPointID=0;
        defaultLanguage=0;
        defaultSkinColorType=0;
        currentStructure=0;
        defaultIsMirror=true;
        defaultDisplayTextureAge=true;
        isCPB=true;
        operatorNumber=0;
        operatorNumberForCount=0;
        justpint=true;
        streamInterval=0;
        availableLanguages=0;
        isMDP=true;
        outputDebugLog=true;
        elixirCourse=0;
        isNewShootingSequence=true;
        wifiEnable=true;
        internalAPEnable=true;
        latestAPLversion="init";
        isNeedWifiConnectSetting=true;
        isNeedWifiEnableSetting=true;
        isNeedUsbConnectSetting=true;
        isISD=true;
        isSRP=true;
        isDandR=true;
        displayOrder="init";
   }

    @Setter
    @Getter
    // LCDバックライト輝度
    int backlightBrightness;

    @Setter
    @Getter
    // ピント閾値
    int focusThresholds2;

    @Setter
    @Getter
    // 省電力時間
    int lowPowerModeInterval;

    @Setter
    @Getter
    // センサー番号
    int sensorID;

    @Setter
    @Getter
    // 外部AP番号
    int externalAccessPointID;

    @Setter
    @Getter
    // 既定言語
    int defaultLanguage;

    @Setter
    @Getter
    // 既定肌色タイプ（A/O/SA）
    int defaultSkinColorType;

    @Setter
    @Getter
    // 運用形態
    int currentStructure;

    @Setter
    @Getter
    // 既定L/R
    boolean defaultIsMirror;

    @Setter
    @Getter
    // 既定きめ年齢表示方法
    boolean defaultDisplayTextureAge;

    @Setter
    @Getter
    // Radiance表示／非表示
    boolean isCPB;

    @Setter
    @Getter
    // 使用者No.
    int operatorNumber;

    @Setter
    @Getter
    // 使用数集計の使用者No.
    int operatorNumberForCount;

    @Setter
    @Getter
    // AFのOff/On
    boolean justpint;

    @Setter
    @Getter
    // 動画転送間隔
    int streamInterval;

    @Setter
    @Getter
    // 選択可能言語数
    int availableLanguages;

    @Setter
    @Getter
    // MDP表示／非表示
    boolean isMDP;

    @Setter
    @Getter
    // 調査用ログの出力有無
    boolean outputDebugLog;

    @Setter
    @Getter
    // ELIXIRコース選択
    int elixirCourse;

    @Setter
    @Getter
// 測定順
    boolean isNewShootingSequence;

    @Setter
    @Getter
// Wi-FiのOn/Off
    boolean wifiEnable;

    @Setter
    @Getter
// 内蔵AP起動のOn/Off
    boolean internalAPEnable;

    @Setter
    @Getter
// 最新アプリバージョン情報
    String latestAPLversion;

    @Setter
    @Getter
// WiFi設定変更フラグ
    boolean isNeedWifiConnectSetting;

    @Setter
    @Getter
// WiFi有効無効設定変更フラグ
    boolean isNeedWifiEnableSetting;

    @Setter
    @Getter
// USB接続設定変更フラグ
    boolean isNeedUsbConnectSetting;

    @Setter
    @Getter
// "Inner Skin Defenses表示／非表示"
    boolean isISD;

    @Setter
    @Getter
// "Skin's Responsive Power表示／非表示"
    boolean isSRP;

    @Setter
    @Getter
// D&R表示／非表示
    boolean isDandR;

    @Setter
    @Getter
// メニュー表示順
    String displayOrder;
}
