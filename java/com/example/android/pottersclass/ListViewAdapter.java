package com.example.android.pottersclass;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author GBOGBOADE AYOMIDE
 */
public class ListViewAdapter extends ArrayAdapter<ChapterContent> {

    LayoutInflater layoutInflater;

    public ListViewAdapter(Activity context, ArrayList<ChapterContent> chapterContents) {
        super(context, R.layout.listview_layout, chapterContents);
        //layoutInflater = LayoutInflater.from(getContext());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.listview_layout, null);
        }
        ChapterContent chapterContent = getItem(position);
        TextView topicTextView = (TextView) listView.findViewById(R.id.topic_texview);
        topicTextView.setText(chapterContent.getTopic());
        return listView;
    }
}
