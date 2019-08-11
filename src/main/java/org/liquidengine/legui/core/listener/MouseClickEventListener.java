package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.MouseClickEvent;

/**
 * Instances of this interface could be used to handle {@link MouseClickEvent}.
 */
public interface MouseClickEventListener extends EventListener<MouseClickEvent> {

    /**
     * Used to handle {@link MouseClickEvent}
     *
     * @param event event to handle.
     */
    void process(MouseClickEvent event);
}
