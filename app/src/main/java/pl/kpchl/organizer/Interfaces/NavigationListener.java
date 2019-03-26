package pl.kpchl.organizer.Interfaces;

import android.support.v4.app.Fragment;

public interface NavigationListener {
    void changeFragment(Fragment fragment, Boolean addToBackStack);
}
