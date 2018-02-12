package com.example.shreyassudheendrarao.encoding_decoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread() {
            public void run() {
                EncodeDecodeTest test = new EncodeDecodeTest();
                test.setContext(MainActivity.this);
                try {
                    test.testEncodeDecodeVideoFromBufferToSurface720p();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }.start();


    }
}
