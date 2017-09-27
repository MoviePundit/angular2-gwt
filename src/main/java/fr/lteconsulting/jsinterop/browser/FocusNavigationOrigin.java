package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: FocusNavigationOrigin
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:258935
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FocusNavigationOrigin")
public class FocusNavigationOrigin
{

    /*
        Properties
    */

    public Number originHeight;

    @JsProperty( name = "originHeight")
    public native Number getOriginHeight();

    @JsProperty( name = "originHeight")
    public native void setOriginHeight( Number value );

    public Number originLeft;

    @JsProperty( name = "originLeft")
    public native Number getOriginLeft();

    @JsProperty( name = "originLeft")
    public native void setOriginLeft( Number value );

    public Number originTop;

    @JsProperty( name = "originTop")
    public native Number getOriginTop();

    @JsProperty( name = "originTop")
    public native void setOriginTop( Number value );

    public Number originWidth;

    @JsProperty( name = "originWidth")
    public native Number getOriginWidth();

    @JsProperty( name = "originWidth")
    public native void setOriginWidth( Number value );
}
