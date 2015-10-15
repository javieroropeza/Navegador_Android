package com.example.javier.navegador;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button boton = (Button) findViewById(R.id.btnbus);
        boton.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {

                                         String busqueda = ((EditText) findViewById(R.id.etbus)).getText().toString();
                                         String url = busqueda;

                                         WebView mWebView;
                                         mWebView = (WebView) findViewById(R.id.web);

                                         WebSettings webSettings = mWebView.getSettings();
                                         webSettings.setJavaScriptEnabled(true);

                                         mWebView.loadUrl(busqueda);
                                         mWebView.setWebViewClient(new WebViewClient());
                                     }
                                 }
        );

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
