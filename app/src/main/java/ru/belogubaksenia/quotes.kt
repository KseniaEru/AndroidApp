package ru.belogubaksenia

data class quotes(val success: Boolean, val data:ArrayList<data_quotest>)
data class data_quotest(val id:Int,val title:String,val image:String,val description:String)
