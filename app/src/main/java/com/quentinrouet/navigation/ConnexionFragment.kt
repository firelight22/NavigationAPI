package com.quentinrouet.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class ConnexionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_connexion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var button = view.findViewById<Button>(R.id.button)
        var moi :User = User("email@email.Fr",30)
        button.setOnClickListener {
            var action =ConnexionFragmentDirections.actionConnexionFragmentToHomeFragment(moi)
            it.findNavController().navigate(action)
        }
    }
}