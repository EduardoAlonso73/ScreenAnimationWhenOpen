package com.example.openscreenanimation.data

import com.example.openscreenanimation.R
import com.example.openscreenanimation.model.AnimItem
import com.example.openscreenanimation.utils.extension.TypeAnim

object Animations {
    val animations: List<AnimItem> = listOf(
        AnimItem(TypeAnim.ANIMATE_ZOOM, "Animate Zoom", R.color.blue_500),
        AnimItem(TypeAnim.ANIMATE_FADE, "Animate Fade",R.color.purple_600),
        AnimItem(TypeAnim.ANIMATE_WINDMILL, "Animate Windmill",R.color.orange_500),
        AnimItem(TypeAnim.ANIMATE_SPIN, "Animate Spin",R.color.green_600),
        AnimItem(TypeAnim.ANIMATE_DIAGONAL, "Animate Diagonal",R.color.orange_200),
        AnimItem(TypeAnim.ANIMATE_SPLIT, "Animate Split",R.color.pink_400),
        AnimItem(TypeAnim.ANIMATE_SHRINK, "Animate Shrink",R.color.gray_200),
        AnimItem(TypeAnim.ANIMATE_CARD, "Animate Card",R.color.green_700),
        AnimItem(TypeAnim.ANIMATE_IN_AND_OUT, "Animate In AndOut",R.color.pink_500),
        AnimItem(TypeAnim.ANIMATE_SWIPE_RIGHT, "Animate SwipeRight",R.color.blue_700),
        AnimItem(TypeAnim.ANIMATE_SWIPE_LEFT, "Animate SwipeLeft",R.color.green_500),
        AnimItem(TypeAnim.ANIMATE_SLIDE_LEFT, "Animate Slide Left",R.color.purple_200),
        AnimItem(TypeAnim.ANIMATE_SLIDE_RIGHT, "Animate Slide Right",R.color.gray_900),
        AnimItem(TypeAnim.ANIMATE_SLIDE_DOWN, "Animate Slide Down",R.color.orange_400),
        AnimItem(TypeAnim.ANIMATE_SLIDE_UP, "Animate Slide Up",R.color.purple_900)
    )

}