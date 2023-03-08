package com.example.cadox.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cadox.R
import com.example.cadox.repository.ArticleRepository

class ArticleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)
        Toast.makeText(
            this,
            ArticleRepository.getArticle(1).toString(),
            Toast.LENGTH_LONG).show()
    }
}