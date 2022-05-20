package Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import fragment.Favorite_pageFragment;
import fragment.Find_pageFragment;
import fragment.Home_pageFragment;

public class ViewPageAdapter extends FragmentStatePagerAdapter {

//    private ArrayList<Fragment> arrayFragment = new ArrayList<>();
//    private ArrayList<String> arraytitle = new ArrayList<>();

    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Home_pageFragment();
            case 1:
                return new Find_pageFragment();
            case 2:
                return new Favorite_pageFragment();
            default:
                return new Home_pageFragment();
        }
//        return arrayFragment.get(position);
    }

    @Override
    public int getCount() {
        return 3;
//        return arrayFragment.size();
    }

//    public void addFragment(Fragment fragment, String title){
//        arrayFragment.add(fragment);
//        arraytitle.add(title);
//    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch (position){
            case 0:
                title = "Home";
                break;
            case 1:
                title = "Find";
                break;
            case 2:
                title = "Favorite";
                break;
        }
        return  title;

//        return arraytitle.get(position);
    }
}
