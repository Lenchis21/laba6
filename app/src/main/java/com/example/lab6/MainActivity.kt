package com.example.lab6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.lab6.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {

//Отображаем созданный Fragment
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, MainFragment())
                .commit()
        }
    }

    class MainFragment : Fragment() {
        private var _binding: FragmentMainBinding? = null
        private var binding get() = _binding!!

        override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentMainBinding.inflate(inflater, container, false)
            binding.textView.text = "Hello World!"
            return binding.root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

    }

}
