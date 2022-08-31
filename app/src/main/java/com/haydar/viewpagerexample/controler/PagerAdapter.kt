package com.haydar.viewpagerexample.controler

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.haydar.viewpagerexample.view.AboutFragment
import com.haydar.viewpagerexample.view.SkillFragment
import com.haydar.viewpagerexample.view.WorkFragment

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
         0 -> return AboutFragment()
         1 -> return SkillFragment()
         2 -> return WorkFragment()
        }
        return AboutFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "HOME"
            1 -> return "SKILL"
            2 -> return "WORK"
        }
        return super.getPageTitle(position)
    }

}