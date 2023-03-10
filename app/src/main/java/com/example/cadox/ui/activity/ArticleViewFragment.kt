package com.example.cadox.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.cadox.R
import com.example.cadox.databinding.FragmentArticleViewBinding
import com.example.cadox.repository.ArticleRepository
import com.google.android.material.snackbar.Snackbar

class ArticleViewFragment : Fragment() {
    lateinit var favb : FragmentArticleViewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        favb = FragmentArticleViewBinding.inflate(
            inflater,container,false
        )
        return favb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        favb.article= ArticleRepository.getArticle(1)
        //Afficher les éléments de l'article 1 dans les différentes vues
        //de activity_article_view
        if(favb.article == null) Snackbar.make(
            favb.root,
            "Article Indisponible",
            12).show()
        else{
            favb.buttonInternet.setOnClickListener {
                Snackbar.make(
                    favb.root,
                    favb.article?.url ?: "pas d'url",
                    Snackbar.LENGTH_LONG).show()
            }
            favb.buttonEdit.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(
                        ArticleViewFragmentDirections.
                        actionArticleViewFragmentToArticleEditFragment(
                            favb.article!!
                        )
                    )
            }
        }
    }
}









