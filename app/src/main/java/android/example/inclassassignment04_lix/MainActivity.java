package android.example.inclassassignment04_lix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;
    float textSize=12;
    TextView mTextView;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.input_text_view);
        mTextView=(TextView)findViewById(R.id.text);}

    public void copyText(View v){
        text=mEditText.getText().toString();
        mTextView.setText(text);

        mTextView.setTextSize(textSize);
    }

    public void doubleText(View v) {
        text = text + text;
        mTextView.setText(text);

        mTextView.setTextSize(textSize);
    }

    public void upText(View v) {
        textSize = textSize + 1;

        mTextView.setTextSize(textSize);
    }

    public void downSize(View v) {
        textSize = textSize - 1;
        mTextView.setTextSize(textSize);
    }


    @Override
    protected void onResume(){
        Toast.makeText(MainActivity.this,"Welcome!",Toast.LENGTH_SHORT).show();
        super.onResume();
    }
}
