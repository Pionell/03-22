package tk.folrikas.bitinelis;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class NaujaPreke extends Activity {

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
        list2.add("Priimami");
        list2.add("Nepriimami");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ind_uzsakymas.setAdapter(dataAdapter2);

        final Spinner medaus_rusiss = (Spinner) findViewById(R.id.medaus_rusis);
        List<String> list3 = new ArrayList<String>();
        list3.add("pavasarinis");
        list3.add("miško");
        list3.add("kreminis");
        list3.add("grikių");
        list3.add("aviečių");
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list3);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        medaus_rusiss.setAdapter(dataAdapter3);

        final Spinner ipakavim_rusiss = (Spinner) findViewById(R.id.ipakavimo_rusis);
        List<String> list4 = new ArrayList<String>();
        list4.add("dovaninis");
        list4.add("paprastas");
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list4);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ipakavim_rusiss.setAdapter(dataAdapter4);
    }
}

