package ibrahim.aytimur.dinamikbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonGoster = Button(this)
        buttonGoster.setText(R.string.btnAdi)
        buttonGoster.layoutParams= LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT)
        rootContainer?.addView(buttonGoster)

        buttonGoster.setOnClickListener {
            val mesaj = resources.getString(R.string.mesaj)
            Toast.makeText(this,mesaj,Toast.LENGTH_SHORT).show()

            val editText1 = EditText(this)
            editText1.setText(R.string.editText1)
            editText1.layoutParams= LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
            rootContainer?.addView(editText1)
        }
    }
}
