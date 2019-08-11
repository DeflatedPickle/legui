package org.liquidengine.legui.system.handler;

import java.util.List;
import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.component.Layer;
import org.liquidengine.legui.core.event.WindowCloseEvent;
import org.liquidengine.legui.core.listener.processor.EventProcessor;
import org.liquidengine.legui.system.context.Context;
import org.liquidengine.legui.system.event.SystemWindowCloseEvent;

/**
 * Created by ShchAlexander on 03.02.2017.
 */
public class WindowCloseEventHandler extends AbstractSystemEventHandler<SystemWindowCloseEvent> {

    @Override
    protected boolean handle(SystemWindowCloseEvent event, Layer layer, Context context, Frame frame) {
        pushEvent(layer, context, frame);
        return false;
    }

    private void pushEvent(Component component, Context context, Frame frame) {
        if (!(component.isVisible())) {
            return;
        }
        EventProcessor.getInstance().pushEvent(new WindowCloseEvent(component, context, frame));
        List<Component> childComponents = component.getChildComponents();
        for (Component child : childComponents) {
            pushEvent(child, context, frame);
        }
    }
}
