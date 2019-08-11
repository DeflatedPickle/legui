package org.liquidengine.legui.core.component.misc.listener.textinput;

import org.liquidengine.legui.core.component.TextInput;
import org.liquidengine.legui.core.event.MouseClickEvent;
import org.liquidengine.legui.core.listener.MouseClickEventListener;

/**
 * Mouse click event listener for text input. Used to update caret position.
 */
public class TextInputMouseClickEventListener implements MouseClickEventListener {

    /**
     * Used to handle {@link MouseClickEvent}.
     *
     * @param event event to handle.
     */
    @Override
    public void process(MouseClickEvent event) {
        TextInput gui = (TextInput) event.getTargetComponent();
        int mouseCaretPosition = gui.getMouseCaretPosition();
        if (event.getAction() == MouseClickEvent.MouseClickAction.PRESS) {
            gui.setCaretPosition(mouseCaretPosition);
            gui.setEndSelectionIndex(mouseCaretPosition);
            if (!event.isModShift()) {
                gui.setStartSelectionIndex(mouseCaretPosition);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && (obj == this || obj.getClass() == this.getClass());
    }
}
