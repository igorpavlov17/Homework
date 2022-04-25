package com.example.homework4

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items.view.*

class ItemAdapter(private val onClickListener: MyOnClickListener): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private var list = emptyList<Item>()

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemView.title_container.title_text.text = list[position].title
        holder.itemView.data_container.data_text.text = list[position].description
        holder.itemView.data_container.visibility = View.GONE
        holder.itemView.setOnClickListener{
            onClickListener.onClick(list[position])
            if (holder.itemView.data_container.visibility == View.GONE) holder.itemView.data_container.visibility = View.VISIBLE
            else holder.itemView.data_container.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Item>){
        this.list = list
        notifyDataSetChanged()
    }
}