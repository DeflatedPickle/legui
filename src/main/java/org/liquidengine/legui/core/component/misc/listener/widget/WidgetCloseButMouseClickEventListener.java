package org.liquidengine.legui.core.component.misc.listener.widget;

import static org.liquidengine.legui.core.event.MouseClickEvent.MouseClickAction.CLICK;

import org.liquidengine.legui.core.component.Widget;
import org.liquidengine.legui.core.component.event.widget.WidgetCloseEvent;
import org.liquidengine.legui.core.event.MouseClickEvent;
import org.liquidengine.legui.core.listener.MouseClickEventListener;
import org.liquidengine.legui.core.listener.processor.EventProcessor;

/**
 * @author ShchAlexander.
 */
public class WidgetCloseButMouseClickEventListener implements MouseClickEventListener {

    private Widget widget;

    public WidgetCloseButMouseClickEventListener(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void process(MouseClickEvent event) {
        if (CLICK == event.getAction()) {
            widget.hide();
            EventProcessor.getInstance().pushEvent(new WidgetCloseEvent<>(widget, event.getContext(), event.getFrame()));
        }
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null) && ((obj == this) || ((obj != this) && (obj.getClass() == this.getClass())));
    }
}
