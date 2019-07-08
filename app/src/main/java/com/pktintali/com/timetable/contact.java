package com.pktintali.com.timetable;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void doCall(View view)  {

        switch (view.getId()){

            case R.id.textView40:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:7985270343"));
                startActivity(i1);
                break;

            case R.id.textView42:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pradeeptintali"));
                startActivity(i2);
                break;

            case R.id.textView43:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pradeeptintali"));
                startActivity(i3);
                break;

            case R.id.textView44:
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/pradeeptintali"));
                startActivity(i4);
                break;
            case R.id.textView45:
                Intent i5 = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","pktintali@gmail.com",null));
                i5.putExtra(Intent.EXTRA_SUBJECT,"Subject");
                i5.putExtra(Intent.EXTRA_TEXT,"Your Message");
                startActivity(Intent.createChooser(i5,"Send eMail.."));
                break;
            case R.id.textView46:
                try{
                Intent i6 = new Intent(Intent.ACTION_SEND);
                i6.setType("text/plain");
                String text = "https://www.google.com";
                    getPackageManager().getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                i6.setPackage("com.whatsapp");

                i6.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(i6,"Share With"));}

                catch (PackageManager.NameNotFoundException e){
                    Toast.makeText(this,"WhatsApp Not Installed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.textView48:
                Intent i7 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:28.472467,77.488267"));
                startActivity(i7);
                break;




        }


    }


    public void doCallImg(View view)  {

        switch (view.getId()){

            case R.id.imageButton2:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:7985270343"));
                startActivity(i1);
                break;

            case R.id.imageButton5:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pradeeptintali"));
                startActivity(i2);
                break;

            case R.id.imageButton6:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pradeeptintali"));
                startActivity(i3);
                break;

            case R.id.imageButton7:
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/pradeeptintali"));
                startActivity(i4);
                break;
            case R.id.imageButton8:
                Intent i5 = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","pktintali@gmail.com",null));
                i5.putExtra(Intent.EXTRA_SUBJECT,"Subject");
                i5.putExtra(Intent.EXTRA_TEXT,"Your Message");
                startActivity(Intent.createChooser(i5,"Send eMail.."));
                break;
            case R.id.imageButton9:
                try{
                    Intent i6 = new Intent(Intent.ACTION_SEND);
                    i6.setType("text/plain");
                    String text = "https://drive.google.com/file/d/1pOhKU_axc5xwU8H4icw7HQpjRphfTrSY/view?usp=drivesdk";
                    getPackageManager().getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                    i6.setPackage("com.whatsapp");

                    i6.putExtra(Intent.EXTRA_TEXT,text);
                    startActivity(Intent.createChooser(i6,"Share With"));}

                catch (PackageManager.NameNotFoundException e){
                    Toast.makeText(this,"WhatsApp Not Installed",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.imageButton4:
                Intent i7 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:28.472467,77.488267"));
                startActivity(i7);
                break;




        }


    }


    public void goBackk(View view) {
        finish();
    }
}
