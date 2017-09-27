package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSWebViewAsyncOperationEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:514639
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSWebViewAsyncOperationEventMap")
public class MSWebViewAsyncOperationEventMap
{

    /*
        Properties
    */

    public Event complete;

    @JsProperty( name = "complete")
    public native Event getComplete();

    @JsProperty( name = "complete")
    public native void setComplete( Event value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );
}
