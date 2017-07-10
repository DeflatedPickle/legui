package org.liquidengine.legui.component.misc.widget;

import org.liquidengine.legui.listener.EventListener;

/**
 * @author Aliaksandr_Shcherbin.
 */
public interface WidgetCloseEventListener<T extends WidgetCloseEvent> extends EventListener<T> {
    void process(WidgetCloseEvent event);
}
