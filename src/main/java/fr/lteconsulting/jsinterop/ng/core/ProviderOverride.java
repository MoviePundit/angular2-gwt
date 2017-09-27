package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ProviderOverride
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:12951
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ProviderOverride")
public class ProviderOverride
{

    /*
        Properties
    */

    public Array<Object> deps;

    @JsProperty( name = "deps")
    public native Array<Object> getDeps();

    @JsProperty( name = "deps")
    public native void setDeps( Array<Object> value );

    public NodeFlags flags;

    @JsProperty( name = "flags")
    public native NodeFlags getFlags();

    @JsProperty( name = "flags")
    public native void setFlags( NodeFlags value );

    public Object token;

    @JsProperty( name = "token")
    public native Object getToken();

    @JsProperty( name = "token")
    public native void setToken( Object value );

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );
}
