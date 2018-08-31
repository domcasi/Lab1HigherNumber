package iics.casino.dominicmichael.lab1highernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button HigherNumGo =(Button) findViewById(R.id.HigherNumGoButton);

        HigherNumGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView HigherNum = (TextView) findViewById(R.id.HigherNumTextView);
                EditText HigherNumN = (EditText) findViewById(R.id.HighNumN);
                EditText HigherNumM = (EditText) findViewById(R.id.HighNumM);
                int n = Integer.parseInt(HigherNumN.getText().toString());
                int m = Integer.parseInt(HigherNumM.getText().toString());
                if(n>m)
                    HigherNum.setText(n + " is higher than " + m);
                else if(n<m)
                    HigherNum.setText(m + " is higher than " + n);
                else
                    HigherNum.setText(n + " and " + m + " are the same the number.");

            }



        });

    }
}
