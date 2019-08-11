package org.liquidengine.legui.core.theme.colored.def;

import org.joml.Vector2f;
import org.liquidengine.legui.core.component.CheckBox;
import org.liquidengine.legui.core.component.optional.align.HorizontalAlign;
import org.liquidengine.legui.core.icon.CharIcon;
import org.liquidengine.legui.core.style.color.ColorConstants;
import org.liquidengine.legui.core.style.color.ColorUtil;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

import static org.liquidengine.legui.core.style.font.FontRegistry.MATERIAL_ICONS_REGULAR;

/**
 * Dark CheckBox Theme for all check boxes. Used to make check box dark.
 *
 * @param <T> {@link CheckBox} subclasses.
 */
public class FlatCheckBoxTheme<T extends CheckBox> extends FlatComponentTheme<T> {

    private FlatColoredThemeSettings settings;

    public FlatCheckBoxTheme(FlatColoredThemeSettings settings) {
        super(settings);
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
        component.getStyle().setShadow(null);
        component.getStyle().getBackground().setColor(ColorConstants.transparent());
        component.getTextState().setTextColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
        component.getTextState().setHorizontalAlign(HorizontalAlign.LEFT);
        component.setIconUnchecked(
            new CharIcon(new Vector2f(14), MATERIAL_ICONS_REGULAR, (char) 0xE835, ColorUtil.oppositeBlackOrWhite(settings.backgroundColor())));
        component
            .setIconChecked(new CharIcon(new Vector2f(14), MATERIAL_ICONS_REGULAR, (char) 0xE834, ColorUtil.oppositeBlackOrWhite(settings.backgroundColor())));
        component.getIconUnchecked().setHorizontalAlign(HorizontalAlign.LEFT);
        component.getIconChecked().setHorizontalAlign(HorizontalAlign.LEFT);
    }
}
