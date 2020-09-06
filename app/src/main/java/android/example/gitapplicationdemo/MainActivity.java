package android.example.gitapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etName;
        final TextView tvName;
        Button btnHello;

        etName = findViewById(R.id.etName);
        tvName = findViewById(R.id.tvHelloName);
        btnHello = findViewById(R.id.button);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText("Hello " + etName.getText().toString());
            }
        });
    }
}
