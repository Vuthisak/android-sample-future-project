package com.example.newhomescreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newhomescreen.databinding.ViewItermGridBinding

class GridAdapter(
    private val items: MutableList<String> = mutableListOf()
) : RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ViewItermGridBinding.inflate(
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
        binding: ViewItermGridBinding
    ) : RecyclerView.ViewHolder(binding.root)

}