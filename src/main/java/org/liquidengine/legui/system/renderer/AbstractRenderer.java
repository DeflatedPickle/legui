package org.liquidengine.legui.system.renderer;

import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.component.Layer;
import org.liquidengine.legui.system.context.Context;

/**
 * Base of main renderer which called by renderer thread.
 */
public abstract class AbstractRenderer implements Renderer {

    public abstract void initialize();

    protected abstract void preRender(Context context);

    protected abstract void postRender(Context context);

    public void render(Frame display, Context context) {
        preRender(context);
        for (Layer layer : display.getAllLayers()) {
            RendererProvider.getInstance().getComponentRenderer(layer.getClass()).render(layer, context);
        }
        postRender(context);
    }

    public abstract void destroy();

}
