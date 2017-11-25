package tech.indi.simplekotlincoworkfest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_share.setOnClickListener {view ->
            val intent_sosmed = Intent(Intent.ACTION_SEND)
            intent_sosmed.putExtra(Intent.EXTRA_TEXT, content.text.toString());
            intent_sosmed.setType("text/plain")
            startActivity(intent_sosmed)
        }

    }
}


