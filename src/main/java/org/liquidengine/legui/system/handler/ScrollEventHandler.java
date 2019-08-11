package org.liquidengine.legui.system.handler;

import java.util.List;
import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.component.Layer;
import org.liquidengine.legui.core.event.ScrollEvent;
import org.liquidengine.legui.core.input.Mouse;
import org.liquidengine.legui.core.listener.processor.EventProcessor;
import org.liquidengine.legui.system.context.Context;
import org.liquidengine.legui.system.event.SystemScrollEvent;

/**
 * Created by ShchAlexander on 03.02.2017.
 */
public class ScrollEventHandler extends AbstractSystemEventHandler<SystemScrollEvent> {

    @Override
    protected boolean handle(SystemScrollEvent event, Layer layer, Context context, Frame frame) {
        List<Component> targetComponentList = SehUtil.getTargetComponentList(layer, Mouse.getCursorPosition());
        for (Component component : targetComponentList) {
            EventProcessor.getInstance().pushEvent(new ScrollEvent<>(component, context, frame, event.xoffset, event.yoffset));
        }
        return false;
    }
}
