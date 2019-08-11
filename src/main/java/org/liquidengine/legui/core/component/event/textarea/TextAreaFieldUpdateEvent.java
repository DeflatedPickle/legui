package org.liquidengine.legui.core.component.event.textarea;

import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.component.TextAreaField;
import org.liquidengine.legui.core.event.Event;
import org.liquidengine.legui.system.context.Context;

/**
 * @author ShchAlexander.
 */
public class TextAreaFieldUpdateEvent extends Event<TextAreaField> {

    public TextAreaFieldUpdateEvent(TextAreaField component, Context context, Frame frame) {
        super(component, context, frame);
    }

}
