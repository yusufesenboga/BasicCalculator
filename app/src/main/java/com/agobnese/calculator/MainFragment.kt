package com.agobnese.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.agobnese.calculator.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    private var result = 0;
    private var action = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        setUpNumberPressingLogic()
        processLogic()
        resultComes()
        clearingLogic()
    }

    private fun clearingLogic() {
        binding.clearButton.setOnClickListener {
            action = 0;
            result = 0;
            binding.resultView.text = ""
        }
    }

    private fun resultComes() {
        binding.equal.setOnClickListener {
        when(action){
            1 -> binding.resultView.text = (Integer.parseInt(binding.resultView.toString()) + result).toString()
            2 -> binding.resultView.text = (Integer.parseInt(binding.resultView.toString()) - result).toString()
            3 -> binding.resultView.text = (Integer.parseInt(binding.resultView.toString()) * result).toString()
            4 -> binding.resultView.text = (Integer.parseInt(binding.resultView.toString()) / result).toString()
        }
        }
    }


    private fun processLogic() {
        binding.addition.setOnClickListener {
            result = Integer.parseInt(binding.resultView.toString())
            binding.resultView.text = ""
            action = 1
        }
        binding.subtraction.setOnClickListener {
            result = Integer.parseInt(binding.resultView.toString())
            binding.resultView.text = ""
            action = 2
        }
        binding.multiply.setOnClickListener {
            result = Integer.parseInt(binding.resultView.toString())
            binding.resultView.text = ""
            action = 3
        }
        binding.division.setOnClickListener {
            result = Integer.parseInt(binding.resultView.toString())
            binding.resultView.text = ""
            action = 4
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    private fun setUpNumberPressingLogic() {
        binding.number0.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "0"
        }
        binding.number1.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "1"
        }
        binding.number2.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "2"
        }
        binding.number3.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "3"
        }
        binding.number4.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "4"
        }
        binding.number5.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "5"
        }
        binding.number6.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "6"
        }
        binding.number7.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "7"
        }
        binding.number8.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "8"
        }
        binding.number9.setOnClickListener {
            binding.resultView.text = binding.resultView.text.toString() + "9"
        }
    }

}