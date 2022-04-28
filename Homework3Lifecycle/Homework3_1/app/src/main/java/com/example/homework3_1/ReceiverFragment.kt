package com.example.homework3_1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class ReceiverFragment : Fragment() {
    private lateinit var viewModelData: ViewModelData

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_receiver, container, false)
    }

    @SuppressLint("SetTextI18n", "FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModelData = ViewModelProvider(this).get(ViewModelData::class.java)
        super.onViewCreated(view, savedInstanceState)
        requireActivity().findViewById<TextView>(R.id.received_message).text = arguments?.getString(message)
        viewModelData.textMutableLiveData.observe(this) {
            requireActivity().findViewById<TextView>(R.id.received_message).text = it
        }
        view.findViewById<Button>(R.id.read_message).setOnClickListener {
            requireActivity().findViewById<TextView>(R.id.received_message).text = "All messages is read"
            viewModelData.setText("All messages is read")
        }
    }

    companion object {
        private var message: String = "тут должна быть переданная строка"

        @JvmStatic
        fun newInstance(s: String): Fragment = ReceiverFragment().apply {
            val bundle = Bundle()
            bundle.putString(message, s)
            arguments = bundle
        }
    }
}