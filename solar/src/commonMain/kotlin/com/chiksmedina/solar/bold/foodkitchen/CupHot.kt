package com.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.CupHot: ImageVector
    get() {
        if (_cupHot != null) {
            return _cupHot!!
        }
        _cupHot = Builder(
            name = "CupHot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.2844f, 11.2661f)
                curveTo(3.1511f, 9.2669f, 3.0845f, 8.2673f, 3.6773f, 7.6336f)
                curveTo(4.2701f, 7.0f, 5.2719f, 7.0f, 7.2755f, 7.0f)
                horizontalLineTo(12.7245f)
                curveTo(14.7281f, 7.0f, 15.7299f, 7.0f, 16.3227f, 7.6336f)
                curveTo(16.4852f, 7.8073f, 16.5981f, 8.0084f, 16.6737f, 8.25f)
                horizontalLineTo(17.0f)
                curveTo(19.5261f, 8.25f, 21.75f, 10.0619f, 21.75f, 12.5f)
                curveTo(21.75f, 14.9381f, 19.5261f, 16.75f, 17.0f, 16.75f)
                horizontalLineTo(16.3499f)
                curveTo(16.3383f, 16.9226f, 16.3269f, 17.0891f, 16.3155f, 17.25f)
                horizontalLineTo(3.6845f)
                curveTo(3.6655f, 16.9826f, 3.6466f, 16.6993f, 3.6266f, 16.3991f)
                lineTo(3.2844f, 11.2661f)
                close()
                moveTo(16.45f, 15.25f)
                horizontalLineTo(17.0f)
                curveTo(18.8921f, 15.25f, 20.25f, 13.9278f, 20.25f, 12.5f)
                curveTo(20.25f, 11.0722f, 18.8921f, 9.75f, 17.0f, 9.75f)
                horizontalLineTo(16.8007f)
                curveTo(16.788f, 10.1801f, 16.7547f, 10.6802f, 16.7156f, 11.2661f)
                lineTo(16.45f, 15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.819f, 18.75f)
                horizontalLineTo(16.181f)
                curveTo(16.0372f, 19.9266f, 15.8026f, 20.6671f, 15.2429f, 21.1907f)
                curveTo(14.3779f, 22.0f, 13.0475f, 22.0f, 10.3867f, 22.0f)
                horizontalLineTo(9.6133f)
                curveTo(6.9525f, 22.0f, 5.6221f, 22.0f, 4.7571f, 21.1907f)
                curveTo(4.1975f, 20.6671f, 3.9629f, 19.9266f, 3.819f, 18.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.9773f, 1.327f)
                curveTo(7.3145f, 1.5675f, 7.3929f, 2.0359f, 7.1524f, 2.3731f)
                lineTo(6.7663f, 2.9143f)
                curveTo(7.3921f, 3.3886f, 7.5308f, 4.2779f, 7.0719f, 4.9213f)
                lineTo(6.6613f, 5.497f)
                curveTo(6.4207f, 5.8342f, 5.9524f, 5.9126f, 5.6151f, 5.672f)
                curveTo(5.2779f, 5.4315f, 5.1995f, 4.9632f, 5.4401f, 4.6259f)
                lineTo(5.8261f, 4.0847f)
                curveTo(5.2003f, 3.6104f, 5.0616f, 2.7212f, 5.5206f, 2.0777f)
                lineTo(5.9312f, 1.502f)
                curveTo(6.1718f, 1.1648f, 6.6401f, 1.0864f, 6.9773f, 1.327f)
                close()
                moveTo(10.9773f, 1.327f)
                curveTo(11.3146f, 1.5675f, 11.3929f, 2.0359f, 11.1524f, 2.3731f)
                lineTo(10.7663f, 2.9143f)
                curveTo(11.3921f, 3.3886f, 11.5309f, 4.2779f, 11.0719f, 4.9213f)
                lineTo(10.6613f, 5.497f)
                curveTo(10.4207f, 5.8342f, 9.9523f, 5.9126f, 9.6151f, 5.672f)
                curveTo(9.2779f, 5.4315f, 9.1995f, 4.9632f, 9.4401f, 4.6259f)
                lineTo(9.8261f, 4.0847f)
                curveTo(9.2003f, 3.6104f, 9.0616f, 2.7212f, 9.5206f, 2.0777f)
                lineTo(9.9312f, 1.502f)
                curveTo(10.1718f, 1.1648f, 10.6401f, 1.0864f, 10.9773f, 1.327f)
                close()
                moveTo(14.9773f, 1.327f)
                curveTo(15.3146f, 1.5675f, 15.3929f, 2.0359f, 15.1524f, 2.3731f)
                lineTo(14.7663f, 2.9143f)
                curveTo(15.3921f, 3.3886f, 15.5309f, 4.2779f, 15.0719f, 4.9213f)
                lineTo(14.6613f, 5.497f)
                curveTo(14.4207f, 5.8342f, 13.9524f, 5.9126f, 13.6151f, 5.672f)
                curveTo(13.2779f, 5.4315f, 13.1995f, 4.9632f, 13.4401f, 4.6259f)
                lineTo(13.8261f, 4.0847f)
                curveTo(13.2003f, 3.6104f, 13.0616f, 2.7212f, 13.5206f, 2.0777f)
                lineTo(13.9312f, 1.502f)
                curveTo(14.1718f, 1.1648f, 14.6401f, 1.0864f, 14.9773f, 1.327f)
                close()
            }
        }
            .build()
        return _cupHot!!
    }

private var _cupHot: ImageVector? = null
