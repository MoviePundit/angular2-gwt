package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HkdfCtrParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:742531
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HkdfCtrParams")
public class HkdfCtrParams extends Algorithm
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView context;

    @JsProperty( name = "context")
    public native UnionOfArrayBufferAndArrayBufferView getContext();

    @JsProperty( name = "context")
    public native void setContext( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setContext( ArrayBuffer value ) { setContext(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setContext( ArrayBufferView value ) { setContext(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }

    public UnionOfAlgorithmAndString hash;

    @JsProperty( name = "hash")
    public native UnionOfAlgorithmAndString getHash();

    @JsProperty( name = "hash")
    public native void setHash( UnionOfAlgorithmAndString value );

    @JsOverlay
    public final void setHash( Algorithm value ) { setHash(UnionOfAlgorithmAndString.ofAlgorithm( value )); }

    @JsOverlay
    public final void setHash( String value ) { setHash(UnionOfAlgorithmAndString.ofString( value )); }

    public UnionOfArrayBufferAndArrayBufferView label;

    @JsProperty( name = "label")
    public native UnionOfArrayBufferAndArrayBufferView getLabel();

    @JsProperty( name = "label")
    public native void setLabel( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setLabel( ArrayBuffer value ) { setLabel(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setLabel( ArrayBufferView value ) { setLabel(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }
}
