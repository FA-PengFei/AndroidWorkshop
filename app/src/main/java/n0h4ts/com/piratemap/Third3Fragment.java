package n0h4ts.com.piratemap;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Third3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Third3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Third3Fragment() {
        // Required empty public constructor
    }

    /**
     * HELLO ITS ME AGAIN ---- FLAGFLAGFLAG.
     */
    // TODO: Rename and change types and number of parameters
    public static Third3Fragment newInstance(String param1, String param2) {
        Third3Fragment fragment = new Third3Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_third3, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle extras = getActivity().getIntent().getExtras();
        String userName = "";
        String passcode = "";
        if (extras != null) {
            userName = extras.getString("name");
            passcode = extras.getString("passcode");
        }

        if(userName.equals("PF_IS_KING") & passcode.equals("N0H4TS_IS_THE_BEST")){
            TextView textview = view.findViewById(R.id.editFlag3);
            textview.setText("ysqgDRGjkOaqrbJoSmOrjb/H85hxNpx+ttcy1VvVcAEQ6f5A/r63i7IhcP65E8x+3R2w3/MSsdjl169EZBLraA==");
        }

    }
}