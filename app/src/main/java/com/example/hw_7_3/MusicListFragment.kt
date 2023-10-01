package com.example.hw_7_3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_7_3.databinding.FragmentMusicListBinding

class MusicListFragment : Fragment() {
    private lateinit var binding: FragmentMusicListBinding
    private val musicList = arrayListOf(
        MusicModel("1", "Blank Space", "Taylor Swift", "3:22"),
        MusicModel("2", "Watch Me", "Silento", "5:36"),
        MusicModel("3", "Earned It", "The Weekend", "4:51"),
        MusicModel("4", "The Hills", "The Weekend", "3:41"),
        MusicModel("5", "Эталон Красоты", "Bakr", "3:06"),
        MusicModel("6", "Наступил Февраль", "GAFUR", "2:40"),
        MusicModel("7", "Кечки Бишкек", "Mirbek Atabekov", "4:19"),
        MusicModel("8", "Доча", "Jah Khalib", "2:28"),
        MusicModel("9", "Бедный Поэт", "Bakr", "3:06"),
        MusicModel("10", "Uptown Funk", "Bruno Mars", "3:22"),
        MusicModel("11", "Steal The Show", "Lauv", "3:11"),
        MusicModel("12", "Kolybelnaya", "Jah Khalib", "3:04"),
        MusicModel("13", "Happy", "Pharrell Williams", "3:22"),
        MusicModel("14", "Empire-State-Of-Mind", "JAY-Z,Alicia Keys", "4:36"),
        MusicModel("15", "Perfect", "Ed-Sheeran", "4:23"),
        MusicModel("16", "Divo", "Ulukmanapo", "2:45"),
        MusicModel("17", "Dancin", "Aaron Smith", "3:22"),
        MusicModel("18", "Привет", "Bakr", "2:35"),
        MusicModel("19", "One Kiss", "Dua Lipa", "3:44"),
        MusicModel("20", "Waka Waka", "Shakira", "4:16"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val musicAdapter = MusicAdapter(musicList,this::onClick)
        binding.rvMusicList.adapter = musicAdapter
    }

    fun onClick(pos:Int){
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key",pos)
        startActivity(intent)
    }
}