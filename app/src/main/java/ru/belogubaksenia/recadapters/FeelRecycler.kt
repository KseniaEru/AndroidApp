package ru.belogubaksenia.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.belogubaksenia.R
import ru.belogubaksenia.feelings


class FeelRecycler (val context: Context, val feelings: feelings): RecyclerView.Adapter<FeelRecycler.MyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler.MyVH {
       val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter,parent,false)
        return MyVH(root)
    }
    class MyVH(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView =itemView.findViewById(R.id.img_feel)
        val textView: TextView =itemView.findViewById(R.id.text_feel)
    }

    override fun onBindViewHolder(holder: FeelRecycler.MyVH, position: Int) {
        Glide.with(context).load(feelings.data[position].image).into(holder.imageView)
        holder.textView.setText(feelings.data[position].title)
    }

    override fun getItemCount(): Int {
        return feelings.data.size
    }
}