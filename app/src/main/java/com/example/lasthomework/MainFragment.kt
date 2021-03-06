package com.example.lasthomework

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

private lateinit var mainText: TextView
private lateinit var moreButton: Button
class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_main, container, false)
        mainText = view.findViewById(R.id.main_text)

        mainText.setText(
            "Эхеверия пулидонис (Echeveria pulidonis) один из самых медленнорастущих низкорослых суккулентов. За ним легко ухаживать, и он станет хорошей отправной точкой для начинающих любителей этих декоративных растений. Эта статья предоставит вам всю информацию, необходимую для ухода за вашим домашним цветком и его размножения.\n" +
                    "Родиной этого вида является Мексика. Эхеверия пулидонис является медленно растущим бесстеблевым суккулентом рода Echeveria с зелено-синими листьями в форме ложки, очерченными розово-красными краями. Его розетка имеет эффектную правильную геометрическую форму.\n"


        )
        mainText.setMovementMethod(ScrollingMovementMethod())
        moreButton=view.findViewById(R.id.more_button)
        moreButton.setOnClickListener {  var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sukkulenty.com/"))
            startActivity(intent)}
        return view
    }
}

