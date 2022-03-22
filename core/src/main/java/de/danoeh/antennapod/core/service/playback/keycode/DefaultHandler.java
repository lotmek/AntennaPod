package de.danoeh.antennapod.core.service.playback.keycode;

import de.danoeh.antennapod.playback.base.PlaybackServiceMediaPlayer;
import de.danoeh.antennapod.playback.base.PlayerStatus;

public class DefaultHandler implements KeyCodeHandlerStrategy {

    @Override
    public boolean execute(PlaybackServiceMediaPlayer mediaPlayer, PlayerStatus status, boolean notificationButton) {
        return false;
    }
}
