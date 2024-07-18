package fpoly.huynvph52251.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class lab4_bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_bai2);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.bai2frg1,new bai2_Fragment01())
                .commit();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.bai2frg2,new bai2_Fragment02())
                .commit();

    }
}