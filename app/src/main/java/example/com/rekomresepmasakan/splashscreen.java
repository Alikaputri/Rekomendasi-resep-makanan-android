package example.com.rekomresepmasakan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class splashscreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        int SPLASH_SCREEN_TIME = 2000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,menu.class);
                splashscreen.this.startActivity(intent);
                splashscreen.this.finish();
            }
        }, SPLASH_SCREEN_TIME);
    }
}
