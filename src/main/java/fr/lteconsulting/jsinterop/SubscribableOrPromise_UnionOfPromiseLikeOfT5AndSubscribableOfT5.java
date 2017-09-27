package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.rxjs.Subscribable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/angular4-api/tsd/rxjs/Observable.d.ts:522
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface SubscribableOrPromise_UnionOfPromiseLikeOfT5AndSubscribableOfT5<T5>  {
    @JsOverlay
    default PromiseLike<T5> asPromiseLikeOfT5() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T5> SubscribableOrPromise_UnionOfPromiseLikeOfT5AndSubscribableOfT5<T5> ofPromiseLikeOfT5(PromiseLike<T5> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<T5> asSubscribableOfT5() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T5> SubscribableOrPromise_UnionOfPromiseLikeOfT5AndSubscribableOfT5<T5> ofSubscribableOfT5(Subscribable<T5> value) {
        return Js.cast( value );
    }
    
}
