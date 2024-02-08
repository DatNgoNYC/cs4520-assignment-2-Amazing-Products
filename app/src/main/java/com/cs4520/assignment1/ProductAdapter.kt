package com.cs4520.assignment1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private var productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int = productList.size

    fun updateProductList(newProductList: List<Product>) {
        productList = newProductList
        notifyDataSetChanged() // Consider using DiffUtil for better performance
    }

    class ProductViewHolder(private val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        private val context = binding.root.context

        fun bind(product: Product) {
            with(binding) {
                productBackground.setBackgroundColor(ContextCompat.getColor(context, if (product.type == Type.EQUIPMENT) R.color.light_red else R.color.light_yellow))
                productName.text = product.name
                productPrice.text = context.getString(R.string.product_price, product.price)
                productImage.setImageResource(if (product.type == Type.EQUIPMENT) R.drawable.equipment else R.drawable.food)

                if (product is Food && product.expiryDate != null) {
                    productExpiryDate.visibility = View.VISIBLE
                    productExpiryDate.text = context.getString(R.string.expiry_date, product.expiryDate)
                } else {
                    productExpiryDate.visibility = View.GONE
                }
            }
        }
    }
}
