package com.cs4520.assignment1

sealed class Product(val name: String, val price: Double, val type: Type) {
    class Equipment(name: String, price: Double) : Product(name, price, Type.EQUIPMENT)
    class Food(name: String, price: Double, val expiryDate: String) : Product(name, price, Type.FOOD)

    enum class Type {
        EQUIPMENT, FOOD
    }
}