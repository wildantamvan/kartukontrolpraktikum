//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentStatePagerAdapter;
//
//import com.wildantamvan.kartukontrol2.feature.TabADPL;
//import com.wildantamvan.kartukontrol2.feature.Tabawal;
//
///**
// * Created by wildan on 1/4/2018.
// */
//
//public class PagerAdapter extends FragmentStatePagerAdapter {
//
//    int nooftabs;
//    public PagerAdapter(FragmentManager fm, int numberoftabs){
//        super(fm);
//        this.nooftabs=numberoftabs;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        switch (position){
//
//            case 0:
//                Tabawal tab1 = new Tabawal();
//return tab1;
//            case 1:
//                TabADPL tab2 = new TabADPL();
//                return tab2;
//                default:
//            return null;
//
//        }
//    }
//
//    @Override
//    public int getCount() {
//        return nooftabs;
//    }
//}
