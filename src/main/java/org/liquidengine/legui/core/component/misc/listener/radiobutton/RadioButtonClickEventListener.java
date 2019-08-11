package org.liquidengine.legui.core.component.misc.listener.radiobutton;

import static org.liquidengine.legui.core.event.MouseClickEvent.MouseClickAction.CLICK;

import org.liquidengine.legui.core.component.RadioButton;
import org.liquidengine.legui.core.event.MouseClickEvent;
import org.liquidengine.legui.core.listener.MouseClickEventListener;

/**
 * RadioButton {@link MouseClickEvent} event listener. Used to update state of radio buttons in current radio button group.
 */
public class RadioButtonClickEventListener implements MouseClickEventListener {

    /**
     * Used to handle {@link MouseClickEvent}
     *
     * @param event event to handle.
     */
    @Override
    public void process(MouseClickEvent event) {
        if (event.getAction() == CLICK) {
            RadioButton component = (RadioButton) event.getTargetComponent();
            component.setChecked(true);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && (obj == this || obj.getClass() == this.getClass());
    }
}
