package tw.edu.pu.o1083002.crazyshape

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_game.*

@GlideModule
public final class MyAppGlideModule : AppGlideModule()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img:ImgTitle = findViewById(R.id.img)
        GlideApp.with(this)
            .load(R.drawable.earth)
            .into(img)


        Toast.makeText(baseContext,"作者：巫萬升",Toast.LENGTH_LONG).show()

        imgNext.setOnLongClickListener(object: View.OnLongClickListener{
                override fun onLongClick(p0:View?):Boolean{
                    intent = Intent(this@MainActivity, GameActivity::class.java)
                    startActivity(intent)
                    return true
                }
        })

    }
}