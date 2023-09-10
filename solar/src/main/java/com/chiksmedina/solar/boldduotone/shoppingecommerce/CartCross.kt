package com.chiksmedina.solar.boldduotone.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.CartCross: ImageVector
    get() {
        if (_cartCross != null) {
            return _cartCross!!
        }
        _cartCross = Builder(
            name = "CartCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0837f, 2.7515f)
                curveTo(2.2211f, 2.3607f, 2.6492f, 2.1553f, 3.04f, 2.2927f)
                lineTo(3.3414f, 2.3986f)
                curveTo(3.9579f, 2.6154f, 4.4815f, 2.7994f, 4.8936f, 3.0016f)
                curveTo(5.3343f, 3.2178f, 5.7121f, 3.4842f, 5.9963f, 3.9f)
                curveTo(6.2783f, 4.3127f, 6.3947f, 4.7654f, 6.4484f, 5.2618f)
                curveTo(6.4725f, 5.484f, 6.4851f, 5.7299f, 6.4918f, 6.0002f)
                horizontalLineTo(17.1301f)
                curveTo(18.815f, 6.0002f, 20.3318f, 6.0002f, 20.7757f, 6.5773f)
                curveTo(21.2197f, 7.1544f, 21.0461f, 8.0239f, 20.699f, 9.763f)
                lineTo(20.1992f, 12.1877f)
                curveTo(19.8841f, 13.7166f, 19.7266f, 14.481f, 19.1748f, 14.9306f)
                curveTo(18.6231f, 15.3802f, 17.8426f, 15.3802f, 16.2816f, 15.3802f)
                horizontalLineTo(10.9787f)
                curveTo(8.1898f, 15.3802f, 6.7953f, 15.3802f, 5.9289f, 14.4664f)
                curveTo(5.0625f, 13.5526f, 4.9993f, 12.5818f, 4.9993f, 9.6402f)
                lineTo(4.9993f, 7.0386f)
                curveTo(4.9993f, 6.2986f, 4.9983f, 5.8034f, 4.9571f, 5.4232f)
                curveTo(4.9178f, 5.0598f, 4.8481f, 4.8784f, 4.7578f, 4.7463f)
                curveTo(4.6698f, 4.6175f, 4.5361f, 4.497f, 4.2329f, 4.3483f)
                curveTo(3.91f, 4.1898f, 3.4713f, 4.0343f, 2.8037f, 3.7996f)
                lineTo(2.5425f, 3.7078f)
                curveTo(2.1517f, 3.5704f, 1.9463f, 3.1422f, 2.0837f, 2.7515f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0303f, 8.9697f)
                curveTo(11.7374f, 8.6768f, 11.2626f, 8.6768f, 10.9697f, 8.9697f)
                curveTo(10.6768f, 9.2626f, 10.6768f, 9.7374f, 10.9697f, 10.0303f)
                lineTo(11.9393f, 11.0f)
                lineTo(10.9697f, 11.9697f)
                curveTo(10.6768f, 12.2626f, 10.6768f, 12.7374f, 10.9697f, 13.0303f)
                curveTo(11.2626f, 13.3232f, 11.7374f, 13.3232f, 12.0303f, 13.0303f)
                lineTo(13.0f, 12.0607f)
                lineTo(13.9697f, 13.0303f)
                curveTo(14.2626f, 13.3232f, 14.7374f, 13.3232f, 15.0303f, 13.0303f)
                curveTo(15.3232f, 12.7374f, 15.3232f, 12.2626f, 15.0303f, 11.9697f)
                lineTo(14.0607f, 11.0f)
                lineTo(15.0303f, 10.0303f)
                curveTo(15.3232f, 9.7374f, 15.3232f, 9.2626f, 15.0303f, 8.9697f)
                curveTo(14.7374f, 8.6768f, 14.2626f, 8.6768f, 13.9697f, 8.9697f)
                lineTo(13.0f, 9.9393f)
                lineTo(12.0303f, 8.9697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5f, 18.0f)
                curveTo(8.3284f, 18.0f, 9.0f, 18.6716f, 9.0f, 19.5f)
                curveTo(9.0f, 20.3284f, 8.3284f, 21.0f, 7.5f, 21.0f)
                curveTo(6.6716f, 21.0f, 6.0f, 20.3284f, 6.0f, 19.5f)
                curveTo(6.0f, 18.6716f, 6.6716f, 18.0f, 7.5f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5f, 18.0001f)
                curveTo(17.3284f, 18.0001f, 18.0f, 18.6716f, 18.0f, 19.5001f)
                curveTo(18.0f, 20.3285f, 17.3284f, 21.0001f, 16.5f, 21.0001f)
                curveTo(15.6716f, 21.0001f, 15.0f, 20.3285f, 15.0f, 19.5001f)
                curveTo(15.0f, 18.6716f, 15.6716f, 18.0001f, 16.5f, 18.0001f)
                close()
            }
        }
            .build()
        return _cartCross!!
    }

private var _cartCross: ImageVector? = null
