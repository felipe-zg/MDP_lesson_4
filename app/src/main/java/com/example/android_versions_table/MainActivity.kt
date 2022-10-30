package com.example.android_versions_table

import android.os.Bundle
import android.util.Log
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add.setOnClickListener { onAddClicked() }
    }

    fun onAddClicked() {
        val version = input_android_version.text.toString()
        val code = input_android_code_name.text.toString()

        if(version == "" || code == "") {
            Toast.makeText(this, "Both inputs are required", Toast.LENGTH_LONG)
            Log.i("INFOTAG", "Both inputs are required")
            return
        }
        Toast.makeText(this, "Success", Toast.LENGTH_LONG)


        val tableRow = TableRow(this)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.layoutParams = layoutParams

        val versionText = TextView(this)
        versionText.text = version
        val codeText = TextView(this)
        codeText.text = code

        tableRow.addView(versionText, 0)
        Log.i("INFOTAG", "Success")
        tableRow.addView(codeText, 1)
        input_version_table.addView(tableRow)

        input_android_version.text.clear()
        input_android_code_name.text.clear()
    }
}