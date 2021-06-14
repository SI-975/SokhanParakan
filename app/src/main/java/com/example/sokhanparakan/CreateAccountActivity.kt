package com.example.sokhanparakan

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sokhanparakan.databinding.ActivityCreateAccountBinding
import java.util.*

class CreateAccountActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreateAccountBinding
    var avatarImage = "profiledefault"
    var avatarColor = "#000000"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun avatarClick(view: View){
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        avatarImage = if(color == 0) "light$avatar" else "dark$avatar"

        val resourceId = resources.getIdentifier(avatarImage, "drawable",packageName)
        binding.signUpAvatar.setImageResource(resourceId)

    }

    fun generateClick(view: View){
        val random = Random()
        val colorHex = random.nextInt(0xffffff + 1)*(-1)
        binding.signUpAvatar.setBackgroundColor(colorHex)
        Toast.makeText(this, "$colorHex",Toast.LENGTH_SHORT).show()
        avatarColor = "$colorHex"
    }
}