package com.chiksmedina.solar.bold.shoppingecommerce

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
import com.chiksmedina.solar.bold.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.CartPlus: ImageVector
    get() {
        if (_cartPlus != null) {
            return _cartPlus!!
        }
        _cartPlus = Builder(
            name = "CartPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0405f, 2.2927f)
                curveTo(2.6497f, 2.1553f, 2.2215f, 2.3607f, 2.0842f, 2.7515f)
                curveTo(1.9468f, 3.1422f, 2.1522f, 3.5704f, 2.5429f, 3.7078f)
                lineTo(2.8042f, 3.7996f)
                curveTo(3.4718f, 4.0343f, 3.9105f, 4.1898f, 4.2334f, 4.3483f)
                curveTo(4.5366f, 4.497f, 4.6703f, 4.6175f, 4.7583f, 4.7463f)
                curveTo(4.8486f, 4.8784f, 4.9183f, 5.0598f, 4.9576f, 5.4232f)
                curveTo(4.9988f, 5.8034f, 4.9998f, 6.2986f, 4.9998f, 7.0386f)
                lineTo(4.9998f, 9.6402f)
                curveTo(4.9998f, 12.5818f, 5.063f, 13.5526f, 5.9294f, 14.4664f)
                curveTo(6.7958f, 15.3802f, 8.1903f, 15.3802f, 10.9792f, 15.3802f)
                horizontalLineTo(16.2821f)
                curveTo(17.8431f, 15.3802f, 18.6236f, 15.3802f, 19.1753f, 14.9306f)
                curveTo(19.727f, 14.481f, 19.8846f, 13.7166f, 20.1997f, 12.1877f)
                lineTo(20.6995f, 9.763f)
                curveTo(21.0466f, 8.0239f, 21.2202f, 7.1544f, 20.7762f, 6.5773f)
                curveTo(20.3323f, 6.0002f, 18.8155f, 6.0002f, 17.1305f, 6.0002f)
                horizontalLineTo(6.4923f)
                curveTo(6.4856f, 5.7299f, 6.4729f, 5.484f, 6.4489f, 5.2618f)
                curveTo(6.3952f, 4.7654f, 6.2787f, 4.3127f, 5.9968f, 3.9f)
                curveTo(5.7126f, 3.4842f, 5.3347f, 3.2178f, 4.8941f, 3.0016f)
                curveTo(4.482f, 2.7994f, 3.9584f, 2.6154f, 3.3419f, 2.3986f)
                lineTo(3.0405f, 2.2927f)
                close()
                moveTo(13.0f, 8.2502f)
                curveTo(13.4142f, 8.2502f, 13.75f, 8.586f, 13.75f, 9.0002f)
                verticalLineTo(10.2502f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 10.2502f, 15.75f, 10.586f, 15.75f, 11.0002f)
                curveTo(15.75f, 11.4145f, 15.4142f, 11.7502f, 15.0f, 11.7502f)
                horizontalLineTo(13.75f)
                verticalLineTo(13.0002f)
                curveTo(13.75f, 13.4145f, 13.4142f, 13.7502f, 13.0f, 13.7502f)
                curveTo(12.5858f, 13.7502f, 12.25f, 13.4145f, 12.25f, 13.0002f)
                verticalLineTo(11.7502f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 11.7502f, 10.25f, 11.4145f, 10.25f, 11.0002f)
                curveTo(10.25f, 10.586f, 10.5858f, 10.2502f, 11.0f, 10.2502f)
                horizontalLineTo(12.25f)
                verticalLineTo(9.0002f)
                curveTo(12.25f, 8.586f, 12.5858f, 8.2502f, 13.0f, 8.2502f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5f, 18.0002f)
                curveTo(8.3284f, 18.0002f, 9.0f, 18.6718f, 9.0f, 19.5002f)
                curveTo(9.0f, 20.3287f, 8.3284f, 21.0002f, 7.5f, 21.0002f)
                curveTo(6.6716f, 21.0002f, 6.0f, 20.3287f, 6.0f, 19.5002f)
                curveTo(6.0f, 18.6718f, 6.6716f, 18.0002f, 7.5f, 18.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5f, 18.0003f)
                curveTo(17.3284f, 18.0003f, 18.0f, 18.6719f, 18.0f, 19.5003f)
                curveTo(18.0f, 20.3287f, 17.3284f, 21.0003f, 16.5f, 21.0003f)
                curveTo(15.6716f, 21.0003f, 15.0f, 20.3287f, 15.0f, 19.5003f)
                curveTo(15.0f, 18.6719f, 15.6716f, 18.0003f, 16.5f, 18.0003f)
                close()
            }
        }
            .build()
        return _cartPlus!!
    }

private var _cartPlus: ImageVector? = null
