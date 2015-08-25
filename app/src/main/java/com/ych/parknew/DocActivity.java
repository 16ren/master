package com.ych.parknew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.EditText;

public class DocActivity extends AppCompatActivity {
private WebView mwebView;
    EditText myInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);
        mwebView=(WebView)findViewById(R.id.webview_doc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id ==android.R.id.home) {
           finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
