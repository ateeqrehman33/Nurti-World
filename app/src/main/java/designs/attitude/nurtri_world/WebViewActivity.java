package designs.attitude.nurtri_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class WebViewActivity extends AppCompatActivity {


    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.wevview);

        Bundle extras = getIntent().getExtras();
        String value = "file:///android_asset/guide.html";

        if(extras!=null){
            value = extras.getString("key");
        }

        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.loadUrl(value);

    }
}
