package com.example.android.pottersclass;

public class ChapterContent{

    String topic;
    String text;
    String memoryVerse;
    String introduction;
    String outline;
    String message;
    String conclusion;
    String questions;
    String pointOfR;

    /**
     * Chapter content
     * @param topic
     * @param text
     * @param memoryVerse
     * @param introduction
     * @param message
     * @param outline
     * @param conclusion
     * @param questions
     * @param pointOfR
     */
    public ChapterContent(String topic, String text, String memoryVerse,
                          String introduction, String message, String outline,
                          String conclusion, String questions, String pointOfR) {
        this.topic = topic;
        this.text = text;
        this.memoryVerse = memoryVerse;
        this.introduction = introduction;
        this.outline = outline;
        this.message = message;
        this.conclusion = conclusion;
        this.questions = questions;
        this.pointOfR = pointOfR;
    }

    public String getTopic() {
        return topic;
    }

    public String getText() {
        return text;
    }

    public String getMemoryVerse() {
        return memoryVerse;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getOutline() {
        return outline;
    }

    public String getMessage() {
        return message;
    }

    public String getConclusion() {
        return conclusion;
    }

    public String getQuestions() {
        return questions;
    }

    public String getPointOfR() {
        return pointOfR;
    }
}