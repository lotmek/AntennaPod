package de.danoeh.antennapod.core.service.playback.keycode;

import de.danoeh.antennapod.playback.base.PlaybackServiceMediaPlayer;
import de.danoeh.antennapod.playback.base.PlayerStatus;

public interface KeyCodeHandlerStrategy {
    boolean execute(PlaybackServiceMediaPlayer mediaPlayer, PlayerStatus status,
                 boolean notificationButton);
}

