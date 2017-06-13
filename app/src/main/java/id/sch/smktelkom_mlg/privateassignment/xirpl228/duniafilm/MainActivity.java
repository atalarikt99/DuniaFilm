package id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.fragment.NowFragment;
import id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.fragment.SavedFragment;
import id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.fragment.SoonFragment;
import id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.fragment.TopRatedFragment;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        setTitle("Dunia Film");
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    public static class PlaceholderFragment extends Fragment
    {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment(){}

        public static PlaceholderFragment newInstance(int sectionNumber)
        {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter
    {
        public SectionsPagerAdapter(FragmentManager fm)
        {super(fm);}

        @Override
        public Fragment getItem(int position)
        {
            if (position == 0) {
                setTheme(R.style.AppTheme);
                return new NowFragment();
            } else if (position == 1) {
                setTheme(R.style.AppTheme_Green);
                return new SoonFragment();
            } else if (position == 2) {
                setTheme(R.style.AppTheme);
                return new TopRatedFragment();
            } else if (position == 3) {
                setTheme(R.style.AppTheme);
                return new SavedFragment();
            } else {
                return PlaceholderFragment.newInstance(position + 1);
            }
        }

        @Override
        public int getCount()
        {
            return 4;
        }
        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position) {
                case 0:
                    return "Now Playing";
                case 1:
                    return "Coming Soon";
                case 2:
                    return "Top Rated";
                case 3:
                    return "Saved";
            }
            return null;
        }
    }
}
