package com.akirachix.wallets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter (var walletList: List<Wallets>): RecyclerView.Adapter<WalletViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.categories_wallets,parent,false)
        return WalletViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = walletList[position]
        holder.tvSalary.text = wallet.salary
        holder.tvPrice.text = wallet.price
        holder.tvDate.text = wallet.date
    }

    override fun getItemCount(): Int {
        return walletList.size

    }
}

class WalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    var tvPrice = itemView.findViewById<TextView>(R.id.tvPrice)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)

}