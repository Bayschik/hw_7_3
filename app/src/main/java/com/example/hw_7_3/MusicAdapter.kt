package com.example.hw_7_3

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw_7_3.databinding.ItemMusicBinding

class MusicAdapter(
    var musicList: ArrayList<MusicModel>,
    var onClick: (position:Int) -> Unit) : Adapter<MusicAdapter.MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicList[position])
        holder.itemView.setOnClickListener{
            val musicName = musicList[position].musicaName
            val intent = Intent(holder.itemView.context, SecondActivity::class.java)
            intent.putExtra("key",musicName)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class MusicViewHolder(private var binding: ItemMusicBinding):ViewHolder(binding.root){
        fun bind(item: MusicModel){
            binding.musicOwner.text = item.musicOwner
            binding.musicNumber.text = item.number
            binding.musicName.text = item.musicaName
            binding.musicLength.text = item.musicLength
        }
    }
}