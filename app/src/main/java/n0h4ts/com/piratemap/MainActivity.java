package n0h4ts.com.piratemap;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import com.scottyab.rootbeer.RootBeer;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import n0h4ts.com.piratemap.databinding.ActivityMain2Binding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        if(isRootDevice()){
            this.finishAffinity();
        }
        //setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
    private boolean isRootDevice() {
        try {
            RootBeer rb = new RootBeer(this);
            if (rb.detectRootCloakingApps()
                    || rb.checkForSuBinary()
                    || rb.checkForDangerousProps()
                    || rb.checkForRWPaths()
                    || rb.checkSuExists()
                    || rb.checkForRootNative()) {
                Log.e("ERR","ROOT DETECTED");
                return true;
            }
        } catch (Exception e) {
            Log.e("ERR","Root check passed");
            e.printStackTrace();
        }
        return false;
    }
}