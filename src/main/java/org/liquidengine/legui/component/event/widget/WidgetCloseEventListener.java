package org.liquidengine.legui.component.event.widget;

import org.liquidengine.legui.listener.EventListener;

/**
 * Event listener for {@link WidgetCloseEvent}.
 *
 * @param <T> type of event (base type is {@link WidgetCloseEvent}).
 * @author ShchAlexander.
 */
public interface WidgetCloseEventListener<T extends WidgetCloseEvent> extends EventListener<T> {

    /**
     * Used to handle {@link WidgetCloseEvent} event.
     *
     * @param event event to handle.
     */
    void process(WidgetCloseEvent event);
}
