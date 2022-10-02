package com.example.videocallingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import io.agora.agorauikit_android.AgoraConnectionData
import io.agora.agorauikit_android.AgoraVideoViewer
import io.agora.rtc2.Constants

class MainActivity : AppCompatActivity() {

//    val agView = AgoraVideoViewer(
//        this, AgoraConnectionData("a3042791b6fb43aa9f4929d18c9eddaa")
//    )
    val agView: AgoraVideoViewer? = null
    val appId : String = "a3042791b6fb43aa9f4929d18c9eddaa"
    val token :String= "007eJxTYBB5+PeEz6ptZkd8mVk3cs/aN/vYxNR/KUqp/UrXsj2L/RUUGBKNDUyMzC0Nk8zSkkyMExMt00wsjSxTDC2SLVNTUhITIx0sk29OtEqeb8HIysgAgSA+K4NbZlFxCQMDAGjBILs="



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val agView = AgoraVideoViewer(this,AgoraConnectionData(appId,token) )
        this.addContentView(agView , FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT))
        agView!!.join("first" , role = Constants.CLIENT_ROLE_BROADCASTER)


    }


}