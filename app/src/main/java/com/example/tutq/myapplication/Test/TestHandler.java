package com.example.tutq.myapplication.Test;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/**
 * Created by tutq on 3/22/2016.
 */
public class TestHandler extends Handler {

    private ProgressDialog progress;
    private int orderShow;

    public TestHandler(Looper mainLooper) {
        super(mainLooper);
    }

    @Override
    public void handleMessage(Message msg) {
        Log.i("17", ">> msg : "+msg.what);
        switch (msg.what) {
            case 1 :
                if (progress == null) {
                    progress = new ProgressDialog((Context)msg.obj);
                    progress.setCanceledOnTouchOutside(false);
                    progress.setCancelable(false);
                    progress.show();
                } else if (!progress.isShowing()) {
                    progress.show();
                }
                orderShow++;
                break;
            case 0:
                orderShow--;
                if (orderShow == 0 && progress != null && progress.isShowing()) progress.dismiss();
                break;
        }
    }
}
