package com.icaballero.mooc.video.application.publish;

import com.icaballero.mooc.video.domain.Video;
import com.icaballero.mooc.video.domain.VideoDescription;
import com.icaballero.mooc.video.domain.VideoTitle;
import com.icaballero.shared.domain.EventBus;

public final class VideoPublisher {
	
    private final EventBus eventBus;

    public VideoPublisher(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void publish(String rawTitle, String rawDescription) {
        final var title = new VideoTitle(rawTitle);
        final var description = new VideoDescription(rawDescription);

        final var video = Video.publish(title, description);

        eventBus.publish(video.pullDomainEvents());
    }

}
