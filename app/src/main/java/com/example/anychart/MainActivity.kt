package com.example.anychart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.enums.Align
import com.anychart.enums.Layout
import com.anychart.enums.LegendLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("VietNam","ThaiLand","Laos","Singapore")
        val gdp = arrayOf(1000,100,500,200)

        val pie = AnyChart.pie()
        val hazz = "Hieu ne"
        val data = ArrayList<DataEntry>()

        for(i in name.indices)
            data.add(ValueDataEntry(name[i],gdp[i]))

        pie.data(data)

        pie.title("GDP of Countries")
        pie.labels().position("outside")
        pie.legend().title("Chart")
        pie.legend().enabled(true)
        pie.legend().title().padding(0.0,0.0,10.0,0.0)
        pie.legend()
            .position("center")
            .align(Align.CENTER)
            .itemsLayout(LegendLayout.VERTICAL_EXPANDABLE)
            .iconSize(10)

        chartView.setChart(pie)

    }
}
