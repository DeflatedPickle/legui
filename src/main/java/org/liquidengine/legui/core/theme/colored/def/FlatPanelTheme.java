package org.liquidengine.legui.core.theme.colored.def;

import org.liquidengine.legui.core.component.Button;
import org.liquidengine.legui.core.component.Panel;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark Button Theme for all buttons. Used to make button dark.
 *
 * @param <T> {@link Button} subclasses.
 */
public class FlatPanelTheme<T extends Panel> extends FlatComponentTheme<T> {

    /**
     * Default constructor. Settings should be specified before using this theme.
     */
    public FlatPanelTheme() {
    }

    public FlatPanelTheme(FlatColoredThemeSettings settings) {
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
    }
}
