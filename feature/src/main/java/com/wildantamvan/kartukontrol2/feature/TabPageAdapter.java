//package com.wildantamvan.kartukontrol2.feature;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
////import android.support.v4.app.FragmentStatePagerAdapter;
//import android.support.v4.app.FragmentPagerAdapter;
//        import android.support.v4.app.DialogFragment;
//        import android.support.v4.app.FragmentActivity;
//import android.support.v4.app.FragmentStatePagerAdapter;
//
///**
// * Created by wildan on 1/4/2018.
// */
//public class TabPageAdapter extends FragmentStatePagerAdapter {
//    int mNumOfTabs;
//
//    public TabPageAdapter(FragmentManager fm, int NumOfTabs) {
//        super(fm);
//        this.mNumOfTabs = NumOfTabs;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//
//        switch (position) {
//            case 0:
//                Tabawal tab1 = new Tabawal();
//                return tab1;
//            case 1:
//                SecondFragment tab2 = new SecondFragment();
//                return tab2;
//            case 2:
//                ThirdFragment tab3 = new ThirdFragment();
//                return tab3;
//            default:
//                return null;
//        }
//    }
//
//    @Override
//    public int getCount() {
//        return mNumOfTabs;
//    }
//}