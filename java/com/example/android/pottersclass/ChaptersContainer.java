package com.example.android.pottersclass;

import java.util.ArrayList;

public class ChaptersContainer{
    public ChaptersContainer() {
    }

    ArrayList<ChapterContent> chapterList = new ArrayList<>();

    public ArrayList<ChapterContent> getChapterList() {
        chapterList.add(ch1);
        chapterList.add(ch2);
        chapterList.add(ch3);
        chapterList.add(ch4);
        chapterList.add(ch5);
        return chapterList;
    }

    public ArrayList<String> getChaptersTopicsList(){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ChapterContent> chapters = getChapterList();
        for (ChapterContent chapterContent : chapters){
            list.add(chapterContent.getTopic());
        }
        return list;
    }

    public ChapterContent getChapterContent(int position){
        ArrayList<ChapterContent> cc = getChapterList();
        return cc.get(position);
    }


    /*
    CONTENT OF CHAPTERS SHOULD BE CREATED AS AN OBJECT AND ADDED IN THE getChapterList method
     */
    ChapterContent ch1 = new ChapterContent(
            "1 Inward man",
                "Pro. 20:24",
                "1Peter 3:4",
                "This book deals with the personal successes of each of us. Success means accomplishments as the\n" +
                        "result of our own efforts and abilities. Proper preparation is the key to our success. Our acts\n" +
                        "can be no wiser than our thoughts. Our thinking can be no wiser than our understanding.\n" +
                        "This book of cures for lean purses has been termed a guide to financial understanding. That, indeed, is\n" +
                        "its purpose: to offer those who are ambitious for financial success an insight which will aid\n" +
                        "them to acquire money, to keep money and to make their surpluses earn more money.",
                "In the pages which follow, we are taken back to Babylon, the cradle in which was nurtured the\n" +
                        "basic principles of finance now recognized and used the world over.\n" +
                        "To new readers the author is happy to extend the wish that its pages may contain for them the same\n" +
                        "inspiration for growing bank accounts, greater financial successes and the solution of difficult\n" +
                        "personal financial problems so enthusiastically reported by readers from coast to coast.\n" +
                        "To the business executives who have distributed these tales in such generous quantities to friends,\n" +
                        "relatives, employees and associates, the author takes this opportunity to express his gratitude. No\n" +
                        "endorsement could be higher than that of practical men who appreciate its teachings because they,\n" +
                        "themselves, have worked up to important successes by applying the very principles it advocates.",
            "Message",
                "This is the conclusion",
                "\"One may buy the ornaments of the gold worker and the stone polisher.\"\n" +
                        "\"One may even build mighty temples for the Gods.\"\n" +
                        "\"One may do all these things and many others in which there is delight for the senses and\"",
                "Today, this valley of the Euphrates, once a populous irrigated farming district, is again a windswept\n" +
                        "arid waste. Scant grass and desert shrubs strive for existence against the windblown sands. Gone\n" +
                        "are the fertile fields, the mammoth cities and the long caravans of rich merchandise. Nomadic bands of\n" +
                        "Arabs, securing a scant living by tending small herds, are the only inhabitants. Such it has been since\n" +
                        "about the beginning of the Christian era."
    );
    ChapterContent ch2 = new ChapterContent(
            "2 Inward man",//topic
            "text",//text
            "memory verse",//memory verse
            "introduction",//intoduction
            null,//message
            "outline",//outline
            "conclusion",//conclusion
            "question",//question
            "p o r" //point of reflection
    );
    ChapterContent ch3 = new ChapterContent(
            "2 Inward man",//topic
            "text",//text
            "memory verse",//memory verse
            "introduction",//intoduction
            null,//message
            "outline",//outline
            "conclusion",//conclusion
            "question",//question
            "p o r" //point of reflection
    );
    ChapterContent ch4 = new ChapterContent(
            "2 Inward man",//topic
            "text",//text
            "memory verse",//memory verse
            "introduction",//intoduction
            null,//message
            "outline",//outline
            "conclusion",//conclusion
            "question",//question
            "p o r" //point of reflection
    );
    ChapterContent ch5 = new ChapterContent(
            "2 Inward man",//topic
            "text",//text
            "memory verse",//memory verse
            "introduction",//intoduction
            null,//message
            "outline",//outline
            "conclusion",//conclusion
            "question",//question
            "p o r" //point of reflection
    );
}
