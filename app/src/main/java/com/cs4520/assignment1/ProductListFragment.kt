package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cs4520.assignment1.databinding.ProductListFragmentBinding

class ProductListFragment : Fragment() {

    private var _binding: ProductListFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ProductListFragmentBinding.inflate(inflater, container, false)
        setupRecyclerView()
        return binding.root
    }

    private fun setupRecyclerView() {
        binding.productListView.layoutManager = LinearLayoutManager(context)
        val products = productsDataset.map { item ->
            when (item[1]) {
                "Equipment" -> Product.Equipment(item[0] as String, (item[3] as Number).toDouble())
                "Food" -> Product.Food(item[0] as String, (item[3] as Number).toDouble(), item[2] as String)
                else -> throw IllegalArgumentException("Unknown product type")
            }
        }
        val productAdapter = ProductAdapter(products)
        binding.productListView.adapter = productAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
