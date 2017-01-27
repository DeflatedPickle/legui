package org.liquidengine.legui.event.system;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.liquidengine.legui.event.SystemEvent;

/**
 * Created by Shcherbin Alexander on 6/10/2016.
 */
public class SystemScrollEvent implements SystemEvent {
    public final long   window;
    public final double xoffset;
    public final double yoffset;

    public SystemScrollEvent(long window, double xoffset, double yoffset) {
        this.window = window;
        this.xoffset = xoffset;
        this.yoffset = yoffset;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("window", window)
                .append("xoffset", xoffset)
                .append("yoffset", yoffset)
                .toString();
    }
}
