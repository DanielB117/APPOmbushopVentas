package com.example.appgarageventas

import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main4.view.*

class Adapter(val context:Context, val hobbies: List<AuthActivity>) : RecyclerView.Adapter<Adapter.MyViewHolder>(){
      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val view= LayoutInflater.from(context).inflate(R.layout.activity_main4,parent,false)
          return MyViewHolder(view)
      }

      override fun getItemCount(): Int {
          return hobbies.size

      }

      override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          val hobby=hobbies[position]
          holder.setData(hobby,position)
      }
inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    fun setData(hobby:AuthActivity?,pos:Int){
        itemView.descripcionTextVIew.text=hobby!!.title
    }
      }

}