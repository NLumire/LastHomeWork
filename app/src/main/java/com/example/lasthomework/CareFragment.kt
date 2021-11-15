package com.example.lasthomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.text.method.ScrollingMovementMethod




private lateinit var careText: TextView

class CareFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_care, container, false)

        careText = view.findViewById(R.id.care_text)

        careText.setText(
            "В природных условиях обитания Эчеверия пулидонис растет на каменистых почвах на большой высоте. В этой среде обитания вода быстро отходит от корней растения, никогда не позволяя растению оставаться во влажной среде. По этой причине при выращивании важно использовать очень пористую почву, которая обеспечит быстрый дренаж (добавьте перлита или вермикулита).\n" +
                    "Качественная смесь для суккулентов отлично подойдет, если вы используете горшки, сделанные из таких материалов, как глина или терракота. Эти типы материалов удерживают воду намного больше, чем пластиковые горшки.\n" +
                    "Яркий свет необходим для того, чтобы розетка Эхеверии пулидонис не вытягивалась, также яркий свет усиливает красный оттенок краев листиков. Тем не менее, их желательно удерживать в полутени в жаркие летние дни, когда температура становится слишком высокой. Для цветка в помещении найдите место близко к окну, где много солнечного света.\n" +
                    "Эхеверия пулидонис растет в средиземноморском и субтропическом климате. Она любит тепло и немного более чувствительна к морозам, чем большинство других Эчеверий (рекомендуемая минимальная температура в зимний период 5 °C).\n" +
                    "Если поливать суккулент один раз в неделю или реже, вы получите более густые и коренастые стебли с лучшей окраской. Тщательно полейте горшок, когда почва станет сухой на ощупь.\n"
        )
        careText.setMovementMethod(ScrollingMovementMethod())
        return view

    }


}