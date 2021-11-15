package com.example.lasthomework

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

private lateinit var mainText: TextView
class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_main, container, false)
        mainText = view.findViewById(R.id.main_text)

        mainText.setText(
            "Эхеверия пулидонис (Echeveria pulidonis) один из самых медленнорастущих низкорослых суккулентов. За ним легко ухаживать, и он станет хорошей отправной точкой для начинающих любителей этих декоративных растений. Эта статья предоставит вам всю информацию, необходимую для ухода за вашим домашним цветком и его размножения.\n" +
                    "Родиной этого вида является Мексика. Эхеверия пулидонис является медленно растущим бесстеблевым суккулентом рода Echeveria с зелено-синими листьями в форме ложки, очерченными розово-красными краями. Его розетка имеет эффектную правильную геометрическую форму.\n" +
                    "Стебли очень короткие, до 2 см в длину и 1 см в ширину, практически невидимы из под розетки. Тонкие корни довольно короткие. Розетка с множеством листьев (25 и более) достигает максимальной ширины и высоты от 10 до 14 см. Несмотря на то, что его часто считают одиночным растением, со временем суккулент разрастается множеством дочерних розеток, образуя небольшой холмик. Листья мясистые, восходящие, продолговатые или яйцевидные, выпуклые внизу, с щетинками и длиной до 5 см. Листики окрашены в синевато-зеленый оттенок, края с отчетливым красным кончиком. Во время засухи и в период покоя листья приобретают характерный пурпурно-красный оттенок.\n" +
                    "Красноватый цветонос до 20 см высотой, по форме напоминающий «пастуший посох». Цветки по 10 и более на каждую кисть.\n" +
                  "Цветение Эхеверии пулидонис начинается весной, когда на конце цветоноса распускаются ярко-желтые цветы в форме колокольчиков. Из-за тяжести цветков цветоносы часто наклоняются в бок.\n"

        )
        mainText.setMovementMethod(ScrollingMovementMethod())
        return view
    }
}

