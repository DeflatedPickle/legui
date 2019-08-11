package org.liquidengine.legui.core.event;

import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.system.context.Context;

/**
 * Created by ShchAlexander on 03.02.2017.
 */
public class WindowCloseEvent<T extends Component> extends Event<T> {

    public WindowCloseEvent(T component, Context context, Frame frame) {
        super(component, context, frame);
    }

}
