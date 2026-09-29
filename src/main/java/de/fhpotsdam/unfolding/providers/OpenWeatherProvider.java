package de.fhpotsdam.unfolding.providers;

import de.fhpotsdam.unfolding.core.Coordinate;
import de.fhpotsdam.unfolding.geo.MercatorProjection;
import de.fhpotsdam.unfolding.geo.Transformation;

/**
 * Provider based on Leaflet-providers: http://leaflet-extras.github.io/leaflet-providers/preview/index.html
 * Map data (c)OpenWeatherMap http://openweathermap.org
 */
public class OpenWeatherProvider {
	private static String api_key = "";
	
	public static abstract class GenericOpenWeatherMapProvider extends AbstractMapTileUrlProvider {

		public GenericOpenWeatherMapProvider(String apiKey) {
			super(new MercatorProjection(26, new Transformation(1.068070779e7, 0.0, 3.355443185e7, 0.0,
					-1.068070890e7, 3.355443057e7)));
			api_key = apiKey;
		}

		public String getZoomString(Coordinate coordinate) {
			return (int) coordinate.zoom + "/" + (int) coordinate.column + "/" + (int) coordinate.row;
		}

		public int tileWidth() {
			return 256;
		}

		public int tileHeight() {
			return 256;
		}
		
		protected String constructUrl(String layer, Coordinate coordinate) {
			return "http://tile.openweathermap.org/map/"+ layer + "/" + getZoomString(coordinate) + ".png?appid="+api_key;
		}

		public abstract String[] getTileUrls(Coordinate coordinate);
	}

	public static class Snow extends GenericOpenWeatherMapProvider {
		public Snow(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/snow/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("snow", coordinate) };
		}
	}
	
	public static class Temperature extends GenericOpenWeatherMapProvider {
		public Temperature(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/temp/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("temp", coordinate) };
		}
	}
	
	public static class Wind extends GenericOpenWeatherMapProvider {
		public Wind(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/wind/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("wind", coordinate) };
		}
	}
	
	public static class PressureContour extends GenericOpenWeatherMapProvider {
		public PressureContour(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/pressure_cntr/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("pressure_cntr", coordinate) };
		}
	}
	
	public static class Pressure extends GenericOpenWeatherMapProvider {
		public Pressure(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/pressure/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("pressure", coordinate) };
		}
	}
	
	public static class RainClassic extends GenericOpenWeatherMapProvider {
		public RainClassic(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/rain_cls/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("rain_cls", coordinate) };
		}
	}
	
	public static class Rain extends GenericOpenWeatherMapProvider {
		public Rain(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/rain/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("rain", coordinate) };
		}
	}
	
	public static class PrecipitationClassic extends GenericOpenWeatherMapProvider {
		public PrecipitationClassic(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/precipitation_cls/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("precipitation_cls", coordinate) };
		}
	}
	
	public static class Precipitation extends GenericOpenWeatherMapProvider {
		public Precipitation(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/precipitation/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("precipitation", coordinate) };
		}
	}
	
	public static class CloudsClassic extends GenericOpenWeatherMapProvider {
		public CloudsClassic(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/clouds_cls/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("clouds_cls", coordinate) };
		}
	}
	
	public static class Clouds extends GenericOpenWeatherMapProvider {
		public Clouds(String apiKey) {
			super(apiKey);
		}

		public String[] getTileUrls(Coordinate coordinate) {
			//String url = "http://tile.openweathermap.org/map/clouds/" + getZoomString(coordinate) + ".png";
			return new String[] { constructUrl("clouds", coordinate) };
		}
	}
	
	
}

