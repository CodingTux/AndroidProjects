package planets.project.com.boaring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText pass = (EditText) findViewById(R.id.pass);

        Button login = (Button) findViewById(R.id.login);


        if (login != null) {
            login.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (pass == username) {

                                TextView output = (TextView) findViewById(R.id.output);
                                assert output != null;
                                output.setText("You successfully logged in");


                            } else {
                                TextView output = (TextView) findViewById(R.id.output);
                                assert output != null;
                                output.setText("Wrong username or password");
                            }

                        }

                    });
        }


    }}
