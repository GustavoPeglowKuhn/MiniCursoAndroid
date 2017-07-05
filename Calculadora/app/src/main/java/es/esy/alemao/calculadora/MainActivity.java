package es.esy.alemao.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
	Button standard, bhaskara;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		standard = (Button) findViewById(R.id.main_btn_standard);
		bhaskara = (Button) findViewById(R.id.main_btn_bhaskara);

		standard.setOnClickListener(this);
		bhaskara.setOnClickListener(this);
	}

	@Override
	public void onClick(View view){
		Intent i;
		switch(view.getId()){
			case R.id.main_btn_standard:
				i = new Intent(MainActivity.this, StandardActivity.class);
				break;
			case R.id.main_btn_bhaskara:
				i = new Intent(MainActivity.this, BhaskaraActivity.class);
				break;
			default:
				return;
		}
		this.startActivity(i);
	}
}
