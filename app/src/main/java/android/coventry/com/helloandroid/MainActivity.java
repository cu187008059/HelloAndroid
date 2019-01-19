package android.coventry.com.helloandroid;

import android.content.DialogInterface;
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
        initDisplayyButton();
    }

    private void initDisplayyButton(){
        Button displayButton = (Button) findViewById(R.id.btnDisplay);
        displayButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editName = (EditText)findViewById(R.id.txtName);
                TextView txtDisplay = (TextView)findViewById(R.id.lblDisplay);
                String nameToDisplay = editName.getText().toString();
                txtDisplay.setText("Hello " + nameToDisplay);
        }

    });
}}
