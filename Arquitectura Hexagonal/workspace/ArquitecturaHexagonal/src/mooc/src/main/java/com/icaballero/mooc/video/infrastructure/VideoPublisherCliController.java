package com.icaballero.mooc.video.infrastructure;

import java.util.Set;

import com.icaballero.mooc.notification.application.create.SendPushToSubscribersOnVideoPublished;
import com.icaballero.mooc.video.application.publish.VideoPublisher;
import com.icaballero.shared.application.DomainEventSubscriber;
import com.icaballero.shared.domain.EventBus;
import com.icaballero.shared.infrastructure.bus.ReactorEventBus;

public class VideoPublisherCliController {
	
    public static void main(String[] args) {
        final Set<DomainEventSubscriber> subscribers = Set.of(
            new SendPushToSubscribersOnVideoPublished()
        );
        final EventBus eventBus = new ReactorEventBus(subscribers);
        final var videoPublisher = new VideoPublisher(eventBus);

        final var videoTitle = "\uD83C\uDF89 New YouTube.com/CodelyTV video title";
        final var videoDescription = "This should be the video description \uD83D\uDE42";

        videoPublisher.publish(videoTitle, videoDescription);
    }

}
