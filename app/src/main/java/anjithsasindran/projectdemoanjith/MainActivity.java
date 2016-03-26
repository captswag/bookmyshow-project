package anjithsasindran.projectdemoanjith;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import anjithsasindran.projectdemoanjith.fragments.EventDiscoveryFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getSupportFragmentManager();
        setupEventDiscoveryFragment();
    }

    public void setupEventDiscoveryFragment() {
        mFragmentManager.beginTransaction()
                .add(R.id.root_container, new EventDiscoveryFragment())
                .commit();
    }
}