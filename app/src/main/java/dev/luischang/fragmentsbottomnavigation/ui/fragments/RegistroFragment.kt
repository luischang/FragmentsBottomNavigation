package dev.luischang.fragmentsbottomnavigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import dev.luischang.fragmentsbottomnavigation.R

class RegistroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_registro, container, false)

        val spnContry: Spinner = view.findViewById(R.id.spnCountry)
        val etFullName: EditText = view.findViewById(R.id.etFullName)
        val etEmail: EditText = view.findViewById(R.id.etEmail)
        val rgGender: RadioGroup = view.findViewById(R.id.rgGender)
        val chkLicense: CheckBox = view.findViewById(R.id.chkLicense)
        val chkCar: CheckBox = view.findViewById(R.id.chkCar)
        val btnSave: Button = view.findViewById(R.id.btnSave)

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.country_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spnContry.adapter = adapter
        }

        var spnCountryvalue = ""

        spnContry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                spnCountryvalue = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        btnSave.setOnClickListener {
            val fullNameValue = etFullName.text.toString()
            val emailValue = etEmail.text.toString()
            val intSelectedButton = rgGender!!.checkedRadioButtonId
            val rbtSelected: RadioButton = view.findViewById(intSelectedButton)
            val genderValue = rbtSelected.text

            val allValues = "Full Name: $fullNameValue " +
                            "\nEmail: $emailValue \nGender: $genderValue" +
                            "Country: $spnCountryvalue " +
                            "\nLicense: ${chkLicense.isChecked} " +
                            "\nCar: ${chkCar.isChecked}"

            Toast.makeText(requireContext(), allValues, Toast.LENGTH_LONG).show()
        }



        return view
    }
}