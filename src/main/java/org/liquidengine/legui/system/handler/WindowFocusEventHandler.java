package org.liquidengine.legui.system.handler;

import java.util.List;
import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.component.Layer;
import org.liquidengine.legui.core.event.WindowFocusEvent;
import org.liquidengine.legui.core.listener.processor.EventProcessor;
import org.liquidengine.legui.system.context.Context;
import org.liquidengine.legui.system.event.SystemWindowFocusEvent;

/**
 * Created by ShchAlexander on 03.02.2017.
 */
public class WindowFocusEventHandler extends AbstractSystemEventHandler<SystemWindowFocusEvent> {

    @Override
    protected boolean handle(SystemWindowFocusEvent event, Layer layer, Context context, Frame frame) {
        pushEvent(layer, event, context, frame);
        return false;
    }


    private void pushEvent(Component component, SystemWindowFocusEvent event, Context context, Frame frame) {
        if (!(component.isVisible())) {
            return;
        }
        EventProcessor.getInstance().pushEvent(new WindowFocusEvent(component, context, frame, event.focused));

        List<Component> childComponents = component.getChildComponents();
        for (Component child : childComponents) {
            pushEvent(child, event, context, frame);
        }

    }
}
