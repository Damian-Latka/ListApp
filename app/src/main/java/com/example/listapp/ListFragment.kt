package com.example.listapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

class ListFragment : Fragment(R.layout.fragment_list){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(this.context, "ListFragment", Toast.LENGTH_SHORT).show()
    }
}