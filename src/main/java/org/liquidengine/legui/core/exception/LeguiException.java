package org.liquidengine.legui.core.exception;

/**
 * Legui Runtime exception.
 */
public class LeguiException extends RuntimeException {

    /**
     * {@inheritDoc}
     */
    public LeguiException() {
    }

    /**
     * {@inheritDoc}
     */
    public LeguiException(String message) {
        super(message);
    }

    /**
     * {@inheritDoc}
     */
    public LeguiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * {@inheritDoc}
     */
    public LeguiException(Throwable cause) {
        super(cause);
    }

    /**
     * {@inheritDoc}
     */
    public LeguiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
