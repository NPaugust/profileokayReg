package com.dacha.okai.presentation.ui.fragment.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dacha.okai.R
import com.dacha.okai.presentation.ui.adapters.ViewPagerAdapter


class ProfileFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            //    setUpTabs()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
/*    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(MyAccount(), "Мой аккаунт")
        adapter.addFragment(PurchaseHistory(), "История")
        adapter.addFragment(Settings(), "Настройки")
        adapter.addFragment(AboutUs(), "О нас")
        adapter.addFragment(Help(),"Помощь")
        adapter.addFragment(Contacts(), "Контакты")
        adapter.addFragment(AboutApp(),"О приложении")

        viewPager
        tabs.setUpWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setText(R.drawable.ic_baseline_receipt_24)
        tabs.getTabAt(0)!!.setText(R.drawable.ic_baseline_receipt_24)
        tabs.getTabAt(0)!!.setText(R.drawable.ic_baseline_receipt_24)
    }
}*/

    }
}