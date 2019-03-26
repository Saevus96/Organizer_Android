package pl.kpchl.organizer.Fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

import pl.kpchl.organizer.Interfaces.NavigationListener;

public class BaseFragment extends Fragment {
    NavigationListener navigationListener;

    public NavigationListener getNavigationsInteractions(){
        return navigationListener;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof NavigationListener){
            navigationListener = (NavigationListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        navigationListener = null;
    }

}