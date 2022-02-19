package example.com.rekomresepmasakan;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends Activity {

    ListView lv;
    TextView tx;

    String[] bahan = {"Mie, Kecap, Bawang Merah", "Nasi, Kecap, Bawang Putih", "Mie, Sayuran, Cabai",
            "Sapi, Santan, Bawang Merah", "Ayam, Sayuran, Bawang Merah", "Ayam, Cabai, Bawang Merah",
            "Sapi, Bawang Merah, Kunyit", "Sapi, Bawang Putih, Serai", "Ikan, Cabai, Bawang Merah",
            "Ikan, Gula Merah, Bawang Putih", "Beras, Sayuran, Terasi", "Bebek, Bawang Merah, Cabai",
            "Sayuran, Kacang, Cabai", "Sagu, Bawang Merah, Bawang Putih,", "Cabai, Bawang Merah, Garam"};
    ArrayAdapter<String> adapter;
    private ArrayList<String>menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);
        tx = (TextView) findViewById(R.id.tx);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bahan);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(),bahan1.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), bahan2.class);
                    startActivityForResult(intent, 1);
                }
                //lanjutan if sesuai list yang telah dibuat
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), bahan3.class);
                    startActivityForResult(intent, 2);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), bahan4.class);
                    startActivityForResult(intent, 3);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), bahan5.class);
                    startActivityForResult(intent, 4);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), bahan6.class);
                    startActivityForResult(intent, 5);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), bahan7.class);
                    startActivityForResult(intent, 6);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), bahan8.class);
                    startActivityForResult(intent, 7);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), bahan9.class);
                    startActivityForResult(intent, 8);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), bahan10.class);
                    startActivityForResult(intent, 9);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), bahan11.class);
                    startActivityForResult(intent, 10);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), bahan12.class);
                    startActivityForResult(intent, 11);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), bahan13.class);
                    startActivityForResult(intent, 12);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), bahan14.class);
                    startActivityForResult(intent, 13);
                }
                if (position == 14) {
                    Intent intent = new Intent(view.getContext(), bahan15.class);
                    startActivityForResult(intent, 14);
                }

            }
        });
    }

}

