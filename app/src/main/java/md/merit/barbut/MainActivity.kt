package md.merit.barbut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.MainThread
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cl_all_screen.setOnClickListener {
            arunca()
        }
    }

    private fun arunca() = CoroutineScope(Dispatchers.Main).launch {
        Glide.with(this@MainActivity).load(R.drawable.barbutgiff).into(iv_giff)
        iv_zar1.visibility = View.INVISIBLE
        iv_zar2.visibility = View.INVISIBLE
        iv_giff.visibility= View.VISIBLE

        val zar1 = nextInt(1,7)
        val zar2 = nextInt(1,7)

        delay(3000)

        when (zar1){
            1 -> iv_zar1.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut1))
            2 -> iv_zar1.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut2))
            3 -> iv_zar1.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut3))
            4 -> iv_zar1.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut4))
            5 -> iv_zar1.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut5))
            6 -> iv_zar1.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut6))
        }
        when(zar2){
            1 -> iv_zar2.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut1))
            2 -> iv_zar2.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut2))
            3 -> iv_zar2.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut3))
            4 -> iv_zar2.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut4))
            5 -> iv_zar2.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut5))
            6 -> iv_zar2.setImageDrawable(ContextCompat.getDrawable(this@MainActivity, R.drawable.barbut6))
        }
        iv_giff.visibility = View.INVISIBLE
        iv_zar1.visibility = View.VISIBLE
        iv_zar2.visibility = View.VISIBLE
    }
}