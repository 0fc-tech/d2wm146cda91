package com.example.cadox.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.cadox.R
import com.example.cadox.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class ArticleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)
        val article = ArticleRepository.getArticle(1)

        //Afficher les éléments de l'article 1 dans les différentes vues
        //de activity_article_view
        val textViewIntitule = findViewById<TextView>(R.id.textViewTitle)
        val textViewDateBuy = findViewById<TextView>(R.id.textViewDateBuy)
        val textViewPrice = findViewById<TextView>(R.id.textViewPrice)
        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        val textViewUrl = findViewById<TextView>(R.id.textViewUrl)
        val ratingBarLevel = findViewById<RatingBar>(R.id.ratingBarLevel)
        val checkBoxIsBought = findViewById<CheckBox>(R.id.checkBoxIsBought)
        val buttonEdit = findViewById<ImageButton>(R.id.buttonEdit)
        val buttonInternet = findViewById<ImageButton>(R.id.buttonInternet)
        if(article == null) Snackbar.make(
            textViewIntitule,
            "Article Indisponible",
            12).show()
        else{
            textViewIntitule.text = article.intitule
            textViewDateBuy.text = article.dateAchat.toString()
            textViewPrice.text = article.prixEuro()
            textViewDescription.text = article.description
            textViewUrl.text = article.url
            ratingBarLevel.rating = article.niveau.toFloat()
            checkBoxIsBought.isChecked = article.achete
            buttonInternet.setOnClickListener {
                Snackbar.make(
                    buttonInternet,
                    article.url ?: "pas d'url",
                    Snackbar.LENGTH_LONG).show()
            }
        }
    }
}