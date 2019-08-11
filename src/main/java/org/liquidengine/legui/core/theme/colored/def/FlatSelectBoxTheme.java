package org.liquidengine.legui.core.theme.colored.def;

import org.liquidengine.legui.core.component.Button;
import org.liquidengine.legui.core.component.SelectBox;
import org.liquidengine.legui.core.component.optional.align.HorizontalAlign;
import org.liquidengine.legui.core.component.optional.align.VerticalAlign;
import org.liquidengine.legui.core.icon.CharIcon;
import org.liquidengine.legui.core.icon.Icon;
import org.liquidengine.legui.core.style.color.ColorConstants;
import org.liquidengine.legui.core.style.color.ColorUtil;
import org.liquidengine.legui.core.theme.Themes;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark SelectBox Theme for all select boxes. Used to make select box dark.
 *
 * @param <T> {@link SelectBox} subclasses.
 */
public class FlatSelectBoxTheme<T extends SelectBox> extends FlatComponentTheme<T> {

    private FlatColoredThemeSettings settings;

    public FlatSelectBoxTheme(FlatColoredThemeSettings settings) {
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

        Button expandButton = component.getExpandButton();
        expandButton.getStyle().setShadow(null);
        expandButton.getStyle().getBackground().setColor(ColorConstants.transparent());

        Button selectionButton = component.getSelectionButton();
        selectionButton.getStyle().setShadow(null);
        selectionButton.getStyle().getBackground().setColor(ColorConstants.transparent());
        selectionButton.getTextState().setTextColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));

        Icon collapseIcon = component.getCollapseIcon();
        if (collapseIcon instanceof CharIcon) {
            CharIcon bgIcon = (CharIcon) collapseIcon;
            bgIcon.setColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
            bgIcon.setHorizontalAlign(HorizontalAlign.CENTER);
            bgIcon.setVerticalAlign(VerticalAlign.MIDDLE);
        }
        Icon expandIcon = component.getExpandIcon();
        if (expandIcon instanceof CharIcon) {
            CharIcon bgIcon = (CharIcon) expandIcon;
            bgIcon.setColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
            bgIcon.setHorizontalAlign(HorizontalAlign.CENTER);
            bgIcon.setVerticalAlign(VerticalAlign.MIDDLE);
        }
    }

    /**
     * Used to apply theme for component and for all children of this component. Should be reimplemented for components that contains other child components.
     *
     * @param component component to apply theme.
     */
    @Override
    public void applyAll(T component) {
        apply(component);

        Themes.getDefaultTheme().applyAll(component.getSelectionListPanel());
    }
}
