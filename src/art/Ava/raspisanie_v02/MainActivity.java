package art.Ava.raspisanie_v02;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity  {
	//

	TextView RaspView;
	Button BPNp;
	Button BVTp;
	Button BSRp;
	Button BCHp;
	Button BPTp;
	private OnClickListener oclBtn;
	//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
		RaspView = (TextView) findViewById(R.id.BTView);
		BPNp = (Button ) findViewById(R.id.BPN);
		BVTp = (Button ) findViewById(R.id.BVT);
		BSRp = (Button ) findViewById(R.id.BSR);
		BCHp = (Button ) findViewById(R.id.BCH);
		BPTp = (Button ) findViewById(R.id.BPT);
		
	oclBtn = new OnClickListener() {
	
	@Override
	public void onClick(View v){
		
		switch (v.getId()){
		
		case R.id.BPN:
			RaspView.setText("*Мат.Ан/Числ.Методы \n*Укр.Яз \n*ОС \n*Физ-ра");
			break; 
		case R.id.BVT:
			RaspView.setText(" *Укр.Лит \n *Матем \n *Ин.Яз \n *Оcн.Прав.");
			break;
		case R.id.BSR:
			RaspView.setText("*Инфа \n*Мат.Ан \n*ОП \n*-/ОП");
			break;
		case R.id.BCH:
			RaspView.setText("*Мат.Ан \n*Числ.Метод \n*Культ-я \n*Kл.Час");
			break;
		case R.id.BPT:
			RaspView.setText("*БД \n*Mат.Ан \n*БД/-  ");
			break;			
		}
		
	}
		
	
		};
		BPNp.setOnClickListener(oclBtn);
		BVTp.setOnClickListener(oclBtn);
		BSRp.setOnClickListener(oclBtn);
		BCHp.setOnClickListener(oclBtn);
		BPTp.setOnClickListener(oclBtn);
	}
}
