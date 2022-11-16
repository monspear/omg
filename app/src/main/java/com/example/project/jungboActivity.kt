package com.example.project

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class jungboActivity : AppCompatActivity() {
    private lateinit var btn_jungbo: Button
    private lateinit var btn_gonghak: Button
    private lateinit var btn_sanhak: Button
    private lateinit var btn_changeui: Button
    private lateinit var btn_jichun: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jungbo)

        btn_jungbo = findViewById(R.id.button_jungbo)
        val jungboFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        btn_jungbo.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(jungboFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_gonghak = findViewById(R.id.button_gonghak)
        val gonghakFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        btn_gonghak.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(gonghakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_sanhak = findViewById(R.id.button_sanhak)
        val sanhakFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        btn_sanhak.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(sanhakFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_changeui = findViewById(R.id.button_changeui)
        val changeuiFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        btn_changeui.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(changeuiFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

        btn_jichun = findViewById(R.id.button_jichun)
        val jichunFloor: Array<String> = arrayOf("1층", "2층", "3층", "4층", "5층", "6층", "7층", "8층")
        btn_jichun.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("층수를 선택하세요")
                .setItems(jichunFloor,
                    DialogInterface.OnClickListener { dialog, which ->
                        // 여기서 인자 'which'는 배열의 position을 나타냅니다.
                        // resultText.text = colorArray[which]
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }

    }
}