package com.example.openscreenanimation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.openscreenanimation.R
import com.example.openscreenanimation.databinding.ItemAnimLayoutBinding
import com.example.openscreenanimation.model.AnimItem

class ItemAnimAdapter(
    private val listener: IOnClinkListenern,
    private var itemAnimation: MutableList<AnimItem> = mutableListOf()
) : RecyclerView.Adapter<ItemAnimAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_anim_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val dataItems = itemAnimation[position]
        with(holder) {
            with(binding){
                tvNameAnim.text = dataItems.name
                cardContainer.setCardBackgroundColor(root.context.getColor(dataItems.color))
            }
            setListener(dataItems)
        }

    }

    override fun getItemCount() = itemAnimation.size

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemAnimLayoutBinding.bind(itemView)
        fun setListener(anims: AnimItem) {
            binding.root.setOnClickListener { listener.onClickItem(anims) }
        }
    }


}

