package fpoly.huynvph52251.lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class bai2_Fragment01 extends Fragment {
    public TextView tv2frg1;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.bai2_frg01,container,false);
        tv2frg1 = view.findViewById(R.id.tv2frg1);
        return view;
    }
}
