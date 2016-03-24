package com.example.tutq.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.tutq.myapplication.Test.FragmentC;
import com.example.tutq.myapplication.Test.Item;
import com.example.tutq.myapplication.Test.Task;
import com.example.tutq.myapplication.Test.TestClass;

import junit.framework.Test;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    private FragmentActivity context;
    private Bundle bundle;
    private boolean val;

    /**
     *
     * @param savedInstanceState asdassaasdsdsadsdas
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TestClass.getB(null, null);

        context = this;
        Dialog dialog = new Dialog(this, R.style.AlertDialogStyle);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_message);

//        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
//        Window window = dialog.getWindow();
//        lp.copyFrom(window.getAttributes());
//        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
//        window.setAttributes(lp);

        Button btnLeft = (Button)dialog.findViewById(R.id.btn_left);
        Button btnRight = (Button)dialog.findViewById(R.id.btn_right);
        btnLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        Log.i("17", ">> act down");
                        v.setBackgroundColor(getResources().getColor(R.color.primary_text_disabled_material_light));
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("17", ">> act up");
                        v.setBackgroundColor(Color.WHITE);
                        break;
                }
                return false;
            }
        });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button btnOk = (Button) findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("17", ">> onClick");
//                Intent intent = new Intent(context, MainActivity.class);
//                intent.setData(Uri.parse("OK"));
//                startActivity(intent);
                Task task = new Task(context);
                task.execute(100);

                Task task2 = new Task(context);
                task2.execute(10000);
            }
        });

        Uri data = getIntent().getData();
        if (data != null) {
            Log.i("17", ">>> data != null : "+data.getPath());
        } else Log.i("17", ">>> data = null");

        ArrayList<Item> lstA = new ArrayList<>();
        ArrayList<Item> lstB = new ArrayList<>();
        lstA.add(new Item().setVal(1));
        lstA.add(new Item().setVal(2));
        lstA.add(new Item().setVal(3));
        lstB.addAll(lstA);
        Log.i("17", ">> " + lstA.get(0).getVal());
        Log.i("17", ">> " + lstB.get(0).getVal());
//        lstA.set(0, new Item().setVal(4));
        lstA.get(0).setVal(4);
        Log.i("17", ">> " + lstA.get(0).getVal());
        Log.i("17", ">> " + lstB.get(0).getVal());
//        btnLeft.setText(btnLeftText);
//        btnRight.setText(btnRightText);
//        btnLeft.setOnClickListener(btnLeftOnClick);
//        btnRight.setOnClickListener(btnRightOnClick);

//        dialog.show();
//        context = this;
//        bundle = new Bundle();
//        val = true;
//
//        Button btn = (Button)findViewById(R.id.btn_ok);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = context.getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                if (val) {
//                    FragmentB fragmentB = new FragmentB();
//                    fragmentTransaction.add(R.id.layout_fragment, fragmentB, FragmentB.class.getSimpleName()).commit();
//                    val = false;
//                } else {
//                    Fragment frag = fragmentManager.findFragmentByTag(FragmentB.class.getSimpleName());
//                    fragmentTransaction.remove(frag).commit();
//                }
//            }
//        });
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        FragmentA fragmentA = new FragmentA();
//        fragmentTransaction.add(R.id.layout_fragment, fragmentA, FragmentA.class.getSimpleName());
//
//
////        FragmentC fragmentC = new FragmentC();
////        fragmentTransaction.replace(R.id.layout_fragment, fragmentC, FragmentC.class.getSimpleName());
//        fragmentTransaction.commit();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        Intent intent = new Intent(this, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_RETAIN_IN_RECENTS);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
//        intent.setData(Uri.parse("NOTIFY"));
////        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent, PendingIntent.FLAG_ONE_SHOT);
//        Bitmap iconLarge = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
//
//        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//        Notification.Builder notificationBuilder = new Notification.Builder(this)
//                .setLargeIcon(iconLarge)
//                .setSmallIcon(R.drawable.icon)
//                .setContentTitle(getString(R.string.app_name))
//                .setContentText("12534568798")
//                .setAutoCancel(true)
//                .setSound(defaultSoundUri)
//                .setContentIntent(pendingIntent);
//
//        NotificationManager notificationManager =
//                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        Notification notify = notificationBuilder.build();
//        notificationManager.notify(0 /* ID of notification */, notify);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("17", ">> onResume "+this.getClass().getSimpleName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
