package org.liquidengine.legui.core.layout;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.component.Layer;
import org.liquidengine.legui.core.style.Style.DisplayType;
import org.liquidengine.legui.core.layout.flex.FlexLayout;
import org.liquidengine.legui.core.util.Utilites;
import org.liquidengine.legui.system.context.Context;

/**
 * Default layout manager.
 *
 * @author Aliaksandr_Shcherbin.
 */
public class DefaultLayoutManager extends LayoutManager {

    private Map<DisplayType, Layout> layoutMap = new ConcurrentHashMap<>();

    public DefaultLayoutManager() {
        registerLayout(DisplayType.FLEX, new FlexLayout());
    }

    /**
     * Used to layout frame layers and all of their child components.
     *
     * @param frame frame to lay out.
     * @param context context (used for event generation).
     */
    @Override
    public void layout(Frame frame, Context context) {
        for (Layer layer : frame.getAllLayers()) {
            layout(layer, frame, context);
        }
    }

    @Override
    public void registerLayout(DisplayType displayType, Layout layout) {
        if (displayType == null) {
            return;
        }
        if (layout == null) {
            layoutMap.remove(displayType);
        } else {
            layoutMap.put(displayType, layout);
        }
    }

    /**
     * Used to layout component and all of his child components.
     *
     * @param component component to lay out.
     * @param frame component frame (for event generation if needed).
     * @param context context (used for event generation).
     */
    public void layout(Component component, Frame frame, Context context) {
        if (component != null && component.isVisible() && Utilites.visibleInParents(component)) {
            Layout layout = layoutMap.get(component.getStyle().getDisplay());
            if (layout != null) {
                layout.layout(component, frame, context);
            }

            if (!component.isEmpty()) {
                List<Component> childComponents = component.getChildComponents();
                for (Component child : childComponents) {
                    layout(child, frame, context);
                }
            }
        }
    }
}
