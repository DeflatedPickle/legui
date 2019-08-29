package org.liquidengine.legui.core.theme.colored.def;

import org.liquidengine.legui.core.component.Button;
import org.liquidengine.legui.core.style.color.ColorUtil;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark Button Theme for all buttons. Used to make button dark.
 *
 * @param <T> {@link Button} subclasses.
 */
public class FlatButtonTheme<T extends Button> extends FlatComponentTheme<T> {

    /**
     * Default constructor. Settings should be specified before using this theme.
     */
    public FlatButtonTheme() {
    }

    public FlatButtonTheme(FlatColoredThemeSettings settings) {
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
        component.getStyle().getBackground().setColor(settings.backgroundColor());


        component.getHoveredStyle().getBackground()
            .setColor(settings.backgroundColor().mul(3).add(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor())).div(4));
        component.getPressedStyle().getBackground()
            .setColor(settings.backgroundColor().mul(2).add(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor())).div(3));
        component.getTextState().setTextColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
    }
}
