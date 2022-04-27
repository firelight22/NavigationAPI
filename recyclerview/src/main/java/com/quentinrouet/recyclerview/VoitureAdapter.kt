package com.quentinrouet.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quentinrouet.recyclerview.databinding.ItemListVoitureBinding

/**
 * Created by quentin for Navigation on 27/04/2022.
 */
class VoitureAdapter(listVoiture: ArrayList<Voiture>) :
    RecyclerView.Adapter<VoitureAdapter.VoitureViewHolder>() {
    var listVoiture = listVoiture;


    class VoitureViewHolder constructor(val binding: ItemListVoitureBinding):
        RecyclerView.ViewHolder(binding.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoitureViewHolder {
        val binding = ItemListVoitureBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VoitureViewHolder(binding);
    }

    override fun onBindViewHolder(holder: VoitureViewHolder, position: Int) {
        holder.binding.voiture = listVoiture[position]
    }

    override fun getItemCount(): Int = listVoiture.size

}