package com.example.timringtimkwali.ui.cars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.timringtimkwali.R
import com.example.timringtimkwali.adapters.CarsListRVAdapter
import com.example.timringtimkwali.adapters.UsersListRVAdapter
import com.example.timringtimkwali.databinding.FragmentCarsBinding
import com.example.timringtimkwali.model.Car
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CarsFragment : Fragment() {

    private var _binding: FragmentCarsBinding? = null
    private val binding get() = _binding

    private lateinit var adapter: CarsListRVAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCarsBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        adapter = CarsListRVAdapter(carsList)
        val carsListRV = binding?.carsCarsListRv
        carsListRV?.adapter = adapter
        carsListRV?.layoutManager = LinearLayoutManager(this.context)
        carsListRV?.setHasFixedSize(true)
    }

    private val carsList = listOf<Car>(
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
        Car(" Car Model: Tesla g6 \n Year: 2019 \n Colour: Purple \n Country: Japan",),
    )
}