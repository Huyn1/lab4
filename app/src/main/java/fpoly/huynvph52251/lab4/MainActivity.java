package fpoly.huynvph52251.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Fragment1 frg1;
Fragment2 frg2;
Button btnfg1,btnfg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frg1 = new Fragment1();
        frg2 = new Fragment2();
        btnfg1 = findViewById(R.id.btnfg1);
        btnfg2 = findViewById(R.id.btnfg2);
        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container,frg1)
                    .commit();
        }
        btnfg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,frg1)
                        .commit();
            }
        });
        btnfg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,frg2)
                        .commit();
            }
        });
    }
}