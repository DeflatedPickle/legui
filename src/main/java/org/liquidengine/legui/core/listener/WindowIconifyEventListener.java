package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.WindowIconifyEvent;

/**
 * Created by ShchAlexander on 04.02.2017.
 */
public interface WindowIconifyEventListener extends EventListener<WindowIconifyEvent> {

    void process(WindowIconifyEvent event);
}
