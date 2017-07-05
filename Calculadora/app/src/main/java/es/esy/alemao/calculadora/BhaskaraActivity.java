package es.esy.alemao.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.FloatMath;

import static java.lang.Math.sqrt;

public class BhaskaraActivity extends AppCompatActivity implements View.OnClickListener{
	Button calcular;

	EditText txt_a, txt_b, txt_c;
	TextView txt_x1, txt_x2;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bhaskara);

		txt_a = (EditText) findViewById(R.id.bhaskara_txt_a);
		txt_b = (EditText) findViewById(R.id.bhaskara_txt_b);
		txt_c = (EditText) findViewById(R.id.bhaskara_txt_c);

		txt_x1 = (TextView) findViewById(R.id.bhaskara_txt_x1);
		txt_x2 = (TextView) findViewById(R.id.bhaskara_txt_x2);

		calcular = (Button) findViewById(R.id.bhaskara_btn_calcular);
		calcular.setOnClickListener(this);
	}

	@Override
	public void onClick(View view){
		//não precisa testar qual é o botão pois só tem um

		double a,b,c, delta;
		a = Double.parseDouble(txt_a.getText().toString());
		b = Double.parseDouble(txt_b.getText().toString());
		c = Double.parseDouble(txt_c.getText().toString());

		delta = sqrt(b*b-4*a*c);

		txt_x1.setText(String.valueOf((-b-delta)/(4*a)));
		txt_x2.setText(String.valueOf((-b+delta)/(4*a)));
	}
}
