package tk.folrikas.bitinelis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button mygtukas = (Button) findViewById(R.id.prisijungti);
        Button mygtukas2 = (Button) findViewById(R.id.registruotis);
        mygtukas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(LoginActivity.this, MenuActivity.class);

                // currentContext.startActivity(activityChangeIntent);
                // kazkas naujo

                LoginActivity.this.startActivity(activityChangeIntent);
            }
        });
        mygtukas2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(LoginActivity.this, RegisterActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                LoginActivity.this.startActivity(activityChangeIntent);
            }
        });
    }
}
