package com.banquemisr.coffeeapp_banquemisr.presentation.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.banquemisr.coffeeapp_banquemisr.R
import com.banquemisr.coffeeapp_banquemisr.common.Constants
import com.banquemisr.coffeeapp_banquemisr.databinding.FragmentHomeBinding
import com.banquemisr.coffeeapp_banquemisr.domain.model.Coffee
import com.banquemisr.coffeeapp_banquemisr.presentation.menu.MenuAdapter
import com.banquemisr.coffeeapp_banquemisr.presentation.menu.MenuListener
import com.banquemisr.coffeeapp_banquemisr.presentation.order.OrderActivity


class MainFragment : Fragment(), MenuListener {
    private lateinit var binding: FragmentHomeBinding
    private val coffees: ArrayList<Coffee> = ArrayList()
    private val viewModel: ProductViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        coffees.add(Coffee(name = "Espresso", icon = R.drawable.ic_espresso, unitPrice = 10))
        coffees.add(Coffee(name = "Cappuccino", icon = R.drawable.ic_cappuccino, unitPrice = 15))
        coffees.add(Coffee(name = "Macciato", icon = R.drawable.ic_macciato, unitPrice = 25))
        coffees.add(Coffee(name = "Mocha", icon = R.drawable.ic_mocha, unitPrice = 35))
        coffees.add(Coffee(name = "Latte", icon = R.drawable.ic_latte, unitPrice = 40))
        viewModel.getProducts()

        viewModel.productLiveData.observe(viewLifecycleOwner) {
            for (product in it) {
                Log.d("Ahmed", "" + product.productName.toString())
                coffees.add(
                    Coffee(
                        name = product.productName,
                        icon = R.drawable.ic_mocha,
                        unitPrice = product.productPrice
                    )
                )


            }

        }

        val adapter = MenuAdapter(coffees, this, requireContext())
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerView.adapter = adapter




        return binding.root
    }

    override fun onClick(model: Coffee) {
        val intent = Intent(requireContext(), OrderActivity::class.java)
        intent.putExtra(Constants.KEY_MENU_ICON, model.icon)
        intent.putExtra(Constants.KEY_MENU_NAME, model.name)
        intent.putExtra(Constants.KEY_MENU_PRICE, model.unitPrice)
        intent.putExtra(Constants.KEY_IMAGE_URL, model.imageUrl)
        startActivity(intent)
    }

//    private fun getProducts() {
//        val productRepository = ProductRepository()
//        productRepository.getOnlineProducts()
//
//    }


}