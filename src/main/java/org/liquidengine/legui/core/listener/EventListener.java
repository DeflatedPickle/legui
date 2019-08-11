package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.Event;

/**
 * The base event listener interface. Used to handle event.
 */
public interface EventListener<E extends Event> {

    /**
     * Used to handle specific event.
     *
     * @param event event to handle.
     */
    void process(E event);
}
