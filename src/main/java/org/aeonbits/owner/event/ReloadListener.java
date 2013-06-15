/*
 * Copyright (c) 2013, Luigi R. Viggiano
 * All rights reserved.
 *
 * This software is distributable under the BSD license.
 * See the terms of the BSD license in the documentation provided with this software.
 */

package org.aeonbits.owner.event;

import java.util.EventListener;

/**
 * The listener interface for receiving reload events. The class that is interested in processing a reload event
 * implements this interface, and the object created with that class is registered with a component, using the
 * component's <code>addReloadListener</code> method. When the reload event occurs, that object's
 * <code>reloadPerformed</code> method is invoked.
 *
 * @author Luigi R. Viggiano
 * @see ReloadEvent
 * @since 1.0.4
 */
public interface ReloadListener extends EventListener {
    /**
     * Invoked when a reload occurs.
     */
    public void reloadPerformed(ReloadEvent event);
}
