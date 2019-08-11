package org.liquidengine.legui.core.theme.colored.def;

import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Tooltip;
import org.liquidengine.legui.core.style.shadow.Shadow;
import org.liquidengine.legui.core.theme.AbstractTheme;
import org.liquidengine.legui.core.theme.Themes;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

import java.util.List;

/**
 * Dark Component Theme for all components. Used to make component dark.
 *
 * @param <T> {@link Component} subclasses.
 */
public class FlatComponentTheme<T extends Component> extends AbstractTheme<T> {

    private final FlatColoredThemeSettings settings;

    public FlatComponentTheme(FlatColoredThemeSettings settings) {
        this.settings = settings;
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
        component.getStyle().setBorderRadius(2f);
        component.getStyle().getBackground().setColor(settings.backgroundColor());
        component.getStyle().setFocusedStrokeColor(settings.strokeColor());

        if (settings.shadowColor()== null || settings.shadowColor().length() > 0.00001f) {
            component.getStyle().setShadow(new Shadow(1, 1, 16, -4, settings.shadowColor()));
        } else {
            component.getStyle().setShadow(null);
        }

        Tooltip tooltip = component.getTooltip();
        if (tooltip != null) {
            Themes.getDefaultTheme().applyAll(tooltip);
        }
        List<? extends Component> childComponents = component.getChildComponents();
        for (Component child : childComponents) {
            Themes.getDefaultTheme().applyAll(child);
        }
    }
}