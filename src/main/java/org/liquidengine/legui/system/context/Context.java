package org.liquidengine.legui.system.context;

import static org.lwjgl.glfw.GLFW.GLFW_ICONIFIED;
import static org.lwjgl.glfw.GLFW.GLFW_TRUE;
import static org.lwjgl.glfw.GLFW.glfwGetFramebufferSize;
import static org.lwjgl.glfw.GLFW.glfwGetWindowAttrib;
import static org.lwjgl.glfw.GLFW.glfwGetWindowPos;
import static org.lwjgl.glfw.GLFW.glfwGetWindowSize;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joml.Vector2f;
import org.joml.Vector2i;
import org.liquidengine.legui.component.Component;

/**
 * Created by Aliaksandr_Shcherbin on 1/25/2017.
 */
public class Context {

    private final long glfwWindow;

    private Vector2f windowPosition;
    private Vector2i windowSize;
    private Vector2f framebufferSize;
    private transient float pixelRatio;
    private Component mouseTargetGui;
    private Component focusedGui;

    private boolean debugEnabled;

    private boolean iconified;

    private Map<String, Object> contextData = new ConcurrentHashMap<>();

    public Context(long glfwWindow) {
        this.glfwWindow = glfwWindow;
    }

    public boolean isDebugEnabled() {
        return debugEnabled;
    }

    public void setDebugEnabled(boolean debugEnabled) {
        this.debugEnabled = debugEnabled;
    }

    public Map<String, Object> getContextData() {
        return contextData;
    }

    public void updateGlfwWindow() {
        int[] windowWidth = {0},
            windowHeight = {0};
        int[] frameBufferWidth = {0},
            frameBufferHeight = {0};
        int[] xpos = {0},
            ypos = {0};
        glfwGetWindowSize(glfwWindow, windowWidth, windowHeight);
        glfwGetFramebufferSize(glfwWindow, frameBufferWidth, frameBufferHeight);
        glfwGetWindowPos(glfwWindow, xpos, ypos);

        update(windowWidth[0], windowHeight[0],
            frameBufferWidth[0], frameBufferHeight[0],
            xpos[0], ypos[0],
            glfwGetWindowAttrib(glfwWindow, GLFW_ICONIFIED) == GLFW_TRUE
        );
    }

    public void update(int targetWidth, int targetHeight, int framebufferWidth, int framebufferHeight,
        int targetPosX, int targetPosY, boolean iconified) {
        setWindowSize(new Vector2i(targetWidth, targetHeight));
        setFramebufferSize(new Vector2f(framebufferWidth, framebufferHeight));
        setPixelRatio((float) framebufferWidth / (float) targetWidth);
        setWindowPosition(new Vector2f(targetPosX, targetPosY));
        setIconified(iconified);
    }

    public float getPixelRatio() {
        return pixelRatio;
    }

    public void setPixelRatio(float pixelRatio) {
        this.pixelRatio = pixelRatio;
    }

    public long getGlfwWindow() {
        return glfwWindow;
    }

    public Vector2f getWindowPosition() {
        return windowPosition;
    }

    public void setWindowPosition(Vector2f windowPosition) {
        this.windowPosition = windowPosition;
    }

    public Vector2i getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(Vector2i windowSize) {
        this.windowSize = windowSize;
    }

    public Vector2f getFramebufferSize() {
        return framebufferSize;
    }

    public void setFramebufferSize(Vector2f framebufferSize) {
        this.framebufferSize = framebufferSize;
    }

    public Component getFocusedGui() {
        return focusedGui;
    }

    public void setFocusedGui(Component focusedGui) {
        this.focusedGui = focusedGui;
    }

    public Component getMouseTargetGui() {
        return mouseTargetGui;
    }

    public void setMouseTargetGui(Component mouseTargetGui) {
        this.mouseTargetGui = mouseTargetGui;
    }

    public boolean isIconified() {
        return iconified;
    }

    public void setIconified(boolean iconified) {
        this.iconified = iconified;
    }
}
