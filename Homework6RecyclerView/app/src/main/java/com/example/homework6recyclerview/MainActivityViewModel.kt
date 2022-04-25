package com.example.homework6recyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){
    val employees = MutableLiveData(Employee.getMockEmployees())

    fun addRandomEmployee(){
        employees.value = ArrayList(employees.value)
        employees.value = employees.value?.toMutableList()?.apply {
            add(Employee.getMockEmployees().random())
        }
    }

    fun deleteEmployee(position: Int){
        employees.value = ArrayList(employees.value)
        employees.value = employees.value?.toMutableList()?.apply {
            removeAt(position)
        }
    }

    fun like(position: Int){
        employees.value = ArrayList(employees.value)
        employees.value = employees.value?.toMutableList()?.apply {
            employees.value!![position].isLike = !employees.value!![position].isLike
        }
    }
}