package co.cribon.calmapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements LocationListener {

	// private static final int RQS_GooglePlayServices = 0;

	private GoogleMap myMap;
	MarkerOptions markerOptions;

	// Loc for start location

	static final LatLng LONDON = new LatLng(51.5112, -0.1198);

	// Loc of Magazines

	static final LatLng w_l_h = new LatLng(51.4919, -0.2140);
	static final LatLng cy_c = new LatLng(51.4814, -0.1776);
	static final LatLng con_ham = new LatLng(51.4925, -0.2333);
	static final LatLng liv_cic = new LatLng(51.5256, -0.2150);
	static final LatLng yproj = new LatLng(51.5279, -0.2078);
	static final LatLng hon_joe = new LatLng(51.5193, -0.2074);
	static final LatLng gt_cin = new LatLng(51.5087, -0.1975);
	static final LatLng grf_gal = new LatLng(51.5193, -0.2074);
	static final LatLng coronet = new LatLng(51.5085, -0.1989);
	static final LatLng retro = new LatLng(51.5101, -0.1972);
	static final LatLng rtw = new LatLng(51.5161, -0.2045);
	static final LatLng nottin = new LatLng(51.5091, -0.19481);
	static final LatLng boat = new LatLng(51.4852, -0.1363);
	static final LatLng toxic = new LatLng(51.5171, -0.2062);
	static final LatLng naz = new LatLng(51.4918, -0.2261);
	static final LatLng volunt = new LatLng(51.4928, -0.2328);
	static final LatLng adult = new LatLng(51.4924, -0.2319);
	static final LatLng polish = new LatLng(51.4935, -0.2374);
	static final LatLng defectors = new LatLng(51.5051, -0.2231);
	static final LatLng ginglik = new LatLng(51.5017, -0.2182);
	static final LatLng pub = new LatLng(51.5018, -0.2306);
	static final LatLng bushhall = new LatLng(51.5018, -0.2306);
	static final LatLng empire = new LatLng(51.5035, -0.2244);
	static final LatLng box = new LatLng(51.5265, -0.2068);
	static final LatLng skate = new LatLng(51.5205, -0.2053);
	static final LatLng pipe = new LatLng(51.5226, -0.2077);
	static final LatLng studio = new LatLng(51.5215, -0.2031);
	static final LatLng college = new LatLng(51.5228, -0.2081);
	static final LatLng tigers = new LatLng(51.5352, -0.1889);
	static final LatLng carnival = new LatLng(51.5167, -0.2016);
	static final LatLng gol = new LatLng(51.5211, -0.2054);
	static final LatLng wark = new LatLng(51.4806, -0.0940);
	static final LatLng film = new LatLng(51.4822, -0.1976);
	static final LatLng mind = new LatLng(51.4827, -0.2123);
	static final LatLng day = new LatLng(51.4975, -0.2160);
	static final LatLng chels = new LatLng(51.5199, -0.2058);
	static final LatLng west = new LatLng(51.4941, -0.1479);
	static final LatLng rec = new LatLng(51.5149, -0.1373);
	static final LatLng sister = new LatLng(51.5145, -0.1355);
	static final LatLng sound = new LatLng(51.5139, -0.1347);
	static final LatLng beyond = new LatLng(51.5146, -0.1374);
	static final LatLng curzon = new LatLng(51.5128, -0.1305);
	static final LatLng forb = new LatLng(51.5152, -0.1273);
	static final LatLng rokit = new LatLng(51.5143, -0.1241);
	static final LatLng edge = new LatLng(51.5157, -0.1327);
	static final LatLng gay = new LatLng(51.5135, -0.1311);
	static final LatLng social = new LatLng(51.5174, -0.1408);
	static final LatLng orbital = new LatLng(51.5121, -0.1278);
	static final LatLng fopp = new LatLng(51.5138, -0.1279);
	static final LatLng club = new LatLng(51.5156, -0.1292);
	static final LatLng prince = new LatLng(51.5115, -0.1302);
	static final LatLng albert = new LatLng(51.5201, -0.1096);
	static final LatLng amber = new LatLng(51.5239, -0.1896);
	static final LatLng brent = new LatLng(51.5762, -0.2245);
	static final LatLng cheap = new LatLng(51.5150, -0.0961);
	static final LatLng oxford = new LatLng(51.5157, -0.1414);
	static final LatLng putney = new LatLng(51.4637, -0.2154);
	static final LatLng city = new LatLng(51.5426, -0.0043);
	static final LatLng white = new LatLng(51.5072, -0.2232);
	static final LatLng wimbledon = new LatLng(51.4208, -0.2050);

	// onCreate

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);

		// Getting reference to the SupportMapFragment of activity_map.xml
		android.support.v4.app.FragmentManager myFragmentManager = getSupportFragmentManager();
		SupportMapFragment mySupportMapFragment = (SupportMapFragment) myFragmentManager
				.findFragmentById(R.id.map);
		myMap = mySupportMapFragment.getMap();

		// /// Enabling MyLocation Layer of Google Map and set type to normal///
		myMap.setMyLocationEnabled(true);
		myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

		// Start the Map on this location
		myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LONDON, 10));

		// Zoom in, animating the camera.
		myMap.animateCamera(CameraUpdateFactory.zoomTo(13), 2000, null);

		// Markers

		Marker wlmH = myMap.addMarker(new MarkerOptions().position(w_l_h)
				.title("West London College – Hammersmith").snippet("W14 9BL")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker bush_hall = myMap.addMarker(new MarkerOptions().position(cy_c)
				.title("Chelsea Youth club").snippet("SW10 0EQ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker coffe_plant = myMap.addMarker(new MarkerOptions()
				.position(con_ham).title("Connexions Hammersmith")
				.snippet("W6 9JT")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker bsh_hall = myMap.addMarker(new MarkerOptions().position(liv_cic)
				.title("Living Well CIC").snippet("W10 5AA")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker y_proj = myMap.addMarker(new MarkerOptions().position(yproj)
				.title("Avenues Youth Project").snippet("W10 4RS")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker honjoe = myMap.addMarker(new MarkerOptions().position(hon_joe)
				.title("Honest Jon's Records").snippet("W10 5TE")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker gtcin = myMap.addMarker(new MarkerOptions().position(gt_cin)
				.title("Gate Cinema").snippet("W11 3JZ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker grfgal = myMap.addMarker(new MarkerOptions().position(grf_gal)
				.title("Graffik Gallery").snippet("W10 5TE")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_oronet = myMap.addMarker(new MarkerOptions().position(coronet)
				.title("Coronet").snippet("W11 3LB")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker r_etro = myMap.addMarker(new MarkerOptions().position(retro)
				.title("Retro Man").snippet("34 Pembridge Road, W11")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker r_tw = myMap.addMarker(new MarkerOptions().position(rtw)
				.title("Rough Trade West").snippet("W11 1JA")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker n_ottin = myMap.addMarker(new MarkerOptions().position(nottin)
				.title("Notting Hill Arts Centre").snippet("W11 3JQ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker b_oat = myMap.addMarker(new MarkerOptions().position(boat)
				.title("Westminster Boating Base").snippet("SW1V 3JY")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker t_oxic = myMap.addMarker(new MarkerOptions().position(toxic)
				.title("Intoxica Records").snippet("W11 1LT")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker n_az = myMap.addMarker(new MarkerOptions().position(naz)
				.title("Naz Project London").snippet("W6 9DT")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker v_olunt = myMap.addMarker(new MarkerOptions().position(volunt)
				.title("Volunteer Centre Hammersmith").snippet("W6 0QU")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker a_dult = myMap.addMarker(new MarkerOptions().position(adult)
				.title("Adult Carers Service Hammersmith").snippet("W6 9XY")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker p_olish = myMap.addMarker(new MarkerOptions().position(polish)
				.title("Polish Cultural Centre Hammersmith").snippet("W6 0RF")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker d_efectors = myMap.addMarker(new MarkerOptions()
				.position(defectors).title("Defectors Weld").snippet("W12 8AA")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker g_inglik = myMap.addMarker(new MarkerOptions().position(ginglik)
				.title("Ginglik").snippet("W14 0BQ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker p_ub = myMap.addMarker(new MarkerOptions().position(pub)
				.title("Goldhawk Pub").snippet("W12 8HH")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker bush_h_all = myMap.addMarker(new MarkerOptions()
				.position(bushhall).title("Bush Hall").snippet("W12 7LJ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker e_mipre = myMap.addMarker(new MarkerOptions()
				.position(defectors).title("Shepherds Bush Empire")
				.snippet("W12 8TT")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker b_ox = myMap.addMarker(new MarkerOptions().position(box)
				.title("All Stars Boxing Gym and Youth Club")
				.snippet("W10 4NJ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker s_kate = myMap.addMarker(new MarkerOptions().position(skate)
				.title("Bay Sixty6 Skate Park").snippet("W10 5YU")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker p_ipe = myMap.addMarker(new MarkerOptions().position(pipe)
				.title("Halfpipe").snippet("W10 5PR")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker s_tudio = myMap.addMarker(new MarkerOptions().position(studio)
				.title("Westbourne Studios").snippet("W10 5JJ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_ollege = myMap.addMarker(new MarkerOptions().position(college)
				.title("Kensington and Chelsea College – Kensington")
				.snippet("W10 5QQ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker t_igers = myMap.addMarker(new MarkerOptions().position(tigers)
				.title("London Tigers").snippet("W9 3RS")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_arnival = myMap.addMarker(new MarkerOptions()
				.position(carnival).title("Carnival Village London")
				.snippet("W11 2AY")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker g_ol = myMap.addMarker(new MarkerOptions().position(gol)
				.title("Golborne Youth Centre").snippet("W10 5QW")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker w_ark = myMap.addMarker(new MarkerOptions().position(wark)
				.title("Southwark Mind").snippet("SE5 0HF")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker f_ilm = myMap.addMarker(new MarkerOptions().position(film)
				.title("London Film Academy").snippet("SW6 1QR")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker m_ind = myMap.addMarker(new MarkerOptions().position(mind)
				.title("Mind Hammersmith & Fulham").snippet("SW6 7LL")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker d_ay = myMap.addMarker(new MarkerOptions().position(day)
				.title("Mind Hammersmith & Fulham Day Service")
				.snippet("W14 0HB")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_hels = myMap.addMarker(new MarkerOptions().position(chels)
				.title("Mind Kensington and  Chelsea").snippet("W10 5QZ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker w_est = myMap.addMarker(new MarkerOptions().position(west)
				.title("Mind Westminster").snippet("SW1W 9LZ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker re_c = myMap.addMarker(new MarkerOptions().position(rec)
				.title("Phonica Records").snippet("W1F 7LZ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker s_siter = myMap.addMarker(new MarkerOptions().position(sister)
				.title("Sister Ray Records").snippet("W1F 8RP")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker s_ound = myMap.addMarker(new MarkerOptions().position(sound)
				.title("Sounds of the Universe Records").snippet("W1F 0DA")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker b_eyond = myMap.addMarker(new MarkerOptions().position(beyond)
				.title("Beyond Retro").snippet("W1F 7JY")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_urzon = myMap.addMarker(new MarkerOptions().position(curzon)
				.title("Curzon Soho").snippet("W1D 5DY")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker f_orb = myMap.addMarker(new MarkerOptions().position(forb)
				.title("Forbidden Planet").snippet("WC2H 8JR")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker r_okit = myMap.addMarker(new MarkerOptions().position(rokit)
				.title("Rokit Retro").snippet("WC2H 9HZ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker e_dge = myMap.addMarker(new MarkerOptions().position(edge)
				.title("The Edge").snippet("W1D 3QE")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker g_ay = myMap.addMarker(new MarkerOptions().position(gay)
				.title("G-A-Y Bar").snippet("W1D 4UR")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker s_ocial = myMap.addMarker(new MarkerOptions().position(social)
				.title("The Social").snippet("W1W 7JD")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker o_rbital = myMap.addMarker(new MarkerOptions().position(orbital)
				.title("Orbital Comics").snippet("WC2H 7JA")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker f_opp = myMap.addMarker(new MarkerOptions().position(fopp)
				.title("Fopp records").snippet("WC2H 9LL")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_lub = myMap.addMarker(new MarkerOptions().position(club)
				.title("12 Bar Club").snippet("WC2H 8NL")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker p_rince = myMap.addMarker(new MarkerOptions().position(prince)
				.title("Prince Charles Cinema").snippet("WC2H 7BY")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker a_lbert = myMap.addMarker(new MarkerOptions().position(albert)
				.title("Albert Kennedy Trust").snippet("EC1N 7RJ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker a_mber = myMap.addMarker(new MarkerOptions().position(amber)
				.title("Amberley Youth Project").snippet("W9 2JZ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker b_rent = myMap.addMarker(new MarkerOptions().position(brent)
				.title("Topman Brent Cross").snippet("NW4 3FP")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_heap = myMap.addMarker(new MarkerOptions().position(cheap)
				.title("Topman Cheapside").snippet("EC2V 6AH")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker o_xford = myMap.addMarker(new MarkerOptions().position(oxford)
				.title("Topman Oxford St").snippet("W1W 8LG")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker p_utney = myMap.addMarker(new MarkerOptions().position(putney)
				.title("Topman Putney").snippet("SW15 1SR")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker c_ity = myMap.addMarker(new MarkerOptions().position(city)
				.title("Topman Westfield Stratford City").snippet("E20 1EQ")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker w_hite = myMap.addMarker(new MarkerOptions().position(white)
				.title("Topman Westfield White City ").snippet("W12 7GE")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		Marker w_imbledon = myMap.addMarker(new MarkerOptions()
				.position(wimbledon).title("Topman Wimbledon")
				.snippet("SW19 8YE")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.place)));

		// myMap.animateCamera(CameraUpdateFactory.zoomTo(14), 2000, null);
	}

	@Override
	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		// Check if GooglePlayServices are enabled and up to date!

		/*
		 * int resultCode = GooglePlayServicesUtil
		 * .isGooglePlayServicesAvailable(getApplicationContext());
		 * 
		 * if (resultCode == ConnectionResult.SUCCESS) {
		 * Toast.makeText(getApplicationContext(),
		 * "isGooglePlayServicesAvailable SUCCESS", Toast.LENGTH_LONG) .show();
		 * } else { GooglePlayServicesUtil.getErrorDialog(resultCode, this,
		 * RQS_GooglePlayServices); }
		 */

	}

}