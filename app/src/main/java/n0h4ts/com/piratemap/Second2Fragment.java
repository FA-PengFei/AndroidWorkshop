package n0h4ts.com.piratemap;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.snackbar.Snackbar;

import java.math.BigInteger;
import java.security.MessageDigest;

import n0h4ts.com.piratemap.databinding.FragmentSecond2Binding;

public class Second2Fragment extends Fragment {
    private String checkerboi;
    private FragmentSecond2Binding binding;
    public native String Predict();
    static{
        System.loadLibrary("n0h4ts");
    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecond2Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkerboi = hexagonal(binding.editFlag2.getText().toString());
                Log.d("Check",checkerboi);
                if (checkerboi.equals(Predict())) {
                    NavHostFragment.findNavController(Second2Fragment.this)
                            .navigate(R.id.action_Second2Fragment_to_3Fragment);
                }
                else {
                    Snackbar.make(view, "Good try, but TRY HARDER", Snackbar.LENGTH_LONG).show();
                }
            }

        });
    }
    public String hexagonal(String value){
        String killer = "";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(value.getBytes("utf8"));
            killer = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e){
            e.printStackTrace();
        }
        return killer;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}