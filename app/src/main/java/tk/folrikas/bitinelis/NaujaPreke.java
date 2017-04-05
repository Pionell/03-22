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

        final Spinner ind_uzsakymas = (Spinner) findViewById(R.id.ind_uzsakymai);
        List<String> list2 = new ArrayList<String>();
        list.add("Priimami");
        list.add("Nepriimami");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ind_uzsakymas.setAdapter(dataAdapter);

        final Spinner medaus_rusiss = (Spinner) findViewById(R.id.medaus_rusis);
        List<String> list3 = new ArrayList<String>();
        list.add("pavasarinis");
        list.add("miško");
        list.add("kreminis");
        list.add("grikių");
        list.add("aviečių");
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        medaus_rusiss.setAdapter(dataAdapter);

        final Spinner ipakavim_rusiss = (Spinner) findViewById(R.id.ipakavimo_rusis);
        List<String> list4 = new ArrayList<String>();
        list.add("dovaninis");
        list.add("paprastas");
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ipakavim_rusiss.setAdapter(dataAdapter);
    }
}
}
