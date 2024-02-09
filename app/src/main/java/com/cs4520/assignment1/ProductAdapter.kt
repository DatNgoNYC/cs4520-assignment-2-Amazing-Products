package com.cs4520.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.cs4520.assignment1.databinding.ProductListItemBinding

class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ProductListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int = productList.size

    class ProductViewHolder(private val binding: ProductListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Product) {
            with(binding) {
                productName.text = product.name
                productPrice.text = String.format("$%.2f", product.price)

                val backgroundColor = when (product) {
                    is Product.Food -> R.color.light_yellow
                    is Product.Equipment -> R.color.light_red
                }

                // Directly use the binding object's root, which is the ConstraintLayout
                root.setBackgroundColor(ContextCompat.getColor(root.context, backgroundColor))

                when (product) {
                    is Product.Food -> {
                        productExpiryDate.visibility = View.VISIBLE
                        productExpiryDate.text = "Expires on: ${product.expiryDate}"
                        productImage.setImageResource(R.drawable.food)
                    }
                    is Product.Equipment -> {
                        productExpiryDate.visibility = View.GONE
                        productImage.setImageResource(R.drawable.equipment)
                    }
                }
            }
        }
    }
}