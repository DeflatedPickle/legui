package org.liquidengine.legui.core.component.event.component;

import org.liquidengine.legui.core.listener.EventListener;

public interface ChangeSizeEventListener extends EventListener<ChangeSizeEvent> {

    /**
     * Used to handle {@link ChangeSizeEvent} event.
     *
     * @param event event to handle.
     */
    @Override
    void process(ChangeSizeEvent event);

    
}
