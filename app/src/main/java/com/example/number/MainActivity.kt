package com.example.number

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
         var numbersAdapter=numbersRecyclerViewAdapter(Fibbonicci(100))
        rvNumbers.adapter=numbersAdapter

                }


    }
    fun Fibbonicci(nums:Int):List<BigInteger>{
        var result=MutableList<BigInteger>(nums,{BigInteger.ZERO})
        var num1=BigInteger.ZERO
        var num2=BigInteger.ONE
        result[1]=num1
        result[0]=num2
        for (i:Int in 1..nums) {
            val sum=num1+num2
            num1=num2
            num2=sum

            result [i-1]=num1
        }
        return result

    }
