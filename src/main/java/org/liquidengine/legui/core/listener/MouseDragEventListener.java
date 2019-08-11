package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.MouseDragEvent;

/**
 * Created by ShchAlexander on 2/9/2017.
 */
public interface MouseDragEventListener extends EventListener<MouseDragEvent> {

    /**
     * Used to handle {@link MouseDragEvent}.
     *
     * @param event event to handle.
     */
    @Override
    void process(MouseDragEvent event);
}
