package fpoly.huynvph52251.lab4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewPager2 extends FragmentStateAdapter {
    public MyViewPager2(FragmentActivity frg){
        super(frg);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        if (position == 0){
            fragment = new bai3_Fragment02();
        }else {
            fragment = new bai3_Fragment01();
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
