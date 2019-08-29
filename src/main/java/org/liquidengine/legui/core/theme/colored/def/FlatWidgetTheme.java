package org.liquidengine.legui.core.theme.colored.def;

import org.joml.Vector2f;
import org.liquidengine.legui.core.component.Button;
import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Widget;
import org.liquidengine.legui.core.component.optional.TextState;
import org.liquidengine.legui.core.component.optional.align.HorizontalAlign;
import org.liquidengine.legui.core.component.optional.align.VerticalAlign;
import org.liquidengine.legui.core.icon.CharIcon;
import org.liquidengine.legui.core.icon.Icon;
import org.liquidengine.legui.core.style.color.ColorConstants;
import org.liquidengine.legui.core.style.color.ColorUtil;
import org.liquidengine.legui.core.style.font.FontRegistry;
import org.liquidengine.legui.core.theme.Themes;
import org.liquidengine.legui.core.theme.colored.FlatColoredTheme.FlatColoredThemeSettings;

/**
 * Dark Widget Theme for all scrollable widgets. Used to make widget dark.
 *
 * @param <T> {@link Widget} subclasses.
 */
public class FlatWidgetTheme<T extends Widget> extends FlatComponentTheme<T> {

    /**
     * Default constructor. Settings should be specified before using this theme.
     */
    public FlatWidgetTheme() {
    }

    public FlatWidgetTheme(FlatColoredThemeSettings settings) {
        super(settings);
    }

    /**
     * Used to apply theme for component and for all children of this component. Should be reimplemented for components that contains other child components.
     *
     * @param component component to apply theme.
     */
    @Override
    public void applyAll(T component) {
        super.apply(component);
        component.getStyle().getBackground().setColor(settings.backgroundColor());

        Button minimizeButton = component.getMinimizeButton();
        minimizeButton.getTextState().setTextColor(ColorUtil.oppositeBlackOrWhite(settings.borderColor()));
        minimizeButton.getStyle().getBackground().setColor(settings.borderColor());
        minimizeButton.getStyle().setShadow(null);

        Button closeButton = component.getCloseButton();
        closeButton.getTextState().setTextColor(ColorUtil.oppositeBlackOrWhite(settings.borderColor()));
        closeButton.getStyle().getBackground().setColor(settings.borderColor());
        closeButton.getStyle().setShadow(null);

        Component titleContainer = component.getTitleContainer();
        titleContainer.getStyle().getBackground().setColor(settings.borderColor());

        Button resizeButton = component.getResizeButton();
        resizeButton.getStyle().setBorder(null);
        resizeButton.getStyle().getBackground().setColor(ColorConstants.transparent());
        resizeButton.getHoveredStyle().getBackground().setColor(ColorConstants.transparent());
        resizeButton.getPressedStyle().getBackground().setColor(ColorConstants.transparent());

        CharIcon icon = new CharIcon(FontRegistry.MATERIAL_DESIGN_ICONS, '\uF45D');
        icon.setSize(new Vector2f(20, 20));
        icon.setPosition(new Vector2f(-10, -10));
        icon.setColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
        resizeButton.getStyle().getBackground().setIcon(icon);
        resizeButton.getStyle().setShadow(null);

        TextState titleTextState = component.getTitleTextState();
        component.getTitle().getStyle().setPadding(3f, 5f);
        titleTextState.setTextColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
        Icon closeIcon = component.getCloseIcon();
        if (closeIcon instanceof CharIcon) {
            CharIcon bgIcon = (CharIcon) closeIcon;
            bgIcon.setColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
            bgIcon.setHorizontalAlign(HorizontalAlign.CENTER);
            bgIcon.setVerticalAlign(VerticalAlign.MIDDLE);
        }

        Icon minimizeIcon = component.getMinimizeIcon();
        if (minimizeIcon instanceof CharIcon) {
            CharIcon bgIcon = (CharIcon) minimizeIcon;
            bgIcon.setColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
            bgIcon.setHorizontalAlign(HorizontalAlign.CENTER);
            bgIcon.setVerticalAlign(VerticalAlign.MIDDLE);
        }

        Icon maximizeIcon = component.getMaximizeIcon();
        if (maximizeIcon instanceof CharIcon) {
            CharIcon bgIcon = (CharIcon) maximizeIcon;
            bgIcon.setColor(ColorUtil.oppositeBlackOrWhite(settings.backgroundColor()));
            bgIcon.setHorizontalAlign(HorizontalAlign.CENTER);
            bgIcon.setVerticalAlign(VerticalAlign.MIDDLE);
        }

        Themes.getDefaultTheme().applyAll(component.getContainer());
        component.getContainer().getStyle().getBackground().setColor(settings.backgroundColor());
        component.getContainer().getStyle().setShadow(null);


    }
}
