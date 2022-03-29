package ru.belogubaksenia.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import ru.belogubaksenia.R
import ru.belogubaksenia.databinding.FragmentHomeBinding
import ru.belogubaksenia.recadapters.FeelRecycler
import ru.belogubaksenia.recadapters.MyFeel
import ru.belogubaksenia.recadapters.MyState
import ru.belogubaksenia.recadapters.StateRecycler

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_profile,container,false)
        val feel_recycler: RecyclerView =root.findViewById(R.id.feel_rec)
        feel_recycler.adapter= FeelRecycler(requireContext(), MyFeel().list)
        val state_recycler:RecyclerView=root.findViewById(R.id.state_rec)
        state_recycler.adapter=StateRecycler(requireContext(),MyState().state_list)
        return root
    }

}