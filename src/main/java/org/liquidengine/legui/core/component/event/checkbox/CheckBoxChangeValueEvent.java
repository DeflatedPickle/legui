package org.liquidengine.legui.core.component.event.checkbox;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.liquidengine.legui.core.component.CheckBox;
import org.liquidengine.legui.core.component.Frame;
import org.liquidengine.legui.core.event.Event;
import org.liquidengine.legui.system.context.Context;

/**
 * Event generated by default event listeners which shows that checkbox value was changed.
 */
public class CheckBoxChangeValueEvent<T extends CheckBox> extends Event<T> {

    private final boolean oldValue;
    private final boolean newValue;

    public CheckBoxChangeValueEvent(T component, Context context, Frame frame, boolean oldValue, boolean newValue) {
        super(component, context, frame);
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    /**
     * Returns old value.
     * @deprecated since 2.0.0 - use {@link #getOldValue()}
     *
     * @return old value.
     */
    public boolean isOldValue() {
        return oldValue;
    }

    /**
     * Returns new value.
     * @deprecated since 2.0.0 - use {@link #getNewValue()}
     *
     * @return new value.
     */
    public boolean isNewValue() {
        return newValue;
    }

    /**
     * Returns old value.
     *
     * @return old value.
     */
    public boolean getOldValue() {
        return oldValue;
    }

    /**
     * Returns new value.
     *
     * @return new value.
     */
    public boolean getNewValue() {
        return newValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("oldValue", oldValue)
            .append("newValue", newValue)
            .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CheckBoxChangeValueEvent<?> that = (CheckBoxChangeValueEvent<?>) o;

        return new EqualsBuilder()
            .appendSuper(super.equals(o))
            .append(oldValue, that.oldValue)
            .append(newValue, that.newValue)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .appendSuper(super.hashCode())
            .append(oldValue)
            .append(newValue)
            .toHashCode();
    }
}
