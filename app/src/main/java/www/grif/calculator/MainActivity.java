package www.grif.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
    buttonc,button10, buttonadd, buttonsub, buttonmultiply, buttondiv, buttonequal;

  EditText editText;
  Float mValueone,mValuetwo;
   boolean   Addition,subtraction,divison,multiplication;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button)findViewById(R.id.bt_button0_id);
        button1 = (Button)findViewById(R.id.bt_button1_id);
        button2 = (Button) findViewById(R.id.bt_button2_id);
        button3 = (Button) findViewById(R.id.bt_button3_id);
        button4 = (Button) findViewById(R.id.bt_button4);
        button5 = (Button) findViewById(R.id.bt_button5_id);
        button6 = (Button) findViewById(R.id.bt_button6_id);
        button7 = (Button)  findViewById(R.id.bt_button7_id);
        button8 = (Button) findViewById(R.id.bt_button8_id);
        button9 = (Button) findViewById(R.id.bt_button9_id);
        button10 = (Button) findViewById(R.id.bt_buttondot_id);
        buttonadd = (Button) findViewById(R.id.bt_buttonadd_id);
        buttonc = (Button) findViewById(R.id.bt_buttonc_id);
        buttondiv = (Button) findViewById(R.id.bt_buttondiv_id);
        buttonequal = (Button)findViewById(R.id._buttonequal_id);
        buttonmultiply = (Button)findViewById(R.id.bt_buttonmult_id);
        buttonsub = (Button)findViewById(R.id.bt_buttonsub_id);
        editText = (EditText)findViewById(R.id.et_display_id);




       button0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"0");
           }
       });
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"1");
           }
       });
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"2");
           }
       });
       button3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"3");
           }
       });
       button4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"4");
           }
       });
       button5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"5");
           }
       });
       button6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"6");
           }
       });
       button7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"7");
           }
       });
       button8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"8");
           }
       });
       button9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"9");
           }
       });
       buttonadd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(editText== null) {
                   editText.setText("");
               }else{
                   mValueone = Float.parseFloat(editText.getText()+"");
                   Addition = true;
                   editText.setText(null);
               }
           }
       });
       buttonsub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mValueone=Float.parseFloat(editText.getText()+"");
               subtraction = true;
               editText.setText(null);
           }
       });
       buttonmultiply.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mValueone = Float.parseFloat(editText.getText()+"");
               multiplication = true;
               editText.setText(null);
           }
       });
       buttondiv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mValueone = Float.parseFloat(editText.getText()+"");
               divison = true;
               editText.setText(null);
           }
       });
       buttonequal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mValuetwo = Float.parseFloat(editText.getText()+"");
               if (Addition == true){
                   editText.setText(mValueone + mValuetwo + "");
                   Addition = false;

               }
               if (subtraction == true){
                   editText.setText(mValueone -mValuetwo + "");
                   subtraction = false;
               }
               if (multiplication == true){
                   editText.setText(mValueone * mValuetwo + "");
                   multiplication = false;

               }
               if(divison == true){
                   editText.setText(mValueone / mValuetwo + "");
                   divison = false;
               }
           }
       });
       buttonc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText("");
           }
       });

       button10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText





















                       .getText() + ".");
           }
       });






    }


}
