package fr.lteconsulting.angular2gwt.client;

import fr.lteconsulting.angular2gwt.Component;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off
@Component(
		selector = "hero-list",
		templateUrl = "hero-list.component.html",
		directives = {"fr.lteconsulting.angular2gwt.client.HeroFormComponent"})
//@formatter:on
@JsType
public class HeroListComponent
{
	@JsProperty
	private String title;

	@JsProperty
	private Hero selectedHero;

	@JsProperty
	private JsArray<Hero> heroes = JsArray.of( new Hero( "Windstorm", "Do nothing", null ), new Hero( "Bombasto", "Do nothing", null ), new Hero( "Magneta", "Do nothing", null ), new Hero( "Tornado", "Do nothing", null ) );

	@JsMethod
	private void onSelect( Hero hero )
	{
		selectedHero = hero;
	}
}
