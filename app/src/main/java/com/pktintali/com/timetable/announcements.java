package com.pktintali.com.timetable;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class announcements extends AppCompatActivity {
   private static final String TAG = "announcements";
    private ProgressDialog progressbar;
    private WebView ww1;
    TextView t1;
    ImageView imageView1;
    ProgressBar superProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_announcements);
        ww1 = findViewById(R.id.webannounce);

        imageView1 = findViewById(R.id.imgwebicon);
        superProgressbar = findViewById(R.id.progressBar2);
        t1 = findViewById(R.id.Title);

        superProgressbar.setMax(100);
        WebSettings webSettings = ww1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.supportZoom();
        ww1.setWebViewClient(new WebViewClient());
        ww1.getSettings().setBuiltInZoomControls(true);
        ww1.canGoBack();
        ww1.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        ww1.getSettings().setDisplayZoomControls(false);
        ww1.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        ww1.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                superProgressbar.setProgress(newProgress);


            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                t1.setText(title);
            }

            @Override
            public void onReceivedIcon(WebView view, Bitmap icon) {
                super.onReceivedIcon(view, icon);
                imageView1.setImageBitmap(icon);
            }
        });

       final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
       progressbar = ProgressDialog.show(announcements.this,"Please wait..","Loading");
        ww1.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                Log.i(TAG,"Processing..");
                view.loadUrl(url);
                return true;
            }
            public void onPageFinished(WebView view,String url){
                Log.i(TAG,"Finished Loading URL:"+url);
                if (progressbar.isShowing()){
                    progressbar.dismiss();
                }
            }

            public void onReceivedError(WebView view,int errorCode, String description,String failingUrl){
                Log.e(TAG,"Error:"+description);
                Toast.makeText(announcements.this,"Oh no!"+description,Toast.LENGTH_SHORT).show();
                alertDialog.setTitle("Error");
                alertDialog.setMessage(description);
                alertDialog.show();
            }
        });
        ww1.loadUrl("https://pradeeptintali.blogspot.com/");

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (event.getAction()==KeyEvent.ACTION_DOWN){
            switch (keyCode){

                case KeyEvent.KEYCODE_BACK:
                    if (ww1.canGoBack()){
                        ww1.goBack();
                    }else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode,event);
    }
    public void goBackk(View view) {
        finish();
    }
}
