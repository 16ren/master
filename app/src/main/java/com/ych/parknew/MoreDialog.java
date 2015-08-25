package com.ych.parknew;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by dell on 2015/8/24.
 */
public class MoreDialog extends DialogFragment {
    private RelativeLayout relativeLayout1;
    private RelativeLayout relativeLayout2;
    private RelativeLayout relativeLayout3;
    private FloatingActionButton fb_addpark;
    private FloatingActionButton fb_resetblu;
    private FloatingActionButton fb_searchblu;
    private CardView cv_addpark;
    private CardView cv_resetblu;
    private CardView cv_searchblu;


    static MoreDialog newInstance() {
        MoreDialog f = new MoreDialog();
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.MaterialStyle);
  /*      getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(100, 255, 255, 255)));*/
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(230, 255, 255, 255)));
        new ShowTask().execute(new Long(70));
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_more, container);
        relativeLayout1 = (RelativeLayout) view.findViewById(R.id.rootLayout1);
        relativeLayout2 = (RelativeLayout) view.findViewById(R.id.rootLayout2);
        relativeLayout3 = (RelativeLayout) view.findViewById(R.id.rootLayout3);
        fb_addpark=(FloatingActionButton)view.findViewById(R.id.fb_popu_addpark);
        fb_resetblu=(FloatingActionButton)view.findViewById(R.id.fb_popu_resetblu);
        fb_searchblu=(FloatingActionButton)view.findViewById(R.id.fb_popu_findblu);
        cv_addpark=(CardView)view.findViewById(R.id.cv_more_addpark);
        cv_resetblu=(CardView)view.findViewById(R.id.cv_more_resetblu);
        cv_searchblu=(CardView)view.findViewById(R.id.cv_more_searchblu);


        return view;
    }

    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.fb_popu_addpark||v.getId()==R.id.cv_more_addpark){

            }else if (v.getId()==R.id.fb_popu_findblu||v.getId()==R.id.cv_more_searchblu){

            }else if (v.getId()==R.id.fb_popu_resetblu||v.getId()==R.id.cv_more_resetblu){

            }
        }
    };
    private class ShowTask extends AsyncTask<Long, Integer, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Long... params) {
            for (int i = 0; i < 3; i++) {
                publishProgress(i);
                try {
                    Thread.sleep(params[0]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            switch (values[0]) {
                case 0:
                    relativeLayout3.setVisibility(View.VISIBLE);
                    break;
                case 1:
                    relativeLayout2.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    relativeLayout1.setVisibility(View.VISIBLE);
                    break;
            }
            super.onProgressUpdate(values);
        }
    }
    private class DismTask extends AsyncTask<Long, Integer, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Long... params) {
            for (int i = 0; i < 3; i++) {
                publishProgress(i);
                try {
                    Thread.sleep(params[0]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            switch (values[0]) {
                case 0:
                    relativeLayout1.setVisibility(View.GONE);
                    break;
                case 1:
                    relativeLayout2.setVisibility(View.GONE);
                    break;
                case 2:
                    relativeLayout3.setVisibility(View.GONE);
                    break;
            }
            super.onProgressUpdate(values);
        }
    }
}
