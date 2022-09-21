package com.icaballero.mooc.notification.application.create;

import com.icaballero.mooc.video.domain.VideoPublished;
import com.icaballero.shared.application.DomainEventSubscriber;

public class SendPushToSubscribersOnVideoPublished implements DomainEventSubscriber<VideoPublished> {

	@Override
	public Class<VideoPublished> subscribedTo() {
		return VideoPublished.class;
	}

	@Override
	public void consume(VideoPublished event) {
		System.out.println(String.format("Hey! There is a new video with title <%s> and description <%s>",
				event.title(), event.description()));
	}
}
