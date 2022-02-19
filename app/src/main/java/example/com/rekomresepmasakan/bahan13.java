package example.com.rekomresepmasakan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class bahan13 extends AppCompatActivity {
    ListView list_item;
    private String[] bahan13 = {"Karedok", "Gado-gado"};

    private ArrayList<String> menu13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitem);
        list_item = (ListView)findViewById(R.id.list_item);
        menu13 = new ArrayList<>();
        getMenu();
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item, menu13);
        list_item.setAdapter(adapter);
        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getMakanan = menu13.get(position);
                Intent sendMakanan = new Intent(example.com.rekomresepmasakan.bahan13.this, resep1.class);
                sendMakanan.putExtra("MyMakanan", getMakanan);
                startActivity(sendMakanan);
            }
        });


    }

    private void getMenu() {
        Collections.addAll(menu13, bahan13);
    }
}
