package com.pktintali.com.timetable;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    private WebView webmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        webmain = findViewById(R.id.webmain);


        WebSettings webSettings = webmain.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.supportZoom();
        webmain.setWebViewClient(new WebViewClient());
        webmain.canGoBack();
        webmain.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webmain.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webmain.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);

            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);

            }

            @Override
            public void onReceivedIcon(WebView view, Bitmap icon) {
                super.onReceivedIcon(view, icon);

            }
        }
        );
        webmain.loadUrl("https://goo.gl/dN6Dyt");

    }



    public void doSecL(View view) {
        Toast.makeText(this,"L Selected",Toast.LENGTH_SHORT).show();
        Intent i1 = new Intent(this,SecL.class);
        startActivity(i1);
    }

    public void doSecB(View view) {
        Toast.makeText(this,"B Selected",Toast.LENGTH_SHORT).show();
        Intent i2 = new Intent(this,SecB.class);
        startActivity(i2);
    }

    public void doSecJ(View view) {
        Toast.makeText(this,"J Selected",Toast.LENGTH_SHORT).show();
        Intent i3 = new Intent(this,SecJ.class);
        startActivity(i3);
    }

    public void doSecN(View view) {
        Toast.makeText(this,"N Selected",Toast.LENGTH_SHORT).show();
        Intent i4 = new Intent(this,SecN.class);
        startActivity(i4);
    }

    public void doSecO(View view) {
        Toast.makeText(this,"O Selected",Toast.LENGTH_SHORT).show();
        Intent i5 = new Intent(this,SecO.class);
        startActivity(i5);
    }

    public void doSecK(View view) {
        Toast.makeText(this,"K Selected",Toast.LENGTH_SHORT).show();
        Intent i6 = new Intent(this,SecK.class);
        startActivity(i6);
    }

    public void doSecM(View view) {
        Toast.makeText(this,"M Selected",Toast.LENGTH_SHORT).show();
        Intent i7 = new Intent(this,SecM.class);
        startActivity(i7);
    }

    public void doSecP(View view) {
        Toast.makeText(this,"P Selected",Toast.LENGTH_SHORT).show();
        Intent i8 = new Intent(this,SecP.class);
        startActivity(i8);
    }

    public void doSecLL(View view) {
        switch (view.getId()){

            case R.id.button2:
                Intent i1 = new Intent(this,SecA.class);
                Toast.makeText(this,"A Selected",Toast.LENGTH_SHORT).show();
                startActivity(i1);
                break;
            case R.id.button4:
                Intent i2 = new Intent(this,SecC.class);
                Toast.makeText(this,"C Selected",Toast.LENGTH_SHORT).show();
                startActivity(i2);
                break;
            case R.id.button5:
                Intent i3 = new Intent(this,SecD.class);
                Toast.makeText(this,"D Selected",Toast.LENGTH_SHORT).show();
                startActivity(i3);
                break;
            case R.id.button6:
                Intent i4 = new Intent(this,SecE.class);
                Toast.makeText(this,"E Selected",Toast.LENGTH_SHORT).show();
                startActivity(i4);
                break;
            case R.id.button7:
                Intent i5 = new Intent(this,SecF.class);
                Toast.makeText(this,"F Selected",Toast.LENGTH_SHORT).show();
                startActivity(i5);
                break;
            case R.id.button8:
                Intent i6 = new Intent(this,SecG.class);
                Toast.makeText(this,"G Selected",Toast.LENGTH_SHORT).show();
                startActivity(i6);
                break;
            case R.id.button9:
                Intent i7 = new Intent(this,SecH.class);
                Toast.makeText(this,"H Selected",Toast.LENGTH_SHORT).show();
                startActivity(i7);
                break;
            case R.id.button10:
                Intent i8 = new Intent(this,SecI.class);
                Toast.makeText(this,"I Selected",Toast.LENGTH_SHORT).show();
                startActivity(i8);
                break;


        }
    }

    public void doSetting(View view) {
        Intent i8 = new Intent(this,info.class);
        startActivity(i8);
    }

    public void doShare(View view) {
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "https://drive.google.com/file/d/1pOhKU_axc5xwU8H4icw7HQpjRphfTrSY/view?usp=drivesdk";
        String shareSub = "Your Subject";
        myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(myIntent,"Share Using"));
    }

    public void doannounc(View view) {
        Intent i1 = new Intent(this,announcements.class);
        startActivity(i1);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (event.getAction()==KeyEvent.ACTION_DOWN){
            switch (keyCode){

                case KeyEvent.KEYCODE_BACK:
                    if (webmain.canGoBack()){
                        webmain.goBack();
                    }else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode,event);
    }
}