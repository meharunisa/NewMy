package com.example.madamkinza.newmy;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.all);
        class SingleRow{
            String title;
            String description;

            public SingleRow(String title, String description) {
            }
        }
        class NewMyAdapter extends BaseAdapter {
           ArrayList<SingleRow>list;
           NewMyAdapter(Context c){
               list=new ArrayList<SingleRow>();
               Resources res = c.getResources();
               String[] titles = res.getStringArray(R.array.titles);
               String[] descriptions = res.getStringArray(R.array.descriptions);
               for(int i=0;i<1000;i++)
               {
                   list.add(new SingleRow(titles[i],descriptions[i]));
               }


           }

            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public Object getItem(int i) {
                return list.get(i);
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return null;
            }
        }
    }
}
