package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/path_location_strategy".PathLocationStrategy
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/path_location_strategy.d.ts:135
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="PathLocationStrategy")
public class PathLocationStrategy extends LocationStrategy
{

    /*
        Constructors
    */
    public PathLocationStrategy(PlatformLocation _platformLocation, String href){
    }

    /*
        Properties
    */

    public Object _baseHref;

    @JsProperty( name = "_baseHref")
    public native Object get_baseHref();

    @JsProperty( name = "_baseHref")
    public native void set_baseHref( Object value );

    public Object _platformLocation;

    @JsProperty( name = "_platformLocation")
    public native Object get_platformLocation();

    @JsProperty( name = "_platformLocation")
    public native void set_platformLocation( Object value );
}
