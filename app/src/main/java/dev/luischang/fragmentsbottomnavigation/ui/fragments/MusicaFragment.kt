package dev.luischang.fragmentsbottomnavigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.luischang.fragmentsbottomnavigation.R
import dev.luischang.fragmentsbottomnavigation.ui.adapter.SongAdapter
import dev.luischang.fragmentsbottomnavigation.ui.model.SongModel

class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View =  inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)

        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(playList())

        return view
    }

    private fun playList(): List<SongModel>{
        var lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(
            SongModel(1
                ,R.drawable.korn1
                ,"A.D.I.D.A.S"
                ,"Korn"
                ,"Issues"
                ,"500,000"
                ,"4:23")
        )
        lstSong.add(
            SongModel(2
                ,R.drawable.korn2
                ,"Got the life"
                ,"Korn"
                ,"Korn"
                ,"700,000"
                ,"3:36")
        )
        lstSong.add(
            SongModel(3
                ,R.drawable.korn3
                ,"Freak on a leash"
                ,"Korn"
                ,"Issues"
                ,"900,000"
                ,"5:55")
        )
        lstSong.add(
            SongModel(4
                ,R.drawable.korn4
                ,"Blind"
                ,"Korn"
                ,"Issues"
                ,"540,000"
                ,"4:16")
        )
        lstSong.add(
            SongModel(5
                ,R.drawable.korn5
                ,"Clown"
                ,"Korn"
                ,"Issues"
                ,"990,000"
                ,"6:15")
        )
        return lstSong
    }


}