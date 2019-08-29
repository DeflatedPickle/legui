package org.liquidengine.legui.core.theme.colored.def;

import org.joml.Vector4f;
import org.liquidengine.legui.core.component.Tooltip;
import org.liquidengine.legui.core.style.color.ColorUtil;
import org.liquidengine.legui.core.style.shadow.Shadow;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark Tooltip Theme for all tooltips. Used to make tooltip dark.
 *
 * @param <T> tooltip subclasses.
 */
public class FlatTooltipTheme<T extends Tooltip> extends FlatComponentTheme<T> {

    /**
     * Default constructor. Settings should be specified before using this theme.
     */
    public FlatTooltipTheme() {
    }

    public FlatTooltipTheme(FlatColoredThemeSettings settings) {
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
        Vector4f bgc = ColorUtil.negativeColorRGB(settings.backgroundColor());
        component.getStyle().getBackground().setColor(bgc);
        component.getStyle().setShadow(new Shadow(1, 1, 16, -4, ColorUtil.oppositeBlackOrWhite(bgc).mul(0.8f)));

        component.getTextState().setTextColor(ColorUtil.oppositeBlackOrWhite(bgc));
    }
}
