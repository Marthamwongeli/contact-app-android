package com.akirachix.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        displayContacts()


    }
    fun displayContacts(){
        val contact1= Contact("Anna","011523456","annie@gmail.com","")
        val contact2= Contact("Anna","011523456","annie@gmail.com","")
        val contact3= Contact("Anna","011523456","annie@gmail.com","")
        val contact4= Contact("Anna","011523456","annie@gmail.com","")
        val contact5= Contact("Anna","011523456","annie@gmail.com","")
        val contact6= Contact("Anna","011523456","annie@gmail.com","")
        val contact7= Contact("Anna","011523456","annie@gmail.com","")
        val contact8= Contact("Anna","011523456","annie@gmail.com","")
        val contact9= Contact("Anna","011523456","annie@gmail.com","")
        val contact10= Contact("Anna","011523456","annie@gmail.com","")
        val contact11= Contact("Anna","011523456","annie@gmail.com","")
        val contact12= Contact("Anna","011523456","annie@gmail.com","")
        val contact13= Contact("Anna","011523456","annie@gmail.com","")
        val contact14= Contact("Anna","011523456","annie@gmail.com","")


        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14)
        val contactsAdapter =ContactsAdapter(contactList)
        binding.rvContacts.adapter =contactsAdapter
    }
}