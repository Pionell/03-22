package tk.folrikas.bitinelis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button mygtukas = (Button) findViewById(R.id.prisijungti);
        Button mygtukas2 = (Button) findViewById(R.id.registruotis);
//--------------------------------------------
//--------------------------------------------
//-------------------------------------------
        public final static boolean isValidEmail(CharSequence target) {
            if (TextUtils.isEmpty(target)) {
                return false;
            } else {
                return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
            }
        }
        mUsernameView = (EditText) findViewById(R.id.username);
        mPasswordView = (EditText) findViewById(R.id.password);



        mygtukas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mUsernameView.setError(null);
                mPasswordView.setError(null);

                String username = mUsernameView.getText().toString();
                String password = mPasswordView.getText().toString();

                Toast.makeText(LoginActivity.this,
                        username+"\n"+password ,Toast.LENGTH_SHORT).show();

                boolean cancel = false;
                View focusView = null;
                if (!isValid(username)) {
                    mUsernameView.setError(getString(R.string.error_invalid_username));
                    focusView = mUsernameView;
                    cancel = true;
                }
                if (!isValid(password)) {
                    mPasswordView.setError(getString(R.string.error_invalid_password));
                    focusView = mPasswordView;
                    cancel = true;
                }
                if (cancel) {
                    focusView.requestFocus();
                } else {
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);
                }
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
