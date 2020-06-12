package com.project.twitterspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // mark the beans as Spring's managed components
public class TweetRepository {

    public List<Tweet> findAll() {

        List<Tweet> tweets = new ArrayList<>();
        int id = 0;

        Tweet t1 = new Tweet();
        t1.setId(++id);
        t1.setUsername("Dora He");
        t1.setUserHandle("@dorahe");
        t1.setUserImageUrl("https://i.pinimg.com/564x/dd/6f/2b/dd6f2b3892598fb24eec695a39720de2.jpg");
        t1.setMessage("Hello! ihola!");

        Tweet t2 = new Tweet();
        t2.setId(++id);
        t2.setUsername("Winnie the Pooh");
        t2.setUserHandle("@winnie");
        t2.setUserImageUrl("https://i2-prod.mirror.co.uk/incoming/article13873867.ece/ALTERNATES/s810/0_Winnie-The-Pooh-Animation.jpg");
        t2.setMessage("Disney!");

        Tweet t3 = new Tweet();
        t3.setId(++id);
        t3.setUsername("Kaleb Burd");
        t3.setUserHandle("@kburd");
        t3.setUserImageUrl("https://pythonprogramming.net/static/images/finance/python-programming-language.png");
        t3.setMessage("Hello Twitter! Goodbye MySpace!");

        Tweet t4 = new Tweet();
        t4.setId(++id);
        t4.setUsername("Rando Cardician");
        t4.setUserHandle("@seedNull");
        t4.setUserImageUrl("https://upload.wikimedia.org/wikipedia/commons/a/a0/2006_Quarter_Proof.png");
        t4.setMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sit amet nisi ac metus imperdiet fermentum at ut sem. Morbi.");

        Tweet t5 = new Tweet();
        t5.setId(++id);
        t5.setUsername("John Smith");
        t5.setUserHandle("@notRussianBot");
        t5.setUserImageUrl("https://cdn.pixabay.com/photo/2017/03/14/21/00/american-flag-2144392__340.png");
        t5.setMessage("Who censored Trump???");

        Tweet t6 = new Tweet();
        t6.setId(++id);
        t6.setUsername("Iron Man");
        t6.setUserHandle("@ironman");
        t6.setUserImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRQDBQN0m0BywPJPHcqTtfZ8eLfL9ToSIoTMOrusJicOHv2DUgG&usqp=CAU");
        t6.setMessage("Marvel legend!");

        tweets.add(t1);
        tweets.add(t2);
        tweets.add(t3);
        tweets.add(t4);
        tweets.add(t5);
        tweets.add(t6);

        return tweets;
    }


    public Tweet findById(int id) {
        List<Tweet> tweets = findAll();

        return tweets.get(id - 1);
    }
}
