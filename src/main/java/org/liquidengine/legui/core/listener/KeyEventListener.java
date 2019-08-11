package org.liquidengine.legui.core.listener;

import org.liquidengine.legui.core.event.KeyEvent;

/**
 * Created by ShchAlexander on 2/13/2017.
 */
public interface KeyEventListener extends EventListener<KeyEvent> {

    void process(KeyEvent event);
}
