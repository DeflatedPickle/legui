package org.liquidengine.legui.system.handler;

import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.event.CharEvent;
import org.liquidengine.legui.core.listener.processor.EventProcessor;
import org.liquidengine.legui.system.context.Context;
import org.liquidengine.legui.system.event.SystemCharEvent;

/**
 * Created by ShchAlexander on 2/14/2017.
 */
public class CharEventHandler implements SystemEventHandler<SystemCharEvent> {

    @Override
    public void handle(SystemCharEvent event, Frame frame, Context context) {
        Component focusedGui = context.getFocusedGui();
        if (focusedGui == null) {
            return;
        }

        EventProcessor.getInstance().pushEvent(new CharEvent(focusedGui, context, frame, event.codepoint));
    }
}
