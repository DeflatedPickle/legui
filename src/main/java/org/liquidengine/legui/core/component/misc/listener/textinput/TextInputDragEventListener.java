package org.liquidengine.legui.core.component.misc.listener.textinput;

import static org.liquidengine.legui.core.input.Mouse.MouseButton.MOUSE_BUTTON_LEFT;

import org.liquidengine.legui.core.component.TextInput;
import org.liquidengine.legui.core.event.MouseDragEvent;
import org.liquidengine.legui.core.listener.MouseDragEventListener;

/**
 * Mouse drag event listener for text input. Used to update selection indices.
 */
public class TextInputDragEventListener implements MouseDragEventListener {

    @Override
    public void process(MouseDragEvent event) {
        TextInput textInput = (TextInput) event.getTargetComponent();
        if (MOUSE_BUTTON_LEFT.isPressed()) {
            int mouseCaretPosition = textInput.getMouseCaretPosition();
            textInput.setCaretPosition(mouseCaretPosition);
            textInput.setEndSelectionIndex(mouseCaretPosition);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && (obj == this || obj.getClass() == this.getClass());
    }
}
