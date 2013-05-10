package co.cribon.calmapp;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.socialize.ActionBarUtils;
import com.socialize.Socialize;
import com.socialize.entity.Entity;
import com.socialize.ui.actionbar.ActionBarOptions;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// Call Socialize in onCreate
		Socialize.onCreate(this, savedInstanceState);

		// Your entity key. May be passed as a Bundle parameter to your activity
		String entityKey = "http://issuu.com/reset-magazine/docs/issue8";

		// Create an entity object including a name
		// The Entity object is Serializable, so you could also store the whole
		// object in the Intent
		Entity entity = Entity.newInstance(entityKey, "CALMzine");

		// Create an options instance to specify your theme
		ActionBarOptions options = new ActionBarOptions();

		// Set the colors for the Action Bar

		options.setAccentColor(Color.parseColor("#e46f06")); // The accent line
																// below the
																// buttons

		// Wrap your existing view with the action bar.
		// your_layout refers to the resource ID of your current layout.
		View actionBarWrapped = ActionBarUtils.showActionBar(this,
				R.layout.activity_mnu, entity, options);

		// Now set the view for your activity to be the wrapped view.
		setContentView(actionBarWrapped);

		final ImageButton mag_BTN = (ImageButton) findViewById(R.id.mag_BTN);
		mag_BTN.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent toMag = new Intent(MenuActivity.this, MagActivity.class);
				startActivity(toMag);
				return;
			}
		});
		
		final ImageButton map_BTN = (ImageButton) findViewById(R.id.map_BTN);
		map_BTN.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent toMap = new Intent(MenuActivity.this, MapsActivity.class);
				startActivity(toMap);
				return;
			}
		});
		
		final ImageButton about_BTN = (ImageButton) findViewById(R.id.about_BTN);
		about_BTN.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent toAbout = new Intent(MenuActivity.this, AboutActivity.class);
				startActivity(toAbout);
				return;
			}
		});

	
	        try {
	            PackageInfo info = getPackageManager().getPackageInfo("co.cribon.calmapp",
	                    PackageManager.GET_SIGNATURES);
	            for (Signature signature : info.signatures) {
	                MessageDigest md = MessageDigest.getInstance("SHA");
	                md.update(signature.toByteArray());
	                Log.d("TEMPTAGHASH KEY:",
	                        Base64.encodeToString(md.digest(), Base64.DEFAULT));
	            }
	        } catch (NameNotFoundException e) {

	        } catch (NoSuchAlgorithmException e) {

	        }

	    }
	


	@Override
	protected void onPause() {
		super.onPause();

		// Call Socialize in onPause
		Socialize.onPause(this);
	}

	@Override
	protected void onResume() {
		super.onResume();

		// Call Socialize in onResume
		Socialize.onResume(this);
	}

	@Override
	protected void onDestroy() {
		// Call Socialize in onDestroy before the activity is destroyed
		Socialize.onDestroy(this);

		super.onDestroy();
	}
}