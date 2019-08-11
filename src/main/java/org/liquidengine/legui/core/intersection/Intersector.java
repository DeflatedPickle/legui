package org.liquidengine.legui.core.intersection;

import org.joml.Vector2f;
import org.liquidengine.legui.core.component.Component;

/**
 * Created by ShchAlexander on 03.02.2017.
 */
public abstract class Intersector {

    public abstract boolean intersects(Component component, Vector2f vector2f);
}
