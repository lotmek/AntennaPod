package de.danoeh.antennapod.core.storage;

import java.util.ArrayList;
import java.util.List;

import de.danoeh.antennapod.core.util.LongList;
import de.danoeh.antennapod.event.QueueEvent;
import de.danoeh.antennapod.model.feed.Feed;
import de.danoeh.antennapod.model.feed.FeedItem;

public class ItemHelper {
    private LongList markAsUnplayedIds;
    private List<QueueEvent> events;
    private List<FeedItem> updatedItems;

    ItemHelper() {
        this.markAsUnplayedIds = new LongList();
        this.events = new ArrayList<>();
        this.updatedItems = new ArrayList<>();
    }

    public void markAsUnplayed(long value) {
        this.markAsUnplayedIds.add(value);
    }

    public boolean addEvent(QueueEvent event) {
        return this.events.add(event);
    }

    public boolean updateItem(FeedItem item) {
        return this.updatedItems.add(item);
    }

    public LongList getMarkAsUnplayedIds() {
        return markAsUnplayedIds;
    }

    public List<QueueEvent> getEvents() {
        return events;
    }

    public List<FeedItem> getUpdatedItems() {
        return updatedItems;
    }
}
