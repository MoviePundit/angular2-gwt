package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.RegExp;
import fr.lteconsulting.jsinterop.browser.UnionOfRegExpAndString;
import fr.lteconsulting.jsinterop.ng.core.OnChanges;
import fr.lteconsulting.jsinterop.ng.core.SimpleChanges;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators".PatternValidator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts:4787

  * A Directive that adds the `pattern` validator to any controls marked with the
  * `pattern` attribute, via the {@link NG_VALIDATORS} binding. Uses attribute value
  * as the regex to validate Control value against.  Follows pattern attribute
  * semantics; i.e. regex must match entire Control value.
  * 
  * ### Example
  * 
  * ```
  * <input [name]="fullName" pattern="[a-zA-Z ]*" ngModel>
  * ```
 */
@JsType(isNative=true, namespace="ng.forms", name="PatternValidator")
public class PatternValidator extends Validator implements OnChanges
{

    /*
        Properties
    */

    public Object _onChange;

    @JsProperty( name = "_onChange")
    public native Object get_onChange();

    @JsProperty( name = "_onChange")
    public native void set_onChange( Object value );

    public Object _validator;

    @JsProperty( name = "_validator")
    public native Object get_validator();

    @JsProperty( name = "_validator")
    public native void set_validator( Object value );

    public UnionOfRegExpAndString pattern;

    @JsProperty( name = "pattern")
    public native UnionOfRegExpAndString getPattern();

    @JsProperty( name = "pattern")
    public native void setPattern( UnionOfRegExpAndString value );

    @JsOverlay
    public final void setPattern( RegExp value ) { setPattern(UnionOfRegExpAndString.ofRegExp( value )); }

    @JsOverlay
    public final void setPattern( String value ) { setPattern(UnionOfRegExpAndString.ofString( value )); }

    /*
        Methods
    */
    /** 
      * Std Signature : S(_createValidator,3,,)
      * TE Signature : S(_createValidator,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts@5513
     */
    public native Object _createValidator();
    /** 
      * Std Signature : S(ngOnChanges,429,,P(d346))
      * TE Signature : S(ngOnChanges,P(d346))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnChanges(SimpleChanges changes);
}
