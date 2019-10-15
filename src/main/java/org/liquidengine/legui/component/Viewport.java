package org.liquidengine.legui.component;

import org.joml.Vector2f;

/**
 * Viewport interface specifies that component could be updated by event listeners by calling {@link #updateViewport()} method.
 */
public interface Viewport {

    Vector2f getViewportSize();

    Vector2f getViewportViewSize();

}
