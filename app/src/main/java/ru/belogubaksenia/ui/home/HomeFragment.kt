package ru.belogubaksenia.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.belogubaksenia.R
import ru.belogubaksenia.recadapters.FeelRecycler
import ru.belogubaksenia.recadapters.MyFeel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root: View = inflater.inflate(R.layout.fragment_home,container,false)
        return root
    }
}