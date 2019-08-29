package org.liquidengine.legui.core.theme.colored.def;

import org.liquidengine.legui.core.component.SelectBox;
import org.liquidengine.legui.core.style.color.ColorConstants;
import org.liquidengine.legui.core.style.color.ColorUtil;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark SelectBox Theme for all select boxes. Used to make select box dark.
 *
 * @param <T> {@link SelectBox.SelectBoxElement} subclasses.
 */
public class FlatSelectBoxElementTheme<T extends SelectBox.SelectBoxElement> extends FlatBorderlessTheme<T> {

    /**
     * Default constructor. Settings should be specified before using this theme.
     */
    public FlatSelectBoxElementTheme() {
    }

    public FlatSelectBoxElementTheme(FlatColoredThemeSettings settings) {
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
        component.getTextState().setTextColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
    }
}
