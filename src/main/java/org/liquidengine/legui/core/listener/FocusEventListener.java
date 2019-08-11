package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.FocusEvent;

/**
 * This event listener used to handle {@link FocusEvent}.
 */
public interface FocusEventListener extends EventListener<FocusEvent> {

    /**
     * Used to handle {@link FocusEvent}.
     *
     * @param event event to handle.
     */
    void process(FocusEvent event);
}
