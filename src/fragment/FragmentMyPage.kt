package com.sejigner.glee.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import com.sejigner.glee.*
import kotlinx.android.synthetic.main.fragment_my_page.*

class FragmentMyPage : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
            : View? {
        return inflater.inflate(R.layout.fragment_my_page, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iv_menu.setOnClickListener {
            val pop = PopupMenu(requireActivity(), it)

            pop.menuInflater.inflate(R.menu.my_page_popup_menu, pop.menu)
            pop.show()
            pop.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.item_license ->  {
                        val intent = Intent(requireActivity(),LicenseActivity::class.java)
                        startActivity(intent)
                    }


                    R.id.item_open_source -> {
                        val intent = Intent(requireActivity(), OssLicensesMenuActivity::class.java)
                        startActivity(intent)
                    }

                }
                false
            }
            pop.show()
        }
        Glide.with(requireActivity()).load(R.drawable.logo_oksu).fitCenter().into(iv_logo_oksu)
        Glide.with(requireActivity()).load(R.drawable.cover_my_page).centerCrop().into(iv_background_paper)
        Glide.with(requireActivity()).load(R.drawable.profile_jimin).circleCrop().into(iv_user_jimin)
        Glide.with(requireActivity()).load(R.drawable.profile_sejin).circleCrop().into(iv_user_sejin)
        Glide.with(requireActivity()).load(R.drawable.qr).into(iv_qr_tumblbug)

    }
}