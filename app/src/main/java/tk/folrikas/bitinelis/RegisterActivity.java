package tk.folrikas.bitinelis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button mygtukas4 = (Button) findViewById(R.id.register_now);

        final EditText mUsernameView = (EditText) findViewById(R.id.new_user);
        final EditText mPasswordNew= (EditText) findViewById(R.id.new_password);
        final EditText mPasswordRepeat = (EditText) findViewById(R.id.new_password_repeat);
        final EditText mNewEmail = (EditText) findViewById(R.id.new_email);



        mygtukas4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mUsernameView.setError(null);
                mPasswordNew.setError(null);
                mPasswordRepeat.setError(null);
                mNewEmail.setError(null);

                String username = mUsernameView.getText().toString();
                String password = mPasswordNew.getText().toString();
                String passwordRepeat = mPasswordRepeat.getText().toString();
                String email = mNewEmail.getText().toString();

                Toast.makeText(RegisterActivity.this,
                        username+"\n"+password+"\n"+passwordRepeat+"\n"+email ,Toast.LENGTH_SHORT).show();

                boolean cancel = false;
                View focusView = null;
                if (!isValid(username)) {
                    mUsernameView.setError(getString(R.string.error_invalid_username));
                    focusView = mUsernameView;
                    cancel = true;
                }
            if (!isValid(password)) {
                mPasswordNew.setError(getString(R.string.error_invalid_password));
                focusView = mPasswordNew;
                cancel = true;
            }
            if (!passwordRepeat.equals(password)) {
                mPasswordNew.setError(getString(R.string.error_email_match));
                focusView = mPasswordNew;
                cancel = true;
            }
            if (!isValidEmail(email)) {
                mNewEmail.setError(getString(R.string.error_invalid_email));
                focusView = mNewEmail;
                cancel = true;
            }
                if (cancel) {
                    focusView.requestFocus();
                } else {
                    Intent intent = new Intent(RegisterActivity.this, MenuActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
    private boolean isValid(String credentials){
        final String CREDENTIALS_PATTERN = "^([0-9a-zA-Z]{3,15})+$";
        Pattern pattern = Pattern.compile(CREDENTIALS_PATTERN);

        Matcher matcher = pattern.matcher(credentials);
        return matcher.matches();

    }
    private boolean isValidEmail(String credentials){
        final String CREDENTIALS_PATTERN = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+";
        Pattern pattern = Pattern.compile(CREDENTIALS_PATTERN);

        Matcher matcher = pattern.matcher(credentials);
        return matcher.matches();
    }

}
