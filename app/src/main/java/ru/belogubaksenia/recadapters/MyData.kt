package ru.belogubaksenia.recadapters

import ru.belogubaksenia.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list= arrayListOf(feel(R.drawable.igr_img,"Игрушки"),
    feel(R.drawable.odejda_img,"Одежда"),
    feel(R.drawable.dets_img,"Детское"),
    feel(R.drawable.aks,"Акссесуары"),
    feel(R.drawable.dets_img,"Детское"),
    feel(R.drawable.dets_img,"Детское"),
    feel(R.drawable.dets_img,"Детское"),
    feel(R.drawable.dets_img,"Детское"),
    feel(R.drawable.dets_img,"Детское"),
    feel(R.drawable.dets_img,"Детское")
)}
data class state(val title:String,val text_state:String,val image_state:Int)
class MyState{val state_list= arrayListOf(state("Заголовок 1 статьи","Краткое описание", R.drawable.igr_img),
    state("Заголовок 2 статьи","Краткое описание", R.drawable.igr_img),
    state("Заголовок 3 статьи","Краткое описание", R.drawable.igr_img),
    state("Заголовок 4 статьи","Краткое описание", R.drawable.igr_img),
    state("Заголовок 5 статьи","Краткое описание", R.drawable.igr_img),
    state("Заголовок 6 статьи","Краткое описание", R.drawable.igr_img)
)}

