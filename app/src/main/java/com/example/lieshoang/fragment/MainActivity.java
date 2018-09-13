package com.example.lieshoang.fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    // khai báo các fragment se hiện thị
    private HomeFragment home;
    private NewsFragment news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        home = new HomeFragment();
        news = new NewsFragment();
    }

    public void showHomeActivity(View view) {
        // khai báo transaction để quanr ly viec chuyen doi  transaction de quan ly ciec chuyen doi cac fragment
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        //ẩn tất cả các fragment đang hiển thị
        if (news.isAdded()) {
            ft.hide(news);
        }

        //hiển thị fragment mong muốn
        if (home.isAdded()) {
          //  ft.show(home);
        } else {
            ft.add(R.id.flkhung, home);
        }

        //yêu cầu thay đổi được chấp thuận
        ft.commit();
    }

    public void showNewsAcivity(View view) {
        // khai báo transaction để quanr ly viec chuyen doi  transaction de quan ly ciec chuyen doi cac fragment
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        //ẩn tất cả các fragment đang hiển thị
        if (home.isAdded()) {
            ft.hide(home);
        }

        //hiển thị fragment mong muốn
        if (news.isAdded()) {
          //  ft.show(news);
        } else {
            ft.add(R.id.flkhung, news);
        }


        //yêu cầu thay đổi được chấp thuận
        ft.commit();

    }
}
