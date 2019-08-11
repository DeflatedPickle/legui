package org.liquidengine.legui.core.theme.colored;

import org.joml.Vector4f;
import org.liquidengine.legui.core.component.Button;
import org.liquidengine.legui.core.component.CheckBox;
import org.liquidengine.legui.core.component.Component;
import org.liquidengine.legui.core.component.Label;
import org.liquidengine.legui.core.component.Layer;
import org.liquidengine.legui.core.component.Panel;
import org.liquidengine.legui.core.component.ProgressBar;
import org.liquidengine.legui.core.component.RadioButton;
import org.liquidengine.legui.core.component.ScrollBar;
import org.liquidengine.legui.core.component.ScrollablePanel;
import org.liquidengine.legui.core.component.SelectBox;
import org.liquidengine.legui.core.component.SelectBox.SelectBoxElement;
import org.liquidengine.legui.core.component.SelectBox.SelectBoxScrollablePanel;
import org.liquidengine.legui.core.component.Slider;
import org.liquidengine.legui.core.component.TextArea;
import org.liquidengine.legui.core.component.TextAreaField;
import org.liquidengine.legui.core.component.TextInput;
import org.liquidengine.legui.core.component.ToggleButton;
import org.liquidengine.legui.core.component.Tooltip;
import org.liquidengine.legui.core.component.Widget;
import org.liquidengine.legui.core.theme.DefaultThemeManager;
import org.liquidengine.legui.core.theme.Theme;
import org.liquidengine.legui.core.theme.ThemeManager;
import org.liquidengine.legui.core.theme.colored.def.FlatButtonTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatCheckBoxTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatComponentTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatLabelTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatLayerTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatPanelTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatProgressBarTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatRadioButtonTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatScrollBarTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatScrollablePanelTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatSelectBoxElementTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatSelectBoxScrollablePanelTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatSelectBoxTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatSliderTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatTextAreaFieldTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatTextAreaTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatTextInputTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatToggleButtonTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatTooltipTheme;
import org.liquidengine.legui.core.theme.colored.def.FlatWidgetTheme;

/**
 * Dark Theme. Used to change theme of components to dark.
 */
public class FlatColoredTheme extends Theme {

    /**
     * Used to create theme instance.
     *
     * @param backgroundColor background color.
     * @param borderColor border color.
     * @param strokeColor stroke color.
     * @param allowColor allow color.
     * @param denyColor deny color.
     * @param shadowColor shadow color.
     */
    public FlatColoredTheme(
        Vector4f backgroundColor, Vector4f borderColor, Vector4f strokeColor,
        Vector4f allowColor, Vector4f denyColor, Vector4f shadowColor
    ) {
        super(createThemeManager(new FlatColoredThemeSettings(backgroundColor, borderColor, strokeColor, allowColor, denyColor, shadowColor)));
    }

    /**
     * Used to initialize theme manager.
     *
     * @param settings settings to use by components theme.
     * @return initialized theme manager.
     */
    private static ThemeManager createThemeManager(FlatColoredThemeSettings settings) {
        ThemeManager m = new DefaultThemeManager();
        //@formatter:off
        m.setComponentTheme(Button.class,                   new FlatButtonTheme<>                   (settings));
        m.setComponentTheme(Panel.class,                    new FlatPanelTheme<>                    (settings));
        m.setComponentTheme(CheckBox.class,                 new FlatCheckBoxTheme<>                 (settings));
        m.setComponentTheme(Component.class,                new FlatComponentTheme<>                (settings));
        m.setComponentTheme(Label.class,                    new FlatLabelTheme<>                    (settings));
        m.setComponentTheme(Layer.class,                    new FlatLayerTheme<>           (settings));
        m.setComponentTheme(ProgressBar.class,              new FlatProgressBarTheme<>              (settings));
        m.setComponentTheme(ScrollablePanel.class,          new FlatScrollablePanelTheme<>          (settings));
        m.setComponentTheme(RadioButton.class,              new FlatRadioButtonTheme<>              (settings));
        m.setComponentTheme(ScrollBar.class,                new FlatScrollBarTheme<>                (settings));
        m.setComponentTheme(SelectBox.class,                new FlatSelectBoxTheme<>                (settings));
        m.setComponentTheme(SelectBoxScrollablePanel.class, new FlatSelectBoxScrollablePanelTheme<> (settings));
        m.setComponentTheme(SelectBoxElement.class,         new FlatSelectBoxElementTheme<>         (settings));
        m.setComponentTheme(Slider.class,                   new FlatSliderTheme<>                   (settings));
        m.setComponentTheme(TextArea.class,                 new FlatTextAreaTheme<>                 (settings));
        m.setComponentTheme(TextAreaField.class,            new FlatTextAreaFieldTheme<>            (settings));
        m.setComponentTheme(TextInput.class,                new FlatTextInputTheme<>                (settings));
        m.setComponentTheme(ToggleButton.class,             new FlatToggleButtonTheme<>             (settings));
        m.setComponentTheme(Tooltip.class,                  new FlatTooltipTheme<>                  (settings));
        m.setComponentTheme(Widget.class,                   new FlatWidgetTheme<>                   (settings));
        //@formatter:on
        return m;
    }

    /**
     * Flat colored theme settings.
     */
    public static class FlatColoredThemeSettings {

        /**
         * Background color.
         */
        private final Vector4f backgroundColor;
        /**
         * Border color.
         */
        private final Vector4f borderColor;
        /**
         * Stroke color.
         */
        private final Vector4f allowColor;
        /**
         * Allow color.
         */
        private final Vector4f strokeColor;
        /**
         * Deny color.
         */
        private final Vector4f denyColor;
        /**
         * Shadow color.
         */
        private final Vector4f shadowColor;

        /**
         * Used to create theme settings instance.
         *
         * @param backgroundColor background color.
         * @param borderColor border color.
         * @param strokeColor stroke color.
         * @param allowColor allow color.
         * @param denyColor deny color.
         * @param shadowColor shadow color.
         */
        public FlatColoredThemeSettings(
            Vector4f backgroundColor, Vector4f borderColor, Vector4f strokeColor,
            Vector4f allowColor, Vector4f denyColor, Vector4f shadowColor
        ) {
            this.backgroundColor = backgroundColor;
            this.borderColor = borderColor;
            this.allowColor = allowColor;
            this.strokeColor = strokeColor;
            this.denyColor = denyColor;
            this.shadowColor = shadowColor;
        }

        /**
         * Returns background color.
         *
         * @return background color.
         */
        public Vector4f backgroundColor() {
            return backgroundColor == null ? null : new Vector4f(backgroundColor);
        }

        /**
         * Returns border color.
         *
         * @return border color.
         */
        public Vector4f borderColor() {
            return borderColor == null ? null : new Vector4f(borderColor);
        }

        /**
         * Returns stroke color.
         *
         * @return stroke color.
         */
        public Vector4f strokeColor() {
            return strokeColor == null ? null : new Vector4f(strokeColor);
        }

        /**
         * Returns allow color.
         *
         * @return allow color.
         */
        public Vector4f allowColor() {
            return allowColor == null ? null : new Vector4f(allowColor);
        }

        /**
         * Returns deny color.
         *
         * @return deny color.
         */
        public Vector4f denyColor() {
            return denyColor == null ? null : new Vector4f(denyColor);
        }

        /**
         * Returns shadow color.
         *
         * @return shadow color.
         */
        public Vector4f shadowColor() {
            return shadowColor == null ? null : new Vector4f(shadowColor);
        }
    }

}
