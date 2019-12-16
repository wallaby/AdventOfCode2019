
package onl.toth.dev.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.File

class MainActivity : AppCompatActivity() {

    private val FILE_NAME_DAY1 = "day1.in"

    private lateinit var resultTextView: TextView
    private lateinit var calculateButton: Button
    private lateinit var calculateClosureButton: Button

    private lateinit var day1 : Day1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.result)
        calculateButton = findViewById(R.id.calculate)
        calculateClosureButton = findViewById(R.id.calculateClosure)
        setup1()
    }

    private fun setup1() {
        val day1Input = assets.open(FILE_NAME_DAY1)
        val masses = mutableListOf<Int>()
        day1Input.bufferedReader().lineSequence().forEach {  line -> masses.add(line.toInt()) }
        day1 = Day1(masses)
        calculateButton.setOnClickListener { resultTextView.text = day1.calculateFuelRequirement().toString() }
        calculateClosureButton.setOnClickListener {
            resultTextView.text = day1.calculateFuelRequirementClosureB().toString()
        }

    }
}
