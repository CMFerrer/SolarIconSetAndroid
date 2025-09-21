package dev.chiksmedina.solar.boldduotone.shoppingecommerce

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
import dev.chiksmedina.solar.boldduotone.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.CartLargeMinimalistic: ImageVector
    get() {
        if (_cartLargeMinimalistic != null) {
            return _cartLargeMinimalistic!!
        }
        _cartLargeMinimalistic = Builder(
            name = "CartLargeMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                horizontalLineTo(20.724f)
                curveTo(21.0545f, 7.9827f, 21.2096f, 7.1407f, 20.7762f, 6.5773f)
                curveTo(20.3323f, 6.0002f, 18.8155f, 6.0002f, 17.1305f, 6.0002f)
                horizontalLineTo(6.4923f)
                curveTo(6.4856f, 5.7299f, 6.4729f, 5.484f, 6.4489f, 5.2618f)
                curveTo(6.3952f, 4.7654f, 6.2787f, 4.3127f, 5.9968f, 3.9f)
                curveTo(5.7126f, 3.4842f, 5.3347f, 3.2178f, 4.8941f, 3.0016f)
                curveTo(4.482f, 2.7994f, 3.9584f, 2.6154f, 3.3419f, 2.3986f)
                lineTo(3.0405f, 2.2927f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.1999f, 12.1871f)
                lineTo(20.6997f, 9.7624f)
                lineTo(20.7242f, 9.6397f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 12.5812f, 5.0632f, 13.552f, 5.9296f, 14.4658f)
                curveTo(6.796f, 15.3796f, 8.1905f, 15.3796f, 10.9794f, 15.3796f)
                horizontalLineTo(16.2823f)
                curveTo(17.8433f, 15.3796f, 18.6238f, 15.3796f, 19.1755f, 14.93f)
                curveTo(19.7273f, 14.4804f, 19.8848f, 13.716f, 20.1999f, 12.1871f)
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
        return _cartLargeMinimalistic!!
    }

private var _cartLargeMinimalistic: ImageVector? = null
