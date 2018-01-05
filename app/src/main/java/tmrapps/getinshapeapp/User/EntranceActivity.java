package tmrapps.getinshapeapp.User;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;

import tmrapps.getinshapeapp.R;

public class EntranceActivity extends Activity implements EntranceFragment.OnFragmentInteractionListener, LogFragment.OnFragmentInteractionListener, SignFragment.OnFragmentInteractionListener {

    private EntranceFragment entranceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);
        entranceFragment = (EntranceFragment) getFragmentManager().findFragmentById(R.id.main_fragment);
    }

    @Override
    public void onEntranceFragmentInteraction(int signOrLog) {
        if (signOrLog == 1) {
            showSignFragment();

        } else if (signOrLog == 2) {
            showLogFragment();
        }
    }

    void showSignFragment(){
        SignFragment frag = SignFragment.newInstance();

        FragmentTransaction tran = getFragmentManager().beginTransaction();
        tran.hide(entranceFragment);

        tran.add(R.id.main_fragment_container,frag);
        tran.addToBackStack("tran21");///???????????????????
        tran.commit();
    }

    void showLogFragment(){
        LogFragment frag = LogFragment.newInstance();

        FragmentTransaction tran = getFragmentManager().beginTransaction();
        tran.hide(entranceFragment);

        tran.add(R.id.main_fragment_container,frag);
        tran.addToBackStack("tran21");///???????????????????
        tran.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
