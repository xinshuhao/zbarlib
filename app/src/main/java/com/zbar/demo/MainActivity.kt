package com.zbar.demo

import android.graphics.Bitmap

class MainActivity : com.zbar.zbarlib.CaptureActivity() {
    override fun onAlbumDecode(resultString: String?, status: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onHandleDecode(resultString: String?, barcode: Bitmap?, scaleFactor: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
