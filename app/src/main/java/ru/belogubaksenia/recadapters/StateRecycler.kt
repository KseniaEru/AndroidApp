package ru.belogubaksenia.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import ru.belogubaksenia.R

class StateRecycler (val context: Context,val state_list:ArrayList<state>):RecyclerView.Adapter<StateRecycler.MyVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter,parent,false)
        return MyVH(root)
    }
    class MyVH(itemView: View):RecyclerView.ViewHolder(itemView){

        val image:ImageView=itemView.findViewById(R.id.img_state)
        val title:TextView=itemView.findViewById(R.id.title_state)
        val textView:TextView=itemView.findViewById(R.id.text_state)

    }

    override fun onBindViewHolder(holder: StateRecycler.MyVH, position: Int) {
        holder.image.setImageResource(state_list[position].image_state)
        holder.title.setText(state_list[position].title)
        holder.textView.setText(state_list[position].text_state)
    }

    override fun getItemCount(): Int {
        return state_list.size
    }
}