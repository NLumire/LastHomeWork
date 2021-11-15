package com.example.lasthomework

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(card: Card) {
        val cardImageView: ImageView = itemView.findViewById(R.id.card_image_view)
        val cardHeadText: TextView = itemView.findViewById(R.id.head)
        val cardSecondText: TextView = itemView.findViewById(R.id.second_text)


        cardHeadText.text = card.headText
        cardSecondText.text = card.secondText
        cardImageView.setImageDrawable(itemView.context.getDrawable(card.imageRes))





    }


}