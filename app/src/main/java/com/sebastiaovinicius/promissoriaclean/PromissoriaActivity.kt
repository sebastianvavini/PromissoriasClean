package com.sebastiaovinicius.promissoriaclean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sebastiaovinicius.promissoriaclean.databinding.ActivityPromissoriaBinding

class PromissoriaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPromissoriaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPromissoriaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var valor = intent.getStringExtra("valor").toString()
        binding.textViewTotalInvestido.text=valor
    }
}