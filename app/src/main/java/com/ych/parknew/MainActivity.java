package com.ych.parknew;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private CollapsingToolbarLayout mcollapsingToolbarLayout;
    private SwipeRefreshLayout mswipeRefreshLayout;
    private AppBarLayout mappBarLayout;
    private FloatingActionButton mfloatingActionButton;

    private ActionBar mactionBar;
    private List<Park> parks = null;

    {
        parks = new ArrayList<Park>();
        parks.add(new Park("20:C3:8F:C1:11:D0", "E0", "E1", "1B9CCF246FF7", "上海市杨浦区政立路477号", "vip001", "006009"));
        parks.add(new Park("20:C3:8F:C1:11:E6", "E0", "E1", "1019CB7EB10C", "上海市杨浦区政立路477号", "vip002", "006007"));
        parks.add(new Park("5C:31:3E:4D:77:9A", "E0", "E1", "F0943FB6EA47", "上海市杨浦区政立路477号", "vip003", "006008"));
        parks.add(new Park("5C:31:3E:4D:81:FC", "E0", "E1", "7AD0E0E33E15", "上海市杨浦区政立路477号", "vip004", "006006"));
        parks.add(new Park("20:C3:8F:C1:13:C2", "E0", "E1", "0C3917495BCA", "上海市杨浦区政立路477号", "vip005", "006010"));
        parks.add(new Park("C4:BE:84:08:24:D5", "E0", "E1", "5B383FFB4152", "上海市杨浦区政立路477号", "vip006", "0060011"));
        parks.add(new Park("C4:BE:84:08:24:A9", "E0", "E1", "D379153E82B7", "上海市杨浦区政立路477号", "vip007", "0060013"));
        parks.add(new Park("C4:BE:84:08:24:C6", "E0", "E1", "C59A7713EFD3", "上海市杨浦区政立路477号", "vip008", "0060012"));
        parks.add(new Park("5C:31:3E:4D:74:62", "E0", "E1", "595E0B8F52EF", "上海市杨浦区政立路477号", "vip009", "0060014"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mactionBar=getSupportActionBar();
       /* mToolbar=(Toolbar)findViewById(R.id.maintoolbar);
        setSupportActionBar(mToolbar);
        mActionBar=getSupportActionBar();
*/
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mcollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        mappBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        mfloatingActionButton=(FloatingActionButton)findViewById(R.id.fb_main_more);
        mfloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoreDialog.newInstance().show(getSupportFragmentManager(), "moredialog");
            }
        });


        mcollapsingToolbarLayout.setTitle("Park");
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mRecyclerView.setAdapter(new MyAdpter(parks));



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=new MenuInflater(this);
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_doc:
                startActivity(new Intent(getApplicationContext(),DocActivity.class));
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
