package com.example.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.homework4.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ItemAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        recyclerView = binding.recycler
        adapter = ItemAdapter()
        recyclerView.adapter = adapter
        adapter.setList(addList())
    }

    private fun addList(): ArrayList<Item>{
        val list = ArrayList<Item>()
        val item1 = Item("Категории")
        val item2 = Item("Достижения")
        val item3 = Item("Контакты")
        list.add(item1)
        list.add(item2)
        list.add(item3)
        return list
    }
}