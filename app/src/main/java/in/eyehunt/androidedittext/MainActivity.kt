package `in`.eyehunt.androidedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // on click button
    fun showName(view: View) {
        //getting text from editText
        var name = editText.text
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}
