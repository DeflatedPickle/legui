package org.liquidengine.legui.component.misc.scrollbar;

import org.liquidengine.legui.listener.EventListener;

/**
 * Defines contract for listener of {@link ScrollBarChangeValueEvent} event.
 */
public interface ScrollBarChangeValueEventListener extends EventListener<ScrollBarChangeValueEvent> {
    void process(ScrollBarChangeValueEvent event);
}
