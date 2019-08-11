package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.ScrollEvent;

/**
 * Created by ShchAlexander on 03.02.2017.
 */
public interface ScrollEventListener extends EventListener<ScrollEvent> {

    void process(ScrollEvent event);
}
