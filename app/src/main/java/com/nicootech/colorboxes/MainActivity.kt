package com.nicootech.colorboxes

import android.graphics.Color
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nicootech.colorboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListener()

    }

    private fun setListener() {
        val clickable: List <View> = listOf(
            binding.textView1,
            binding.textView2,
            binding.textView3,
            binding.textView4,
            binding.textView5,
            binding.constraintLayout,
            binding.button3,
            binding.button4,
            binding.button5
            )
        clickable.forEach{ box ->
            box.setOnClickListener{
                makeColored(box)
            }
        }
    }

    private fun makeColored(view : View) {
        when(view.id){
            R.id.textView1 ->view.setBackgroundColor(Color.BLUE)
            R.id.textView2 ->view.setBackgroundColor(Color.CYAN)
            R.id.textView3 ->view.setBackgroundColor(Color.RED)
            R.id.textView4 ->view.setBackgroundColor(Color.GREEN)
            R.id.textView5 ->view.setBackgroundColor(Color.MAGENTA)
            R.id.constraint_layout ->view.setBackgroundColor(Color.YELLOW)

            R.id.button_3.apply {
                binding.textView3.setBackgroundColor(Color.RED)
            } ->view.setBackgroundColor(Color.RED)

            R.id.button_4.apply {
                view.setBackgroundColor(Color.GREEN)
            } -> binding.textView4.setBackgroundColor(Color.GREEN)

            R.id.button_5.apply {
                view.setBackgroundColor(Color.MAGENTA)
            } -> binding.textView5.setBackgroundColor(Color.MAGENTA)



            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }

}