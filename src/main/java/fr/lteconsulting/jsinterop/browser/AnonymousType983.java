package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:1051

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType983<V>
{

    @JsOverlay
    public final void setByIndex(String index, V value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final V getByIndex(String index) {
        return (V) Js.asPropertyMap(this).get(index);
    }
}
