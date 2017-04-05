package tk.folrikas.bitinelis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button mygtukas3 = (Button) findViewById(R.id.veikla);
        mygtukas3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(MenuActivity.this, NaujaPreke.class);

                // currentContext.startActivity(activityChangeIntent);
                // kazkas naujo

                MenuActivity.this.startActivity(activityChangeIntent);
            }
        });
    }
}
