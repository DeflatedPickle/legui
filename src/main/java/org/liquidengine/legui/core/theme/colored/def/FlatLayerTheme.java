package org.liquidengine.legui.core.theme.colored.def;

import org.liquidengine.legui.core.component.Layer;
import org.liquidengine.legui.core.style.color.ColorConstants;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark Layer Theme for all layer containers. Used to make layer container dark.
 */
public class FlatLayerTheme<T extends Layer> extends FlatComponentTheme<T> {

    public FlatLayerTheme(FlatColoredThemeSettings settings) {
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
        component.getStyle().setShadow(null);
        component.getStyle().getBackground().setColor(ColorConstants.transparent());
    }
}
