package com.example.tradechart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.scichart.charting.visuals.SciChartSurface
import com.scichart.extensions.builders.SciChartBuilder

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class TradeFragment : Fragment() {
    lateinit var sciChart: SciChartSurface


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trade, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_next).setOnClickListener {
            findNavController().navigate(R.id.action_TradeFragment_to_TradeSecFragment)
        }

        SciChartBuilder.init(this.context)


    }
}
