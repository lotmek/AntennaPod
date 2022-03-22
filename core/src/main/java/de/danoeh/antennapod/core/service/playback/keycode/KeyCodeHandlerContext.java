package de.danoeh.antennapod.core.service.playback.keycode;

import de.danoeh.antennapod.playback.base.PlaybackServiceMediaPlayer;
import de.danoeh.antennapod.playback.base.PlayerStatus;

public class KeyCodeHandlerContext {
    private KeyCodeHandlerStrategy strategy;

    public KeyCodeHandlerContext() {}

    public void setStrategy(KeyCodeHandlerStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(PlaybackServiceMediaPlayer mediaPlayer, PlayerStatus status,
                    boolean notificationButton) {
        return this.strategy.execute(mediaPlayer, status, notificationButton);
    }
}

