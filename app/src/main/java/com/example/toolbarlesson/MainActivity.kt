package com.example.toolbarlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Admin"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {

            android.R.id.home -> finish()
            R.id.sync1 -> {
                Toast.makeText(this, "Sync", Toast.LENGTH_SHORT).show()
            }
            R.id.save -> {
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }
            R.id.exit -> {
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}