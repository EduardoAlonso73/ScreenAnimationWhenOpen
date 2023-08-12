package com.example.openscreenanimation.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.openscreenanimation.adapter.IOnClinkListenern
import com.example.openscreenanimation.adapter.ItemAnimAdapter
import com.example.openscreenanimation.data.Animations
import com.example.openscreenanimation.databinding.ActivityMainBinding
import com.example.openscreenanimation.model.AnimItem
import com.example.openscreenanimation.utils.extension.*

class MainActivity : AppCompatActivity(),IOnClinkListenern {
    private lateinit var mAdapterAnims:ItemAnimAdapter
    private val mGridLayout by lazy { GridLayoutManager(this,2) }
    private  lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        mAdapterAnims= ItemAnimAdapter(this,Animations.animations.toMutableList())
        mBinding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager=mGridLayout
            adapter=mAdapterAnims
        }

    }

    override fun onClickItem(anims: AnimItem) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(Constants.COLOR,anims.color)
        intent.putExtra(Constants.NAME,anims.name)
        Log.i("MainActivity","Color share: ${anims.color}")
        startActivity(intent)
        choiceAnimation(anims.typeAnims)
    }

    private fun choiceAnimation(typeAnim: TypeAnim) {
        when(typeAnim){
            TypeAnim.ANIMATE_ZOOM-> animateZoom()
            TypeAnim.ANIMATE_FADE-> animateFade()
            TypeAnim.ANIMATE_WINDMILL-> animateWindmill()
            TypeAnim.ANIMATE_SPIN->animateSpin()
            TypeAnim.ANIMATE_DIAGONAL->animateDiagonal()
            TypeAnim.ANIMATE_SPLIT->animateSplit()
            TypeAnim.ANIMATE_SHRINK->animateShrink()
            TypeAnim.ANIMATE_CARD->animateCard()
            TypeAnim.ANIMATE_IN_AND_OUT->animateInAndOut()
            TypeAnim.ANIMATE_SWIPE_RIGHT->animateSwipeRight()
            TypeAnim.ANIMATE_SWIPE_LEFT->animateSwipeLeft()
            TypeAnim.ANIMATE_SLIDE_LEFT->animateSlideLeft()
            TypeAnim.ANIMATE_SLIDE_RIGHT->animateSlideRight()
            TypeAnim.ANIMATE_SLIDE_DOWN->animateSlideDown()
            TypeAnim.ANIMATE_SLIDE_UP-> animateSlideUp()
        }
    }
}