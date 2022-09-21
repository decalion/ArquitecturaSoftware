package com.icaballero.shared.application;

import com.icaballero.shared.domain.DomainEvent;

public interface DomainEventSubscriber<EventType extends DomainEvent>  {

    Class<EventType> subscribedTo();

    void consume(EventType event);
}
