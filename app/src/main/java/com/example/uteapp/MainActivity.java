package com.example.uteapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext_user, edittext_password;
    Button button_SignIn;
    TextView tv_Exit;
    String tdn, mk;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_user = (EditText) findViewById(R.id.edtUsername);
        edittext_password = (EditText) findViewById(R.id.edtPassword);
        button_SignIn = (Button) findViewById(R.id.btnLogin);
        tv_Exit = (TextView) findViewById(R.id.tvForgetPassword);
        ControlButton();
        context = this;
    }

    private void login() {
        //check username & password are empty
        if(edittext_user.length() != 0 && edittext_password.length() != 0){

        }
        boolean error = false;

        //showProgress(true);
        // when process we must have sometime

        // get data
        String userName = edittext_user.getText().toString().trim();
        String password = edittext_password.getText().toString().trim();

        // password empty
//        if (TextUtils.isEmpty(password)) {
//            editPassword.requestFocus();
//            editPassword.setError(context.getResources().getString(R.string.error_field_required));
//            error = true;
//        }

//        // username empty
//        if (TextUtils.isEmpty(userName)) {
//            editUserName.requestFocus();
//            editUserName.setError(context.getResources().getString(R.string.error_field_required));
//            error = true;
//        }
//
//        // all data is ok
//        showProgress(false);

        //if (!error) {
            // create intent to show Main Activity
            Intent intent = new Intent(context, HomeActivity.class);

//            // send data if need
//            intent.putExtra(KEY_USER_TO_MAIN, userName);
//            intent.putExtra(KEY_PASSWORD_TO_MAIN, password);

            // start Main Activity
            startActivity(intent);
        //}
    }
    private void ControlButton() {
        button_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        tv_Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog_Alert);
                builder.setTitle("Thoát ngay bây giờ !");
                builder.setMessage("Xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
//        button_SignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Dialog dialog = new Dialog(MainActivity.this);
//                dialog.setTitle("TẠO TÀI KHOẢN");
//                dialog.setCancelable(false);
//                dialog.setContentView(R.layout.signup_layout);
//
//                EditText edtUser_SignUp = (EditText) dialog.findViewById(R.id.edittext_user_signup);
//                EditText edtPassword_SignUp = (EditText) dialog.findViewById(R.id.edittext_password_signup);
//                EditText edtCfPassword_SignUp = (EditText) dialog.findViewById(R.id.edittext_cfpassword_signup);
//
//                Button btnCacel_SignUp = (Button) dialog.findViewById(R.id.btnCancel);
//                Button btnSignUp_SignUp = (Button) dialog.findViewById(R.id.btnSignUp);
//
//                btnSignUp_SignUp.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        if (edtPassword_SignUp.equals(edtCfPassword_SignUp)){
//                            tdn = edtUser_SignUp.getText().toString().trim();
//                            mk = edtPassword_SignUp.getText().toString().trim();
//
//                            edittext_user.setText(tdn);
//                            edittext_password.setText(mk);
//
//                            dialog.cancel();
//                        }else {
//                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog_Alert);
//                            builder.setTitle("Thông báo !");
//                            builder.setMessage("Vui lòng xác nhận lại mật khẩu !");
//                            builder.setIcon(android.R.drawable.ic_dialog_alert);
//                        }
//                    }
//                });
//                btnCacel_SignUp.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        dialog.cancel();
//                    }
//                });
//                dialog.show();
//            }
//        });
    }
}