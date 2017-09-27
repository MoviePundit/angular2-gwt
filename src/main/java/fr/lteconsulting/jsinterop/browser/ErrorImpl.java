package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Error
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/node_modules/typescript/lib/lib.es6.d.ts:36596
  * declared in: c:/Documents/Repos/typescript2java/node_modules/typescript/lib/lib.es6.d.ts:36820
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Error")
public class ErrorImpl extends Error
{

    /*
        Constructors
    */
    public ErrorImpl(String message){
        super(null);
    }

    /*
        Properties
    */

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String stack;

    @JsProperty( name = "stack")
    public native String getStack();

    @JsProperty( name = "stack")
    public native void setStack( String value );
}
