package org.liquidengine.legui.core.component.event.component;

import org.liquidengine.legui.core.listener.EventListener;

public interface ChangePositionEventListener extends EventListener<ChangePositionEvent> {

    /**
     * Used to handle {@link ChangePositionEvent} event.
     *
     * @param event event to handle.
     */
    @Override
    void process(ChangePositionEvent event);
}
