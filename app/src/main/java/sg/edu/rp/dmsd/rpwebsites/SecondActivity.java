package sg.edu.rp.dmsd.rpwebsites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by 17010457 on 8/8/2018.
 */

public class SecondActivity extends AppCompatActivity {
    WebView wvRP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wvRP = findViewById(R.id.WebViewRP);
        wvRP.setWebViewClient(new WebViewClient());
        wvRP.getSettings().setJavaScriptEnabled(true);
        wvRP.getSettings().setAllowFileAccess(false);
        wvRP.getSettings().setBuiltInZoomControls(true);

        Intent intentReceived = getIntent();
        String url = intentReceived.getStringExtra("url");
        wvRP.loadUrl(url);
    }
}