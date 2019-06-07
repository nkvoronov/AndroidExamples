package com.nkvoronov.lib1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	private Spinner spinner;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinner = findViewById(R.id.spinner);
		textView = findViewById(R.id.textView);
	}

	public void showTemp(View view) {
		int position = spinner.getSelectedItemPosition();
		String description = getDescriptionByPosition(position);
		textView.setText(description);
	}

	private String getDescriptionByPosition(int position) {
		String[] description = getResources().getStringArray(R.array.spinner_value);
		return description[position];
	}
}
		
