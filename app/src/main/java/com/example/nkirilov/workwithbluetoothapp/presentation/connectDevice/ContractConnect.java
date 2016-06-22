package com.example.nkirilov.workwithbluetoothapp.presentation.connectDevice;

import com.polidea.rxandroidble.RxBleConnection;

/**
 * Created by n.kirilov on 22.06.2016.
 */
public interface ContractConnect {

    interface ConnPresenter {
        void connectBleDevice(String macAddress);

        boolean isConnected();

        void onConnFail();

        void onConnReceived();

        void clearSub();

        void triggerDisconnect();

        void onConnectionStateChange(RxBleConnection.RxBleConnectionState newState);

        void setView(ContractConnect.ConnView view);

        void connListener();
    }

    interface ConnView{
        void updateUI();

        void setTextConn(String s);
    }
}