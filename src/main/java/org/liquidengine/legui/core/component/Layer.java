package org.liquidengine.legui.core.component;

import org.joml.Vector2f;
import org.liquidengine.legui.core.component.misc.listener.layer.LayerWindowSizeEventListener;
import org.liquidengine.legui.core.event.WindowSizeEvent;
import org.liquidengine.legui.core.style.color.ColorConstants;
import org.liquidengine.legui.core.theme.Themes;

/**
 * Layer one of base structures. Layer is special container which used to hold of other components and only layer could be used in frame. <p> Layer can be eventPassable - that's mean that
 * current layer allow to pass events to bottom layer if event wasn't handled by components of this layer. <p> Also layer can be eventReceivable - that's mean
 * that current layer and all of it components can receive events. For example layer for tooltips is eventPassable and isn't eventReceivable.
 */
public class Layer extends Component {

    /**
     * Parent frame.
     */
    private Frame frame;
    /**
     * Determines if  current layer allow to pass events to bottom layer if event wasn't handled by components of this layer.
     */
    private boolean eventPassable = true;
    /**
     * Determines if current layer and all of it components can receive events.
     */
    private boolean eventReceivable = true;

    /**
     * Default constructor. Used to create component instance without any parameters. <p> Also if you want to make it easy to use with Json
     * marshaller/unmarshaller component should contain empty constructor.
     */
    public Layer() {
        initialize();
    }

    /**
     * Constructor with position and size parameters.
     *
     * @param x x position position in parent component.
     * @param y y position position in parent component.
     * @param width width of component.
     * @param height height of component.
     */
    public Layer(float x, float y, float width, float height) {
        super(x, y, width, height);
        initialize();
    }

    /**
     * Constructor with position and size parameters.
     *
     * @param position position position in parent component.
     * @param size size of component.
     */
    public Layer(Vector2f position, Vector2f size) {
        super(position, size);
        initialize();
    }
    /**
     * Returns frame to which attached this layer.
     *
     * @return frame to which attached this layer.
     */
    public Frame getFrame() {
        return frame;
    }

    /**
     * Used to attach layer to frame.
     *
     * @param frame frame to attach.
     */
    protected void setFrame(Frame frame) {
        if (frame == this.frame) {
            return;
        }
        if (this.frame != null) {
            this.frame.removeLayer(this);
        }
        this.frame = frame;
        if (frame != null) {
            frame.addLayer(this);
        }
    }

    /**
     * Returns true if layer is event passable.
     *
     * @return true if layer is event passable.
     */
    public boolean isEventPassable() {
        return eventPassable;
    }

    /**
     * Used to enable or disable passing events to bottom layer.
     *
     * @param eventPassable true/false to enable/disable passing events to bottom layer.
     */
    public void setEventPassable(boolean eventPassable) {
        this.eventPassable = eventPassable;
    }

    /**
     * Returns true if layer is event receivable.
     *
     * @return true if layer is event receivable.
     */
    public boolean isEventReceivable() {
        return eventReceivable;
    }

    /**
     * Used to enable or disable receiving events by layer.
     *
     * @param eventReceivable true/false to enable/disable receiving events by layer.
     */
    public void setEventReceivable(boolean eventReceivable) {
        this.eventReceivable = eventReceivable;
    }

    /**
     * Used to initialize Layer container with default background and border.
     */
    private void initialize() {
        getListenerMap().addListener(WindowSizeEvent.class, new LayerWindowSizeEventListener());
        getStyle().getBackground().setColor(ColorConstants.transparent());
        getStyle().setBorder(null);
        setFocusable(false);
        setTabFocusable(false);
        Themes.getDefaultTheme().getThemeManager().getComponentTheme(Layer.class).applyAll(this);
    }

}
