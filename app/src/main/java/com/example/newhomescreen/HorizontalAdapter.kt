package com.example.newhomescreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newhomescreen.databinding.ViewItemHorizontalBinding

class HorizontalAdapter(
    private val items: MutableList<String> = mutableListOf()
) : RecyclerView.Adapter<HorizontalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ViewItemHorizontalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = items.size + 6

    class ViewHolder(
        binding: ViewItemHorizontalBinding
    ) : RecyclerView.ViewHolder(binding.root)

}