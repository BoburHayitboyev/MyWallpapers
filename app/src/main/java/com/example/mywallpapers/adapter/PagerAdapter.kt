package com.example.mywallpapers.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fragmentManger: FragmentManager) :
    FragmentPagerAdapter(fragmentManger, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val list: ArrayList<Fragment> = ArrayList()
    val titles: ArrayList<String> = ArrayList()

    override fun getCount() = list.size


    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    fun addFragment(fragment: Fragment, title:String){
        list.add(fragment)
        titles.add(title)
        notifyDataSetChanged()
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }

}