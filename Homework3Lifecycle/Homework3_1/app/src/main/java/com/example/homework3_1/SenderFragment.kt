package com.example.homework3_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class SenderFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sender, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.send_message).setOnClickListener{
            val message: String = requireActivity().findViewById<EditText>(R.id.messageToSend).text.toString()
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, ReceiverFragment.newInstance(message)).addToBackStack(null).commit()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = SenderFragment()
    }
}