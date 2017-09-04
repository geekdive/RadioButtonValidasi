package id.co.decoded.moeslim.radiobuttonvalidasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class homeActivity extends AppCompatActivity {

    RadioButton rbStandard;
    RadioButton rbMidnight;
    Button btCek, btUncekAll;
    TextView txTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rbStandard = (RadioButton)findViewById(R.id.rbStandard);
        rbMidnight = (RadioButton)findViewById(R.id.rbMidnight);
        txTemp = (TextView)findViewById(R.id.txtTampung);

        btUncekAll = (Button)findViewById(R.id.btnUncheck);
        btUncekAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uncekrb();
            }
        });

        btCek = (Button)findViewById(R.id.btnCek);
        btCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbStandard.isChecked()){
                    Toast.makeText(homeActivity.this, "Anda Memilih Standard Delivery", Toast.LENGTH_LONG).show();
                    txTemp.setText("Result: Standard Delivery");
                }else if (rbMidnight.isChecked()){
                    Toast.makeText(homeActivity.this, "Anda Memilih Midnight Delivery", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(homeActivity.this, "Maaf, pilih dulu delivery yang anda tuju!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void uncekrb(){
        if (rbStandard.isChecked() || rbMidnight.isChecked()){
            rbMidnight.setChecked(false);
            rbStandard.setChecked(false);
        }
    }

}
