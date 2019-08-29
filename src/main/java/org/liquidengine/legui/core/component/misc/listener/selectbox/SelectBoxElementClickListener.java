package org.liquidengine.legui.core.component.misc.listener.selectbox;

import static org.liquidengine.legui.core.event.MouseClickEvent.MouseClickAction.CLICK;

import org.liquidengine.legui.core.component.SelectBox;
import org.liquidengine.legui.core.component.event.selectbox.SelectBoxChangeSelectionEvent;
import org.liquidengine.legui.core.event.MouseClickEvent;
import org.liquidengine.legui.core.input.Mouse;
import org.liquidengine.legui.core.listener.MouseClickEventListener;
import org.liquidengine.legui.core.listener.processor.EventProcessor;

/**
 * @author ShchAlexander.
 */
public class SelectBoxElementClickListener<T> implements MouseClickEventListener {

    private SelectBox<T> selectBox;

    public SelectBoxElementClickListener(SelectBox<T> selectBox) {
        this.selectBox = selectBox;
    }

    @Override
    public void process(MouseClickEvent event) {
        SelectBox<T>.SelectBoxElement<T> component = (SelectBox<T>.SelectBoxElement<T>) event.getTargetComponent();
        if (event.getAction() == CLICK && event.getButton().equals(Mouse.MouseButton.MOUSE_BUTTON_1)) {
            T selection = selectBox.getSelection();
            T newValue = component.getObject();
            selectBox.setSelected(newValue, true);
            EventProcessor.getInstance().pushEvent(new SelectBoxChangeSelectionEvent<>(selectBox, event.getContext(), event.getFrame(), selection, newValue));
            selectBox.setCollapsed(true);
            event.getFrame().removeLayer(selectBox.getSelectBoxLayer());
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && (obj == this || obj.getClass() == this.getClass());
    }
}