package com.example.tutq.myapplication.Test;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/**
 * Created by tutq on 3/22/2016.
 */
public class Task extends AsyncTask<Integer, Integer, Boolean> {

    private TestHandler handler;
    private Context context;

    public Task(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        handler = new TestHandler(Looper.getMainLooper());
        Message msg = Message.obtain(handler, 1);
        msg.obj = context;
        handler.sendMessage(msg);
        handler.sendMessage(msg);// develop1
        handler.sendMessage(msg);// develop1_2
        handler.sendMessage(msg);// develop2
//        handler.sendMessage(msg);
        super.onPreExecute();
//        ádasđs
    }

    @Override
    protected Boolean doInBackground(Integer[] params) {
        for (int i = 0; i < params[0]; i++) {
            Log.i("17", ">> i = "+i);
        };
        return true;
    }

    @Override
    protected void onPostExecute(Boolean o) {
        Message msg = Message.obtain(handler, 0);
        msg.obj = context;
        handler.sendMessage(msg);
        super.onPostExecute(o);
    }
}
