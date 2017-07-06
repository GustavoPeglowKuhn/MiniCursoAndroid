package es.esy.alemao.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StandardActivity extends AppCompatActivity implements View.OnClickListener{

	Button btn_mais, btn_menos, btn_mult, btn_div;

	EditText txt_a, txt_b;
	TextView txt_res;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_standard);

		txt_a = (EditText) findViewById(R.id.standard_txt_a);
		txt_b = (EditText) findViewById(R.id.standard_txt_b);
		txt_res = (TextView) findViewById(R.id.standard_txt_res);

		btn_mais = (Button) findViewById(R.id.standard_btn_mais);
		btn_menos = (Button) findViewById(R.id.standard_btn_menos);
		btn_mult = (Button) findViewById(R.id.standard_btn_mult);
		btn_div = (Button) findViewById(R.id.standard_btn_div);

		btn_mais.setOnClickListener(this);
		btn_menos.setOnClickListener(this);
		btn_mult.setOnClickListener(this);
		btn_div .setOnClickListener(this);
	}

	@Override
	public void onClick(View view){
		double a, b;
		if(txt_a.getText().length() == 0) Toast.makeText(this, "Digite um valor de a", Toast.LENGTH_SHORT).show();
		else if(txt_b.getText().length() == 0) Toast.makeText(this, "Digite um valor de b", Toast.LENGTH_SHORT).show();
		else{
			try{
				a = Double.parseDouble(txt_a.getText().toString());
				b = Double.parseDouble(txt_b.getText().toString());
			}catch(Exception e){
				Toast.makeText(this, "Digite um valor valido", Toast.LENGTH_SHORT).show();
				return;
			}
			switch(view.getId()){
				case R.id.standard_btn_mais:
					txt_res.setText(String.valueOf(a+b));
					break;
				case R.id.standard_btn_menos:
					txt_res.setText(String.valueOf(a-b));
					break;
				case R.id.standard_btn_mult:
					txt_res.setText(String.valueOf(a*b));
					break;
				case R.id.standard_btn_div:
					txt_res.setText(String.valueOf(a/b));
					break;
			}
		}
	}
}
