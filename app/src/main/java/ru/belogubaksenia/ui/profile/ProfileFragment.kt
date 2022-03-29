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
import retrofit2.Call
import retrofit2.Response
import ru.belogubaksenia.*
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
        val feel = MyRetrofit().getRetrofit()
        val api_feel=feel.create(ApiRet::class.java)
        val feelings_call: retrofit2.Call<feelings> = api_feel.getFeel()
        feelings_call.enqueue(object :retrofit2.Callback<feelings>{
            override fun onResponse(call: Call<feelings>, response: Response<feelings>) {
                if(response.isSuccessful){
                    feel_recycler.adapter=
                        response.body()?.let { FeelRecycler(requireContext(),it) }
                }
            }

            override fun onFailure(call: Call<feelings>, t: Throwable) {

            }
        })


        val state_recycler: RecyclerView =root.findViewById(R.id.state_rec)
        val quotes = MyRetrofit().getRetrofit()
        val api_ret=quotes.create(ApiRet::class.java)
        val quotes_call: retrofit2.Call<quotes> = api_ret.getQuotes()
        quotes_call.enqueue(object :retrofit2.Callback<quotes>{
            override fun onResponse(call: Call<quotes>, response: Response<quotes>) {
                if(response.isSuccessful){
                    state_recycler.adapter=
                        response.body()?.let { StateRecycler(requireContext(),it) }
                }
            }

            override fun onFailure(call: Call<quotes>, t: Throwable) {

            }
        })
        return root
    }

}