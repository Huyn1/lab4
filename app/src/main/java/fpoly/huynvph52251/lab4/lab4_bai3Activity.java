package fpoly.huynvph52251.lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class lab4_bai3Activity extends AppCompatActivity {
    TabLayout bai3Tablayout;
    ViewPager2 bai3VP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_bai3);
        bai3Tablayout = findViewById(R.id.bai3Tablayout);
        bai3VP = findViewById(R.id.bai3VP);


        MyViewPager2 viewPager2 = new MyViewPager2(this);
        bai3VP.setAdapter(viewPager2);

        new TabLayoutMediator(bai3Tablayout, bai3VP, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
              switch (position){
                  case 0:
                      tab.setText("Tab1");
                      break;
                  case 1:
                      tab.setText("Tab2");
                      break;
                  default:
                      break;
              }
            }
        }).attach();
    }
}