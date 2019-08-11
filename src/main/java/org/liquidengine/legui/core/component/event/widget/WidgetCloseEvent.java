package org.liquidengine.legui.core.component.event.widget;

import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.component.Widget;
import org.liquidengine.legui.core.event.Event;
import org.liquidengine.legui.system.context.Context;

/**
 * @author ShchAlexander.
 */
public class WidgetCloseEvent<T extends Widget> extends Event<T> {

    public WidgetCloseEvent(T component, Context context, Frame frame) {
        super(component, context, frame);
    }
}
