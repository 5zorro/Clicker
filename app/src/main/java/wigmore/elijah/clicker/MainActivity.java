package wigmore.elijah.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonClick;
    Button buttonReset;
    TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick = (Button)findViewById(R.id.buttonClick);
        buttonReset = (Button)findViewById(R.id.buttonReset);
        textCount = (TextView)findViewById(R.id.textViewCount);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = textCount.getText().toString();

                int value = Integer.parseInt(countValue);
                value++;

                textCount.setText(String.valueOf(value));
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCount.setText(String.valueOf(0));
            }
        });
    }
}
