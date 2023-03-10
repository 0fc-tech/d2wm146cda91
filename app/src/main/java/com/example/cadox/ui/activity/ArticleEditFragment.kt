package com.example.cadox.ui.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.cadox.R
import com.example.cadox.databinding.FragmentArticleEditBinding
import com.google.android.material.snackbar.Snackbar


class ArticleEditFragment : Fragment() {
    val args by navArgs<ArticleEditFragmentArgs>()
    lateinit var binding: FragmentArticleEditBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleEditBinding.inflate(
            inflater,
            container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = args.article
        Snackbar.make(
            view,
            args.article.toString(),
            Snackbar.LENGTH_LONG
        ).show()
    }
}





