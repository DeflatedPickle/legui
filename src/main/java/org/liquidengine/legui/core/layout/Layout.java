package org.liquidengine.legui.core.layout;

import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.system.context.Context;

import org.liquidengine.legui.core.component.event.component.ChangeSizeEvent;
import org.liquidengine.legui.core.component.event.component.ChangePositionEvent;

/**
 * Layout interface.
 *
 * @author Aliaksandr_Shcherbin.
 */
public interface Layout {

    /**
     * Used to lay out child components for parent component.
     *
     * Do not generate {@link ChangePositionEvent} and {@link ChangeSizeEvent} events.
     *
     * @param parent component to lay out.
     */
    void layout(Component parent);

    /**
     * Used to lay out child components for parent component.
     *
     * Generates {@link ChangePositionEvent} and {@link ChangeSizeEvent} events.
     *
     * @param parent component to lay out.
     * @param frame component frame (for event generation).
     * @param context context (used for event generation).
     */
    void layout(Component parent, Frame frame, Context context);

}
