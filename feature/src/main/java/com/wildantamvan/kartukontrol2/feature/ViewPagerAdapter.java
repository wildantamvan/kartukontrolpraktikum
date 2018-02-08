//package com.wildantamvan.kartukontrol2.feature;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentStatePagerAdapter;
//
///**
// * Created by wildan on 1/4/2018.
// */
//
//class ViewPagerAdapter extends FragmentStatePagerAdapter{
//    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
//    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created
//
//
//    // Build a Constructor and assign the passed Values to appropriate values in the class
//    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
//        super(fm);
//
//        this.Titles = mTitles;
//        this.NumbOfTabs = mNumbOfTabsumb;
//
//    }
//
//    //This method return the fragment for the every position in the View Pager
//    @Override
//    public Fragment getItem(int position) {
//
//        if(position == 0) // if the position is 0 we are returning the First tab
//        {
//            Tab1 tab1 = new Tab1();
//            return tab1;
//        }
//        else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
//        {
//            Tab2 tab2 = new Tab2();
//            return tab2;
//        }
//
//
//    }
//    String[] daftar;
//    ListView ListView01;
//    Menu menu;
//    protected Cursor cursor;
//    DataHelper dbcenter;
//    public static MainActivity ma;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button btn=(Button)findViewById(R.id.button2);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // TODO Auto-generated method stub
//                Intent inte = new Intent(MainActivity.this, Loginact.class);
//                startActivity(inte);
//            }
//        });
//
//
//        ma = this;
//        dbcenter = new DataHelper(this);
//        RefreshList();
//    }
//
//    public void RefreshList(){
//        SQLiteDatabase db = dbcenter.getReadableDatabase();
//        cursor = db.rawQuery("SELECT * FROM karkon2",null);
//        daftar = new String[cursor.getCount()];
//        cursor.moveToFirst();
//        for (int cc=0; cc < cursor.getCount(); cc++){
//            cursor.moveToPosition(cc);
//            daftar[cc] = cursor.getString(1).toString();
//        }
//        ListView01 = (ListView)findViewById(R.id.listView1);
//        ListView01.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
//        ListView01.setSelected(true);
//        ListView01.setOnItemClickListener(new OnItemClickListener() {
//
//
//            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
//                final String selection = daftar[arg2]; //.getItemAtPosition(arg2).toString();
//                final CharSequence[] dialogitem = {"Lihat Pertemuan", "Update Pertemuan", "Hapus Pertemuan"};
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Pilihan");
//                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int item) {
//                        switch(item){
//                            case 0 :
//                                Intent i = new Intent(getApplicationContext(), Lihatkarkon.class);
//                                i.putExtra("nama", selection);
//                                startActivity(i);
//                                break;
//                            case 1 :
//                                Intent in = new Intent(getApplicationContext(), Loginactupdate.class);
//                                in.putExtra("nama", selection);
//                                startActivity(in);
//                                break;
//                            case 2 :
////                                Intent ind = new Intent(getApplicationContext(), Logindelete.class);
////                                ind.putExtra("nama", selection);
////                                startActivity(ind);
//
//                                SQLiteDatabase db = dbcenter.getWritableDatabase();
//                                db.execSQL("delete from karkon2 where nama = '"+selection+"'");
//                                RefreshList();
//                                break;
//                        }
//                    }
//                });
//                builder.create().show();
//            }});
//        ((ArrayAdapter)ListView01.getAdapter()).notifyDataSetInvalidated();
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public void onFragmentInteraction(Uri uri) {
//
//    }
//}
