package dev.luischang.fragmentsbottomnavigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.luischang.fragmentsbottomnavigation.R

class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //TODO: Asignar el adapter al recyclerView

        //TODO: Crear el listado de datos para las canciones



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_musica, container, false)
    }
}