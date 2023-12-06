package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MyDialog: DialogFragment() {

   /* override fun onCreateDialog(savedInstanceState: Bundle?) =
        AlertDialog.Builder(requireContext())
            .setMessage("Какой-то текст!")
            .setPositiveButton("Ok") { _,_ -> }
            .setNegativeButton("Cancel") { _,_ -> }
            .create()

    */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View {
        val view = LayoutInflater.from(context).inflate(R.layout.mylayout,container,false)
        view.findViewById<Button>(R.id.button3).setOnClickListener{
            // логика
        }
        return view
    }

    companion object {
        const val TAG = "Dialog"
    }
}