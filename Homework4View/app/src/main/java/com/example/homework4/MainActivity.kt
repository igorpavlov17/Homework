package com.example.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.homework4.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ItemAdapter
    lateinit var recyclerView: RecyclerView
    private var description = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        recyclerView = binding.recycler
        adapter = ItemAdapter(object: MyOnClickListener{
            override fun onClick(s: Item) {

            }
        })
        recyclerView.adapter = adapter
        adapter.setList(addList())
    }

    private fun addList(): ArrayList<Item>{
        val list = ArrayList<Item>()
        val item1 = Item("Категории", "Категория 1\nКатегория 2\nКатегория 3\nКатегория 4\nКатегория 5")
        val item2 = Item("Достижения", "Лучшая программа 2019\nВторое место конкурса 2020\nРаботник месяца апрель 2021")
        val item3 = Item("Контакты", "ВКонтакте - igor_pavlov1999\nTelegram - igorpavlov99\nDiscord - ArgentuM#1456")
        list.add(item1)
        list.add(item2)
        list.add(item3)
        return list
    }
}