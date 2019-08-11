package org.liquidengine.legui.core.component.event.checkbox;

import org.liquidengine.legui.core.listener.EventListener;

/**
 * @author ShchAlexander.
 */
public interface CheckBoxChangeValueEventListener extends EventListener<CheckBoxChangeValueEvent> {

    /**
     * Used to handle {@link CheckBoxChangeValueEvent} event.
     *
     * @param event event to handle.
     */
    @Override
    void process(CheckBoxChangeValueEvent event);
}
