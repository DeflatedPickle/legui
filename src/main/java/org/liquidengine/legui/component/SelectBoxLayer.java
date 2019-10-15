package org.liquidengine.legui.component;

import org.liquidengine.legui.component.SelectBox.SelectBoxScrollablePanel;

/**
 * @author ShchAlexander.
 */
public class SelectBoxLayer extends Layer<SelectBoxScrollablePanel> {

    /**
     * Default constructor of dialog layer.
     */
    public SelectBoxLayer() {
        setEventPassable(true);
        setEventReceivable(true);
    }
}
