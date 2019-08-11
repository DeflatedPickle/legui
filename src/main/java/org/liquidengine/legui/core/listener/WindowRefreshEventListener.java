package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.WindowRefreshEvent;

/**
 * Created by ShchAlexander on 04.02.2017.
 */
public interface WindowRefreshEventListener extends EventListener<WindowRefreshEvent> {

    void process(WindowRefreshEvent event);
}
