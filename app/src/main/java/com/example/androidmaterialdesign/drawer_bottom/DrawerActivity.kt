package com.example.androidmaterialdesign.drawer_bottom

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidmaterialdesign.R
import com.example.androidmaterialdesign.databinding.ActivityDrawerBinding

class DrawerActivity : AppCompatActivity() {
    lateinit var binding: ActivityDrawerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDrawerBinding.inflate(layoutInflater)
         setContentView(binding.root)

        openDrawer()

        closeDrawer()


    }


}

private fun DrawerActivity.closeDrawer() {
    binding.navigationView.setNavigationItemSelectedListener { menuItem ->
        // Handle menu item selected

        when(menuItem.itemId){
            R.id.noti ->{
                Toast.makeText(this, "notification clicked", Toast.LENGTH_SHORT).show()
            true
            }
            R.id.hom ->{ Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.fav ->{  Toast.makeText(this, "favorite clicked", Toast.LENGTH_SHORT).show()
                true
            }

        }
        menuItem.isChecked = true
        binding.drawerLayout.close()
        true
    }
}

private fun DrawerActivity.openDrawer() {
    binding.topAppBar.setNavigationOnClickListener {
        binding.drawerLayout.open()
    }
}