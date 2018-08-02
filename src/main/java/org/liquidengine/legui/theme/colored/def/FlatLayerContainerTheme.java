package org.liquidengine.legui.theme.colored.def;

import org.liquidengine.legui.component.LayerContainer;
import org.liquidengine.legui.style.color.ColorConstants;
import org.liquidengine.legui.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark LayerContainer Theme for all layer containers. Used to make layer container dark.
 *
 * @param <T> {@link LayerContainer} subclasses.
 */
public class FlatLayerContainerTheme<T extends LayerContainer> extends FlatComponentTheme<T> {

    public FlatLayerContainerTheme(FlatColoredThemeSettings settings) {
        super(settings);
    }

    /**
     * Used to apply theme only for component and not apply for child components.
     *
     * @param component component to apply theme.
     */
    @Override
    public void apply(T component) {
        super.apply(component);
        component.getStyle().getBorder().setWidth(null);
        component.getStyle().getBackground().setColor(ColorConstants.transparent());
    }
}
