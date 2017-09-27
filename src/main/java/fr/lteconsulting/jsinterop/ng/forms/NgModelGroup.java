package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.OnInit;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/ng_model_group".NgModelGroup
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/ng_model_group.d.ts:433
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.forms", name="NgModelGroup")
public class NgModelGroup extends AbstractFormGroupDirective implements OnInit, OnDestroy
{

    /*
        Constructors
    */
    public NgModelGroup(ControlContainer parent, Array<Object> validators, Array<Object> asyncValidators){
    }

    /*
        Properties
    */

    /** 
      * The {@link FormControl}, {@link FormGroup}, or {@link FormArray}
      * that backs this directive. Most properties fall through to that
      * instance.
     */
    public AbstractControl control;

    @JsProperty( name = "control")
    public native AbstractControl getControl();

    @JsProperty( name = "control")
    public native void setControl( AbstractControl value );

    /** 
      * A control is `dirty` if the user has changed the value
      * in the UI.
      * 
      * Note that programmatic changes to a control's value will
      * *not* mark it dirty.
     */
    public Boolean dirty;

    @JsProperty( name = "dirty")
    public native Boolean getDirty();

    @JsProperty( name = "dirty")
    public native void setDirty( Boolean value );

    /** 
      * A control is `disabled` when its `status === DISABLED`.
      * 
      * Disabled controls are exempt from validation checks and
      * are not included in the aggregate value of their ancestor
      * controls.
     */
    public Boolean disabled;

    @JsProperty( name = "disabled")
    public native Boolean getDisabled();

    @JsProperty( name = "disabled")
    public native void setDisabled( Boolean value );

    /** 
      * A control is `enabled` as long as its `status !== DISABLED`.
      * 
      * In other words, it has a status of `VALID`, `INVALID`, or
      * `PENDING`.
     */
    public Boolean enabled;

    @JsProperty( name = "enabled")
    public native Boolean getEnabled();

    @JsProperty( name = "enabled")
    public native void setEnabled( Boolean value );

    /** 
      * Returns any errors generated by failing validation. If there
      * are no errors, it will return null.
     */
    public AnonymousType717 errors;

    @JsProperty( name = "errors")
    public native AnonymousType717 getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( AnonymousType717 value );

    /** 
      * Get the form to which this container belongs.
     */
    public Form formDirective;

    @JsProperty( name = "formDirective")
    public native Form getFormDirective();

    @JsProperty( name = "formDirective")
    public native void setFormDirective( Form value );

    /** 
      * A control is `invalid` when its `status === INVALID`.
      * 
      * In order to have this status, the control must have failed
      * at least one of its validation checks.
     */
    public Boolean invalid;

    @JsProperty( name = "invalid")
    public native Boolean getInvalid();

    @JsProperty( name = "invalid")
    public native void setInvalid( Boolean value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    /** 
      * Returns an array that represents the path from the top-level form
      * to this control. Each index is the string name of the control on
      * that level.
     */
    public Array<String> path;

    @JsProperty( name = "path")
    public native Array<String> getPath();

    @JsProperty( name = "path")
    public native void setPath( Array<String> value );

    /** 
      * A control is `pending` when its `status === PENDING`.
      * 
      * In order to have this status, the control must be in the
      * middle of conducting a validation check.
     */
    public Boolean pending;

    @JsProperty( name = "pending")
    public native Boolean getPending();

    @JsProperty( name = "pending")
    public native void setPending( Boolean value );

    /** 
      * A control is `pristine` if the user has not yet changed
      * the value in the UI.
      * 
      * Note that programmatic changes to a control's value will
      * *not* mark it dirty.
     */
    public Boolean pristine;

    @JsProperty( name = "pristine")
    public native Boolean getPristine();

    @JsProperty( name = "pristine")
    public native void setPristine( Boolean value );

    /** 
      * Emits an event every time the validation status of the control
      * is re-calculated.
     */
    public Observable<Object> statusChanges;

    @JsProperty( name = "statusChanges")
    public native Observable<Object> getStatusChanges();

    @JsProperty( name = "statusChanges")
    public native void setStatusChanges( Observable<Object> value );

    /** 
      * A control is marked `touched` once the user has triggered
      * a `blur` event on it.
     */
    public Boolean touched;

    @JsProperty( name = "touched")
    public native Boolean getTouched();

    @JsProperty( name = "touched")
    public native void setTouched( Boolean value );

    /** 
      * A control is `untouched` if the user has not yet triggered
      * a `blur` event on it.
     */
    public Boolean untouched;

    @JsProperty( name = "untouched")
    public native Boolean getUntouched();

    @JsProperty( name = "untouched")
    public native void setUntouched( Boolean value );

    /** 
      * A control is `valid` when its `status === VALID`.
      * 
      * In order to have this status, the control must have passed all its
      * validation checks.
     */
    public Boolean valid;

    @JsProperty( name = "valid")
    public native Boolean getValid();

    @JsProperty( name = "valid")
    public native void setValid( Boolean value );

    /** 
      * The value of the control. 
     */
    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );

    /** 
      * Emits an event every time the value of the control changes, in
      * the UI or programmatically.
     */
    public Observable<Object> valueChanges;

    @JsProperty( name = "valueChanges")
    public native Observable<Object> getValueChanges();

    @JsProperty( name = "valueChanges")
    public native void setValueChanges( Observable<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getError,3,,P(d1))
      * TE Signature : S(getError,P(d1))
      * 
     */
    public native Object getError(String errorCode);
    /** 
      * Std Signature : S(getError,3,,P(d1),P(d7<1>))
      * TE Signature : S(getError,P(d1),P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object getError(String errorCode, Array<String> path /* optional */);
    /** 
      * Std Signature : S(hasError,27,,P(d1))
      * TE Signature : S(hasError,P(d1))
      * 
     */
    public native Boolean hasError(String errorCode);
    /** 
      * Std Signature : S(hasError,27,,P(d1),P(d7<1>))
      * TE Signature : S(hasError,P(d1),P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean hasError(String errorCode, Array<String> path /* optional */);
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnDestroy();
    /** 
      * Std Signature : S(ngOnInit,429,,)
      * TE Signature : S(ngOnInit,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnInit();
    /** 
      * Std Signature : S(reset,429,,)
      * TE Signature : S(reset,)
      * 
     */
    public native void reset();
    /** 
      * Std Signature : S(reset,429,,P(d3))
      * TE Signature : S(reset,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void reset(Object value /* optional */);
}
