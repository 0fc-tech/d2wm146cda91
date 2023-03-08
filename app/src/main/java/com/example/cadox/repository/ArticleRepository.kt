package com.example.cadox.repository

import com.example.cadox.bo.Article
import com.example.cadox.dao.DaoFactory
import com.example.cadox.dao.DaoType

object ArticleRepository {
    private var daoMemory = DaoFactory.getDao(DaoType.MEMORY)
    //private var daoInternet = DaoFactory.getDao(DaoType.INTERNET)
    //private var daoDB = DaoFactory.getDao(DaoType.DB)
    fun getArticle(id:Long)= daoMemory.selectById(id)
    //fun getAllArticle(): List<Article> {
    //    var listArticles : List<Article> = daoDB.getAllArticle()
    //    if(listArticles.isEmpty()){
    //        listArticles = daoInternet.getAllArticle()
    //    }
    //    return listArticles
    //}
}














