package fpoly.huynvph52251.lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class bai2_Fragment02 extends Fragment {
    EditText b2Text;
    Button btnb2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.bai2_frg02,container,false);
       b2Text =view.findViewById(R.id.b2Text);
       btnb2 = view.findViewById(R.id.btnb2);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getActivity().getSupportFragmentManager();
                bai2_Fragment01 fragment01 =
                        (bai2_Fragment01) fragmentManager.findFragmentById(R.id.bai2frg1);
                fragment01.tv2frg1.setText(b2Text.getText().toString());
            }
        });
    }
}
