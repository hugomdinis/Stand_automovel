package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> Toast.makeText(applicationContext,"Página Principal", Toast.LENGTH_SHORT).show()
                R.id.carros-> Toast.makeText(applicationContext,"Carros", Toast.LENGTH_SHORT).show()
                R.id.motas -> Toast.makeText(applicationContext,"Motas", Toast.LENGTH_SHORT).show()
                R.id.settings -> Toast.makeText(applicationContext,"Defenições", Toast.LENGTH_SHORT).show()
                R.id.login -> Toast.makeText(applicationContext,"Iniciar Sessão", Toast.LENGTH_SHORT).show()
                R.id.share -> Toast.makeText(applicationContext,"Partilhar", Toast.LENGTH_SHORT).show()
                R.id.rate -> Toast.makeText(applicationContext,"Avalie-nos", Toast.LENGTH_SHORT).show()

            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}