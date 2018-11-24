package leco.guru.threetorah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view){

        EditText editText = (EditText) findViewById(R.id.treeInput);
        EditText cubic = (EditText) findViewById(R.id.cubicOutPut);
        EditText total = (EditText) findViewById(R.id.totalOutPut);

        Integer tree = 0;

        Integer treeReposition = 0;

        BigDecimal totalPrice = new BigDecimal(0);
        if(editText != null && editText.getText() != null){
            tree = Integer.parseInt(editText.getText().toString());
        }

        if(tree > 0){
            totalPrice = new BigDecimal(tree * 0.75);
            treeReposition = tree * 6;
        }

        cubic.setText(String.format("Replantar: %s", treeReposition.toString()));
        total.setText(String.format("Valor total : R$ %s", totalPrice.toString()));
    }
}
