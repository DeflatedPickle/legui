package org.liquidengine.legui.core.theme.colored.def;

import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Label;
import org.liquidengine.legui.core.component.optional.align.HorizontalAlign;
import org.liquidengine.legui.core.style.color.ColorConstants;
import org.liquidengine.legui.core.style.color.ColorUtil;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark Label Theme for all labels. Used to make label dark.
 *
 * @param <T> {@link Label} subclasses.
 */
public class FlatBorderlessTheme<T extends Component> extends FlatComponentTheme<T> {

    /**
     * Default constructor. Settings should be specified before using this theme.
     */
    public FlatBorderlessTheme() {
    }

    public FlatBorderlessTheme(FlatColoredThemeSettings settings) {
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
        component.getStyle().setBorder(null);
        component.getStyle().setShadow(null);
        component.getStyle().getBackground().setColor(ColorConstants.transparent());
    }
}
