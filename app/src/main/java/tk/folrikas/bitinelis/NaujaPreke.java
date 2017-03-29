package tk.folrikas.bitinelis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class NaujaPreke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nauja_preke);
    final Spinner Tipas = (Spinner) findViewById(R.id.TipasSelect);
        List<String> list = new ArrayList<String>();
        list.add("Medus");
        list.add("Pikis");
        list.add("Bičių duonelė");
        list.add("Žiedadulkės");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Tipas.setAdapter(dataAdapter);
    }
}
