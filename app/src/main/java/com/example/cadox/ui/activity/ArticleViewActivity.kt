package com.example.cadox.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.databinding.DataBindingUtil
import com.example.cadox.R
import com.example.cadox.databinding.ActivityArticleViewBinding
import com.example.cadox.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class ArticleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val aavb : ActivityArticleViewBinding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_article_view)
        aavb.article= ArticleRepository.getArticle(1)
        //Afficher les éléments de l'article 1 dans les différentes vues
        //de activity_article_view
        if(aavb.article == null) Snackbar.make(
            aavb.root,
            "Article Indisponible",
            12).show()
        else{
            aavb.buttonInternet.setOnClickListener {
                Snackbar.make(
                    aavb.root,
                    aavb.article?.url ?: "pas d'url",
                    Snackbar.LENGTH_LONG).show()
            }
        }
    }
}