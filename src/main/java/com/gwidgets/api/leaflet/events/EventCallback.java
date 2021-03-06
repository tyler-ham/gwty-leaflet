package com.gwidgets.api.leaflet.events;

import jsinterop.annotations.JsFunction;

/**
 * Created by zakaria on 7/2/2017.
 */
@JsFunction
public interface EventCallback<T extends Event> {

    void call(T event);
}
