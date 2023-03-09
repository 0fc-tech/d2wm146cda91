package com.example.cadox.bo

import java.time.LocalDate
import java.util.Currency

data class Article(
    val id : Long = 0L,
    val intitule : String,
    val description : String,
    val prix : Double,
    val niveau:Byte,
    val url : String? = null ,
    var achete: Boolean = false,
    var dateAchat : LocalDate? = null
){
    fun prixEuro() =  "${prix}€"
}
