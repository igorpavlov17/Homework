package com.example.homework6recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class EmployeesAdapter(private val deleteAction: (Int) -> Unit) : RecyclerView.Adapter<EmployeesAdapter.EmployeesViewHolder>() {
    private val employees  = mutableListOf<Employee>()

    class EmployeesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val photoImageView: ImageView = itemView.findViewById(R.id.photo)
        val nameTextView: TextView = itemView.findViewById(R.id.name)
        val departmentTextView: TextView = itemView.findViewById(R.id.department)
        val deleteButton: ImageView = itemView.findViewById(R.id.delete_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeesViewHolder {
        return EmployeesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.employees_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: EmployeesViewHolder, position: Int) {
        val employee = employees[position]
        with(holder){
            photoImageView
            nameTextView.text = employee.name
            departmentTextView.text = employee.department
            Glide.with(photoImageView.context).load(employee.photo).centerCrop().into(photoImageView)
            deleteButton.setOnClickListener{
                deleteAction(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun reload(employees: List<Employee>){
        this.employees.clear()
        this.employees.addAll(employees)
        notifyDataSetChanged()
    }
}