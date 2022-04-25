package com.example.homework6recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by viewModels()
    private lateinit var employeesAdapter: EmployeesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        employeesAdapter = EmployeesAdapter(viewModel::deleteEmployee)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = employeesAdapter

        viewModel.employees.observe(this){
            employeesAdapter.reload(it)
        }

        findViewById<FloatingActionButton>(R.id.add_button).setOnClickListener{
            viewModel.addRandomEmployee()
        }
    }
}