package redeye.ghostofwar.philamlife.Classes.Fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import redeye.ghostofwar.philamlife.R;

public class calculator extends AppCompatActivity {
CheckBox a, b , c , d, e , f;
int aa = 54000, bb = 40000,cc = 54000,dd = 60000,ee= 54500,ff= 58000;
TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_live_a_healthier_longer_and_better_life);
a =  findViewById(R.id.a);
        b =  findViewById(R.id.b);
        c =  findViewById(R.id.c);
        d =  findViewById(R.id.d);
        e =  findViewById(R.id.e);
        f =  findViewById(R.id.f);
        total = findViewById(R.id.total);
        a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())+aa));
                else
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())- aa));


            }
        });

        b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())+bb));
                else
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())- bb));



            }
        });


        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())+cc));
                else
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())- cc));



            }
        });

        d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())+dd));
                else

                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())- ee));


            }
        });


        e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())+ee));
                else
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())- ee));


            }
        });

        f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked)
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())+ff));
                else
                    total.setText(String.valueOf(Double.parseDouble(total.getText().toString())- ff));


            }
        });



    }

}
