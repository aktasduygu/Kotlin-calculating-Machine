package com.dygak.viewbindingactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dygak.viewbindingactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Double? = null
    var number2 : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun toplaMa(view: View){
        val number1 = binding.editText.text.toString().toDoubleOrNull()
        val number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            val sonuc = number1 + number2
            binding.sonuc.text = "Sonuc: ${sonuc}"
        }else{
            binding.sonuc.text = "Enter Number"
        }
    }

    fun cıkarMa(view: View){
        val number1 = binding.editText.text.toString().toDoubleOrNull()
        val number2 = binding.editText2.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            val sonuc = number1 - number2
            binding.sonuc.text = "Sonuc: ${sonuc}"
        }else{
            binding.sonuc.text = "Enter Number"
        }

    }

    fun carpMa(view: View){
        val number1 = binding.editText.text.toString().toDoubleOrNull()
        val number2 = binding.editText2.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            val sonuc = number1 * number2
            binding.sonuc.text = "Sonuc: ${sonuc}"
        }else{
            binding.sonuc.text = "Enter Number"
        }

    }

    fun bolMe(view: View){
        val number1 = binding.editText.text.toString().toDoubleOrNull()
        val number2 = binding.editText2.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            val sonuc = number1 / number2
            binding.sonuc.text = "Sonuc: ${sonuc}"
        }else{
            binding.sonuc.text = "Enter Number"
        }

    }

}