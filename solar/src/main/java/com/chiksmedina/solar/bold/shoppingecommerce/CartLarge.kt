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

val ShoppingEcommerceGroup.CartLarge: ImageVector
    get() {
        if (_cartLarge != null) {
            return _cartLarge!!
        }
        _cartLarge = Builder(
            name = "CartLarge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.2887f, 2.763f)
                curveTo(1.4197f, 2.3701f, 1.8444f, 2.1577f, 2.2374f, 2.2887f)
                lineTo(2.5418f, 2.3902f)
                curveTo(3.1681f, 2.5989f, 3.6975f, 2.7753f, 4.1137f, 2.969f)
                curveTo(4.5561f, 3.1748f, 4.94f, 3.4299f, 5.2311f, 3.8338f)
                curveTo(5.5222f, 4.2376f, 5.6428f, 4.6825f, 5.6982f, 5.1673f)
                curveTo(5.7264f, 5.4149f, 5.7394f, 5.6925f, 5.7453f, 6.0002f)
                horizontalLineTo(16.4508f)
                curveTo(18.5058f, 6.0002f, 19.5333f, 6.0002f, 19.9779f, 6.6745f)
                curveTo(20.4225f, 7.3487f, 20.0177f, 8.2931f, 19.2082f, 10.182f)
                lineTo(18.7797f, 11.182f)
                curveTo(18.4017f, 12.0638f, 18.2128f, 12.5047f, 17.8371f, 12.7525f)
                curveTo(17.4614f, 13.0002f, 16.9817f, 13.0002f, 16.0222f, 13.0002f)
                horizontalLineTo(5.9034f)
                curveTo(6.0084f, 13.5401f, 6.174f, 13.856f, 6.4092f, 14.0912f)
                curveTo(6.686f, 14.368f, 7.0746f, 14.5484f, 7.8083f, 14.6471f)
                curveTo(8.5637f, 14.7486f, 9.5648f, 14.7502f, 11.0002f, 14.7502f)
                horizontalLineTo(18.0002f)
                curveTo(18.4144f, 14.7502f, 18.7502f, 15.086f, 18.7502f, 15.5002f)
                curveTo(18.7502f, 15.9144f, 18.4144f, 16.2502f, 18.0002f, 16.2502f)
                horizontalLineTo(10.9453f)
                curveTo(9.5777f, 16.2502f, 8.4754f, 16.2502f, 7.6084f, 16.1337f)
                curveTo(6.7083f, 16.0127f, 5.9505f, 15.7538f, 5.3485f, 15.1519f)
                curveTo(4.7466f, 14.5499f, 4.4877f, 13.7921f, 4.3667f, 12.892f)
                curveTo(4.2502f, 12.025f, 4.2502f, 10.9227f, 4.2502f, 9.5551f)
                lineTo(4.2502f, 6.8832f)
                curveTo(4.2502f, 6.1702f, 4.2491f, 5.6985f, 4.2078f, 5.3375f)
                curveTo(4.1688f, 4.9956f, 4.1007f, 4.8307f, 4.0143f, 4.7108f)
                curveTo(3.9278f, 4.5909f, 3.793f, 4.4741f, 3.481f, 4.329f)
                curveTo(3.1516f, 4.1757f, 2.7043f, 4.0255f, 2.0279f, 3.8f)
                lineTo(1.763f, 3.7117f)
                curveTo(1.3701f, 3.5807f, 1.1577f, 3.156f, 1.2887f, 2.763f)
                close()
                moveTo(8.0002f, 8.2502f)
                curveTo(7.586f, 8.2502f, 7.2502f, 8.586f, 7.2502f, 9.0002f)
                curveTo(7.2502f, 9.4144f, 7.586f, 9.7502f, 8.0002f, 9.7502f)
                horizontalLineTo(11.0002f)
                curveTo(11.4144f, 9.7502f, 11.7502f, 9.4144f, 11.7502f, 9.0002f)
                curveTo(11.7502f, 8.586f, 11.4144f, 8.2502f, 11.0002f, 8.2502f)
                horizontalLineTo(8.0002f)
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
        return _cartLarge!!
    }

private var _cartLarge: ImageVector? = null
