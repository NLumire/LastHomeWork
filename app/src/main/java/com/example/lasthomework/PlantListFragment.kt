package com.example.lasthomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.TextView



class PlantListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_plant_list, container, false)

        val cardList: List<Card> = listOf(
            Card(R.drawable.recviewimg1, headText = "Капризный кактус Ацтекиум", secondText = "Ацтекиум (Aztekium) являясь самым медленнорастущим растением из всего семейства Кактусовых, также самый сложный и трудный в выращивании кактус."),
            Card(R.drawable.recviewimg2, headText = "Арабская «Роза пустыни»", secondText = "Существует много замечательных суккулентов, которые имеются у любителей редких растений, но немногие из них столь же эффектны, как удивительный Адениум арабикум (Adenium arabicum) в полном цвету. Это растение запоминается не только своими цветами, но и своим внешним видом."),
            Card(R.drawable.recviewimg3, headText = "Американский суккулент Ленофиллюм", secondText = "Ленофиллюм (Lenophyllum) – это род суккулентных растений семейства Толстянковые (Crassulaceae). Представители этого рода довольно редко встречаются в питомниках и у обычных цветоводов. Но эти привлекательные растения ценятся из-за своего внешнего вида и удивительных расцветок листьев.")


        )

        val usersRecyclerView: RecyclerView = view.findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        usersRecyclerView.adapter = CardAdapter(cardList)





        return view
    }
}
