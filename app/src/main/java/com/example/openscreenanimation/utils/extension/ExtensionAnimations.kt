package com.example.openscreenanimation.utils.extension

import android.app.Activity
import android.content.Context
import com.example.openscreenanimation.R


fun Context.animateFade() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_fade_enter,
        R.anim.animate_fade_exit
    )
}

fun Context.animateWindmill() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_windmill_enter,
        R.anim.animate_windmill_exit
    )
}

fun Context.animateSpin() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_spin_enter,
        R.anim.animate_spin_exit
    )
}

fun Context.animateShrink() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_shrink_enter,
        R.anim.animate_shrink_exit
    )
}

fun Context.animateDiagonal() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_diagonal_right_enter,
        R.anim.animate_diagonal_right_exit
    )
}

fun Context.animateSplit() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_split_enter,
        R.anim.animate_split_exit
    )
}

fun Context.animateZoom() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_zoom_enter,
        R.anim.animate_zoom_exit
    )
}


fun Context.animateInAndOut() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_in_out_enter,
        R.anim.animate_in_out_exit
    )
}


fun Context.animateSwipeLeft() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_swipe_left_enter,
        R.anim.animate_swipe_left_exit
    )
}

fun Context.animateSwipeRight() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_swipe_right_enter,
        R.anim.animate_swipe_right_exit
    )
}

fun Context.animateSlideLeft() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_slide_left_enter,
        R.anim.animate_slide_left_exit
    )
}

fun Context.animateCard() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_card_enter,
        R.anim.animate_card_exit
    )
}


fun Context.animateSlideRight() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_slide_in_left,
        R.anim.animate_slide_out_right
    )
}

fun Context.animateSlideDown() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_slide_down_enter,
        R.anim.animate_slide_down_exit
    )
}

fun Context.animateSlideUp() {
    (this as Activity).overridePendingTransition(
        R.anim.animate_slide_up_enter,
        R.anim.animate_slide_up_exit
    )
}
