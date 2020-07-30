package com.zhouqingbiao.creditcard

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 银行
        val banks = mapOf(0 to "中国农业银行", 1 to "中国银行", 2 to "中国工商银行", 3 to "中国邮政储蓄银行")

        // 日历
        var calendar: Calendar = Calendar.getInstance()

        var dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

        var bank = findViewById<TextView>(R.id.bank)

        bank.text = banks[dayOfMonth % banks.size]
    }
}