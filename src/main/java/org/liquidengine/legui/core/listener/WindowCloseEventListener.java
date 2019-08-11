package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.WindowCloseEvent;

/**
 * The listener interface that used to handle {@link WindowCloseEvent}.
 */
public interface WindowCloseEventListener extends EventListener<WindowCloseEvent> {

    /**
     * Used to handle {@link WindowCloseEvent}.
     *
     * @param event event to handle.
     */
    void process(WindowCloseEvent event);
}
