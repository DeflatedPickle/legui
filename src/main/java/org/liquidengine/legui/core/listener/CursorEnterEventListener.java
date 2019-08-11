package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.CursorEnterEvent;

/**
 * Created by ShchAlexander on 2/10/2017.
 */
public interface CursorEnterEventListener extends EventListener<CursorEnterEvent> {

    void process(CursorEnterEvent event);
}
