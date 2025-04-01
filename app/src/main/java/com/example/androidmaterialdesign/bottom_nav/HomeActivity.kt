package com.example.androidmaterialdesign.bottom_nav

 import android.os.Bundle
 import androidx.appcompat.app.AppCompatActivity
 import androidx.fragment.app.Fragment
  import com.example.androidmaterialdesign.databinding.ActivityBottomNavBinding
 import com.example.androidmaterialdesign.R

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityBottomNavBinding
     var favoriteFragment= FavoriteFragment()
    val notificationFragment= NotificationFragment()
    val homeFragment= HomeFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomNavBinding.inflate(layoutInflater)
         setContentView(binding.root)
        initFragment()
        callback()
        badger()
        selectedItem()

    }

    private fun selectedItem(){
        binding.bottomNavigationView.selectedItemId = R.id.home

    }

    private fun callback() {

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                replaceFragment(homeFragment)
            }
                R.id.favorite -> {
                    replaceFragment(favoriteFragment)
                }

                R.id.notification -> {
                    replaceFragment(notificationFragment)
                    removeBadger()
                }
            }
            true
        }
    }

    private fun initFragment(){
        replaceFragment(homeFragment)
    }

    private fun replaceFragment(fragment:Fragment){
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(binding.fragmentContainer.id,fragment)
        transaction.commit()

    }

    private fun badger(){
        var badge =binding.bottomNavigationView.getOrCreateBadge(R.id.notification)
        badge.isVisible = true
         badge.number = 99

     }
    private fun removeBadger(){
        val badgeDrawable = binding.bottomNavigationView.getBadge(R.id.notification)
        if (badgeDrawable != null) {
            badgeDrawable.isVisible = false
            badgeDrawable.clearNumber()


        }
    }





}