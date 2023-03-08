package com.example.cadox.dao

import com.example.cadox.dao.memory.ArticleDaoMemoryImpl

object DaoFactory {
    fun getDao(type: DaoType) =
        when(type){
            DaoType.MEMORY -> ArticleDaoMemoryImpl()
            //DaoType.INTERNET -> ArticleDaoInternetImpl()
            //DaoType.DB -> ArticleDaoDbImpl()
        }
}