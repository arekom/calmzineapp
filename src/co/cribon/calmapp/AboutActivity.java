package co.cribon.calmapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AboutActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);

		final ImageButton facebook_BTN = (ImageButton) findViewById(R.id.facebook_BTN);
		facebook_BTN.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
				Intent toFacebook = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/theCALMzone"));
				startActivity(toFacebook);
				return;
			}
		});

		final ImageButton twitter_BTN = (ImageButton) findViewById(R.id.twitter_BTN);
		twitter_BTN.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				
				Intent toTwitter = new Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/thecalmzone"));
				startActivity(toTwitter);
				return;
			}
		});
		final ImageButton www_BTN = (ImageButton) findViewById(R.id.www_BTN);
		www_BTN.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
				Intent toWWW = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thecalmzone.net/"));
				startActivity(toWWW);
				return;
			}
		});

	}
}
