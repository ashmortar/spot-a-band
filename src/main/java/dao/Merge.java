package dao;

import models.Event;

import java.util.List;

/**
 * Created by Guest on 1/31/18.
 */
public interface Merge {

    void eventsPlaylist(String city, String date, String userID);
    /*for (event : events) {
        event.getName();
    }*/

    List<Event> whenInTown();
}
