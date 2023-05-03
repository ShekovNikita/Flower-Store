package com.sheniv.flowers.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sheniv.flowers.databinding.FragmentDevelopmentBinding
import com.sheniv.flowers.fragments.BaseFragment

class DevelopmentFragment : BaseFragment<FragmentDevelopmentBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentDevelopmentBinding.inflate(inflater, container, false)

    override fun FragmentDevelopmentBinding.onBindView(savedInstanceState: Bundle?) {

        btnBack.setOnClickListener { navController.popBackStack() }

        developEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("shekovnikita8@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Cooperation. Order App")
            }
            startActivity(intent)
        }

        developInsta.setOnClickListener {
            val instagram_url = "https://www.instagram.com/nikitashekov/"
            val instagram = Intent(Intent.ACTION_VIEW, Uri.parse(instagram_url))
            startActivity(instagram)
        }

        developTelega.setOnClickListener {
            val userid = "nikitashekov"
            val tgintent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://t.me/$userid"));
            tgintent.setPackage("org.telegram.messenger");
            startActivity(tgintent);
        }

        designEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("noviktatsiana8@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Cooperation. Order design")
            }
            startActivity(intent)
        }

        designInsta.setOnClickListener {
            val instagram_url = "https://instagram.com/novik.tatiana?igshid=YmMyMTA2M2Y="
            val instagram = Intent(Intent.ACTION_VIEW, Uri.parse(instagram_url))
            startActivity(instagram)
        }

        designTelega.setOnClickListener {
            val userid = "lemur8"
            val tgintent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://t.me/$userid"));
            tgintent.setPackage("org.telegram.messenger");
            startActivity(tgintent);
        }

        btnOrderApp.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("noviktatsiana8@gmail.com", "shekovnikita8@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Cooperation. Order design and app")
            }
            startActivity(intent)
        }

        switch1.setOnClickListener {
            if (switch1.isChecked) {
                appDeveloper.text = "Разработчик"
                designer.text = "Дизайнер UX/UI"
                infoAbout.text = "Дизайн, верстка и разработка приложений индивидуально для вашего бизнеса"
                contactUs.text ="Наши контакты"
                btnOrderApp.text = "Заказать приложение"
            } else {
                appDeveloper.text = "Developer App"
                designer.text = "Designer UX/UI"
                infoAbout.text = "Design, layout and development of applications individually for your business"
                contactUs.text ="Contact us"
                btnOrderApp.text = "Order an App"
            }
        }
    }

}