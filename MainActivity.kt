package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var clear : Button
    lateinit var textview1 : TextView
    lateinit var b1 : Button
    lateinit var b2 : Button
    lateinit var b3 : Button
    lateinit var b4 : Button
    lateinit var b5 : Button
    lateinit var b6 : Button
    lateinit var b7 : Button
    lateinit var b8 : Button
    lateinit var b9 : Button
    lateinit var b0 : Button

    lateinit var textview2: TextView
    lateinit var addition:Button
    lateinit var subtraction:Button
    lateinit var multiplication:Button
    lateinit var division:Button
    lateinit var temp : String
    lateinit var buttonEqual : Button

    private var num1: Int = 0
    private var num2: Int = 0
    private var add: Boolean = false
    private var sub: Boolean = false
    private var mul: Boolean = false
    private var div: Boolean = false


    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clear = findViewById(R.id.clear)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        b0 = findViewById(R.id.b0)

        buttonEqual = findViewById(R.id.equalButton)

        textview1 = findViewById(R.id.numbers)
        textview2 = findViewById(R.id.finalresult)
        addition = findViewById(R.id.add)
        subtraction = findViewById(R.id.sub)
        multiplication = findViewById(R.id.mul)
        division = findViewById(R.id.div)

        textview1.text = null
        textview2.text = null

        b1.setOnClickListener(View.OnClickListener {
            textview1.append("1")
            textview2.text = textview2.text.toString() + "1"
        })

        b2.setOnClickListener(View.OnClickListener {
            textview1.append("2")
            textview2.text = textview2.text.toString() + "2"
        })

        b3.setOnClickListener(View.OnClickListener {
            textview1.append("3")
            textview2.text = textview2.text.toString() + "3"
        })

        b4.setOnClickListener(View.OnClickListener {
            textview1.append("4")
            textview2.text = textview2.text.toString() + "4"
        })

        b5.setOnClickListener(View.OnClickListener {
            textview1.append("5")
            textview2.text = textview2.text.toString() + "5"
        })

        b6.setOnClickListener(View.OnClickListener {
            textview1.append("6")
            textview2.text = textview2.text.toString() + "6"
        })

        b7.setOnClickListener(View.OnClickListener {
            textview1.append("7")
            textview2.text = textview2.text.toString() + "7"
        })

        b8.setOnClickListener(View.OnClickListener {
            textview1.append("8")
            textview2.text = textview2.text.toString() + "8"
        })

        b9.setOnClickListener(View.OnClickListener {
            textview1.append("9")
            textview2.text = textview2.text.toString() + "9"
        })

        b0.setOnClickListener(View.OnClickListener {
            textview1.append("0")
            textview2.text = textview2.text.toString() + "0"
        })

        addition.setOnClickListener(View.OnClickListener {
            //textview1.append("+")
            if (textview2.text == null)
            {
                textview2.text = null
            }
            else
            {
                textview1.append("+")
                num1 = textview2.text.toString().toInt()
                add = true
                textview2.text = null
            }
        })

        subtraction.setOnClickListener(View.OnClickListener {
            //textview1.append("-")
            /*if (textview2.text == null)
            {
                textview2.text = null
            }
            else
            {
                textview1.append("-")
                num1 = textview2.text.toString().toInt()
                sub = true
                textview2.text = null
            }*/
            textview1.append("-")
            num1 = textview2.text.toString().toInt()
            sub = true
            textview2.text = null
        })

        multiplication.setOnClickListener(View.OnClickListener {
            //textview1.append("*")
            /*if (textview2.text == null)
            {
                textview2.text = null
            }
            else
            {
                textview1.append("*")
                num1 = textview2.text.toString().toInt()
                mul = true
                textview2.text = null
            }*/
            textview1.append("*")
            num1 = textview2.text.toString().toInt()
            mul = true
            textview2.text = null
        })

        division.setOnClickListener(View.OnClickListener {
            //textview1.append("/")
            /*if (textview2.text == null)
            {
                textview2.text = null
            }
            else
            {
                textview1.append("/")
                num1 = textview2.text.toString().toInt()
                div = true
                textview2.text = null
            }*/
            textview1.append("/")
            num1 = textview2.text.toString().toInt()
            div = true
            textview2.text = null
        })

        buttonEqual.setOnClickListener(View.OnClickListener {
            num2 = textview2.text.toString().toInt()

            if (add)
            {
                textview2.text = (num1 + num2).toString()
                add = false
            }
            if (sub)
            {
                textview2.text = (num1 - num2).toString()
                sub = false
            }
            if (mul)
            {
                textview2.text = (num1 * num2).toString()
                mul = false
            }
            if (div)
            {
                textview2.text = (num1 / num2).toString()
                div = false
            }
        })
    }

    fun clearField(view: View)
    {
        textview1.text = null
        textview2.text = null
        Toast.makeText(this,"Cleared",Toast.LENGTH_SHORT).show()
    }

    /*fun gettextview2(view: View)
    {
        temp = textview1.text.toString()

        if (temp.isEmpty())
        {
            Toast.makeText(this,"Expression is empty..",Toast.LENGTH_SHORT).show()
        }

        if (!temp.last().isDigit() && temp.last() != '.')
        {
            Toast.makeText(this,"Invalid Expression..",Toast.LENGTH_SHORT).show()
        }



    }*/

}