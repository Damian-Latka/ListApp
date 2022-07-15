package com.example.listapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

class DetailsFragment : Fragment(R.layout.fragment_details){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(this.context, "DetailsFragment", Toast.LENGTH_SHORT).show()
    }
}