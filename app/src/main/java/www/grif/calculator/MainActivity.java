package www.grif.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
    buttonc,button10, buttonadd, buttonsub, buttonmultiply, buttondiv, buttonequal














    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonzero = (Button)findViewById(R.id.bt_button0_id);
        buttonzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        Button buttonone = (Button)findViewById(R.id.bt_button1_id);
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() +"1");
            }
        });


    }


}
