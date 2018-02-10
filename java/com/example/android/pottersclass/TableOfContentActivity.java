package com.example.android.pottersclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * @author GBOGBOADE AYOMIDE MICHEAL
 */
public class TableOfContentActivity extends AppCompatActivity {
    ListView tableOfContentListView;
    ChaptersContainer chaptersContainer = new ChaptersContainer();
    ArrayList<ChapterContent> chapters = chaptersContainer.getChapterList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_content);
        tableOfContentListView = (ListView) findViewById(R.id.table_of_content_listview);
        ArrayList<String> list = chaptersContainer.getChaptersTopicsList();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.listview_layout, list);
        tableOfContentListView.setAdapter(adapter);
        tableOfContentListView.setOnItemClickListener(itemClickListener);

    }

    private AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent openChapter = new Intent(getApplicationContext(), ChapterActivity.class);
            startActivity(openChapter);
            ChapterActivity.CHAPTER_ID = position;
        }
    };
}
