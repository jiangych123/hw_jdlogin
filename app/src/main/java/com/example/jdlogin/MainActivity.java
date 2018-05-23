package com.example.jdlogin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView login_input_name;
	private TextView login_input_password;
	private CheckBox login_switchBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//获得变量
		login_input_name = (TextView) findViewById(R.id.login_input_name);
		login_input_password = (TextView) findViewById(R.id.login_input_password);
		login_switchBtn = (CheckBox) findViewById(R.id.login_switchBtn);
		
		onChangePassLook listener = new onChangePassLook();
		login_switchBtn.setOnCheckedChangeListener(listener);
	}

	public void checkLogin(View v) {

		//判断用户名与密码
		if (login_input_name.getText().toString().equals("admin")
				&& login_input_password.getText().toString().equals("123456")){
			Intent intent_1 = new Intent(this,UserActivity.class);
			startActivity(intent_1);
		}else {
			new AlertDialog.Builder(this)
					.setMessage("用户名或密码错误！")
					.setPositiveButton("确定", null).show();  //方法链调用
		}
	}

	class onChangePassLook implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
			// TODO Auto-generated method stub
		}
		
	}
}
