package example.com.rekomresepmasakan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class about extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);


        tv1.setText("About Aplikasi");
        tv2.setText("Nama : Alika Putri Amanda");
        tv3.setText("NPM  : 50417525");
        tv4.setText("Guna melengkapi Penulisan Ilmiah Jenjang S1" +
                "Program Studi Teknik Informatika Univeritas Gunadarma");
        tv5.setText("Sumber gambar : https://cookpad.com/id");
    }

}
