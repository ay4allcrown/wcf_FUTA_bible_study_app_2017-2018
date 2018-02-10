package com.example.android.pottersclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ChapterActivity extends AppCompatActivity {

    TextView topicTextView;
    TextView textTextView;
    TextView memoryVerseTextView;
    TextView introTextView;
    TextView outlineTextView;
    TextView conclusionTextView;
    TextView questionTextView;
    TextView pointOfRTextView;
    TextView messageTextView;

    public static int CHAPTER_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        topicTextView = (TextView) findViewById(R.id.topic_texview);
        textTextView = (TextView) findViewById(R.id.texts_textView);
        memoryVerseTextView = (TextView) findViewById(R.id.memory_verse_textView);
        introTextView = (TextView) findViewById(R.id.introduction_textView);
        outlineTextView = (TextView) findViewById(R.id.outline_textView);
        messageTextView = (TextView) findViewById(R.id.message_textView);
        conclusionTextView = (TextView) findViewById(R.id.conclusion_textView);
        questionTextView = (TextView) findViewById(R.id.question_textView);
        pointOfRTextView = (TextView) findViewById(R.id.point_of_reflection_textView);

        ChaptersContainer chaptersContainer = new ChaptersContainer();
        ChapterContent chapterContent = chaptersContainer.getChapterContent(CHAPTER_ID);
        setAll(chapterContent.getTopic(), chapterContent.getText(), chapterContent.getMemoryVerse(),
                chapterContent.getIntroduction(),chapterContent.getMessage(),
                chapterContent.getOutline(),chapterContent.getConclusion(),chapterContent.getQuestions(),chapterContent.getPointOfR());
    }


    /**
     * Method to set content of the chapter activity
     * @param topic - Topic of chapter
     * @param text - Bible text(s) of chapter
     * @param mv - memory verse
     * @param intro - Introduction text
     * @param message - message
     * @param outline - chapter outline
     * @param conclusion - chpter conclusion
     * @param questions - chapter questions if none put null
     * @param pointOfR - point of reflection
     */

    public void setAll(String topic, String text, String mv, String intro, String message,
                       String outline , String conclusion, String questions, String pointOfR) {
        topicTextView.setText(getString(R.string.topic_textview_text, topic));
        textTextView.setText(getString(R.string.text_textview, text));
        memoryVerseTextView.setText(getString(R.string.memory_verse, mv));
        if (intro == null) {
            introTextView.setVisibility(View.GONE);
        } else {
            introTextView.setText(getString(R.string.introduction_textview_text, intro));
        }
        if (message == null) {
            messageTextView.setVisibility(View.GONE);
        } else {
            messageTextView.setText(getString(R.string.message_textview_text, message));
        }
        if (outline == null) {
            outlineTextView.setVisibility(View.GONE);
        } else {
            outlineTextView.setText(getString(R.string.outline_textview_text,outline));
        }
        if (conclusion == null) {
            conclusionTextView.setVisibility(View.GONE);
        } else {
            conclusionTextView.setText(getString(R.string.conclusion_textview_text, conclusion));
        }
        if (questions == null) {
            questionTextView.setVisibility(View.GONE);
        } else {
            questionTextView.setText(getString(R.string.question_textview_text, questions));
        }
        pointOfRTextView.setText(pointOfR);
    }
}
