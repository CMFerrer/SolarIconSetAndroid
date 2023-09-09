package com.chiksmedina.solar.outline.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.CartLarge: ImageVector
    get() {
        if (_cartLarge != null) {
            return _cartLarge!!
        }
        _cartLarge = Builder(name = "CartLarge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 9.0002f)
                curveTo(7.25f, 8.586f, 7.5858f, 8.2502f, 8.0f, 8.2502f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 8.2502f, 11.75f, 8.586f, 11.75f, 9.0002f)
                curveTo(11.75f, 9.4144f, 11.4142f, 9.7502f, 11.0f, 9.7502f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 9.7502f, 7.25f, 9.4144f, 7.25f, 9.0002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.2885f, 2.763f)
                curveTo(1.4195f, 2.3701f, 1.8442f, 2.1577f, 2.2372f, 2.2887f)
                lineTo(2.5415f, 2.3902f)
                curveTo(3.1679f, 2.5989f, 3.6972f, 2.7753f, 4.1135f, 2.969f)
                curveTo(4.5559f, 3.1748f, 4.9398f, 3.4299f, 5.2309f, 3.8338f)
                curveTo(5.522f, 4.2376f, 5.6426f, 4.6825f, 5.698f, 5.1673f)
                curveTo(5.7011f, 5.1946f, 5.704f, 5.2222f, 5.7067f, 5.2502f)
                lineTo(16.5108f, 5.2502f)
                curveTo(17.4867f, 5.2502f, 18.3032f, 5.2501f, 18.9276f, 5.3426f)
                curveTo(19.5791f, 5.439f, 20.2073f, 5.6607f, 20.6036f, 6.2616f)
                curveTo(20.9998f, 6.8625f, 20.9561f, 7.5273f, 20.7881f, 8.1641f)
                curveTo(20.6271f, 8.7744f, 20.3055f, 9.5248f, 19.921f, 10.4218f)
                lineTo(19.4542f, 11.5111f)
                curveTo(19.2776f, 11.9232f, 19.1222f, 12.2857f, 18.9608f, 12.5727f)
                curveTo(18.786f, 12.8834f, 18.5726f, 13.1656f, 18.2495f, 13.3786f)
                curveTo(17.9264f, 13.5916f, 17.583f, 13.6766f, 17.2286f, 13.7149f)
                curveTo(16.9012f, 13.7503f, 16.5068f, 13.7502f, 16.0585f, 13.7502f)
                horizontalLineTo(6.1536f)
                curveTo(6.2274f, 13.8842f, 6.3123f, 13.9945f, 6.409f, 14.0912f)
                curveTo(6.6858f, 14.368f, 7.0743f, 14.5484f, 7.8081f, 14.6471f)
                curveTo(8.5635f, 14.7486f, 9.5646f, 14.7502f, 11.0f, 14.7502f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 14.7502f, 19.75f, 15.086f, 19.75f, 15.5002f)
                curveTo(19.75f, 15.9144f, 19.4142f, 16.2502f, 19.0f, 16.2502f)
                horizontalLineTo(10.9451f)
                curveTo(9.5775f, 16.2502f, 8.4752f, 16.2502f, 7.6082f, 16.1337f)
                curveTo(6.7081f, 16.0127f, 5.9503f, 15.7538f, 5.3483f, 15.1519f)
                curveTo(4.7464f, 14.5499f, 4.4875f, 13.7921f, 4.3665f, 12.892f)
                curveTo(4.2499f, 12.025f, 4.25f, 10.9227f, 4.25f, 9.5551f)
                lineTo(4.25f, 6.8832f)
                curveTo(4.25f, 6.1702f, 4.2489f, 5.6985f, 4.2076f, 5.3375f)
                curveTo(4.1686f, 4.9956f, 4.1005f, 4.8307f, 4.014f, 4.7108f)
                curveTo(3.9276f, 4.5909f, 3.7927f, 4.4741f, 3.4808f, 4.329f)
                curveTo(3.1513f, 4.1757f, 2.7041f, 4.0255f, 2.0277f, 3.8f)
                lineTo(1.7628f, 3.7117f)
                curveTo(1.3699f, 3.5807f, 1.1575f, 3.156f, 1.2885f, 2.763f)
                close()
                moveTo(5.8067f, 12.2502f)
                horizontalLineTo(16.0218f)
                curveTo(16.5177f, 12.2502f, 16.8303f, 12.2492f, 17.0676f, 12.2236f)
                curveTo(17.2868f, 12.1999f, 17.3711f, 12.161f, 17.4238f, 12.1263f)
                curveTo(17.4764f, 12.0916f, 17.5453f, 12.0294f, 17.6534f, 11.8373f)
                curveTo(17.7705f, 11.6292f, 17.8945f, 11.3423f, 18.0899f, 10.8865f)
                lineTo(18.5184f, 9.8865f)
                curveTo(18.933f, 8.9193f, 19.2084f, 8.2715f, 19.3377f, 7.7814f)
                curveTo(19.4633f, 7.3052f, 19.3997f, 7.1607f, 19.3513f, 7.0873f)
                curveTo(19.3029f, 7.014f, 19.1952f, 6.8985f, 18.708f, 6.8264f)
                curveTo(18.2066f, 6.7522f, 17.5027f, 6.7502f, 16.4504f, 6.7502f)
                horizontalLineTo(5.75f)
                curveTo(5.75f, 6.7804f, 5.75f, 6.8109f, 5.75f, 6.8416f)
                lineTo(5.75f, 9.5002f)
                curveTo(5.75f, 10.6722f, 5.751f, 11.5546f, 5.8067f, 12.2502f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 21.7502f)
                curveTo(6.2573f, 21.7502f, 5.25f, 20.7428f, 5.25f, 19.5002f)
                curveTo(5.25f, 18.2576f, 6.2573f, 17.2502f, 7.5f, 17.2502f)
                curveTo(8.7426f, 17.2502f, 9.75f, 18.2576f, 9.75f, 19.5002f)
                curveTo(9.75f, 20.7428f, 8.7426f, 21.7502f, 7.5f, 21.7502f)
                close()
                moveTo(6.75f, 19.5002f)
                curveTo(6.75f, 19.9144f, 7.0858f, 20.2502f, 7.5f, 20.2502f)
                curveTo(7.9142f, 20.2502f, 8.25f, 19.9144f, 8.25f, 19.5002f)
                curveTo(8.25f, 19.086f, 7.9142f, 18.7502f, 7.5f, 18.7502f)
                curveTo(7.0858f, 18.7502f, 6.75f, 19.086f, 6.75f, 19.5002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 19.5003f)
                curveTo(14.25f, 20.7429f, 15.2573f, 21.7503f, 16.5f, 21.7503f)
                curveTo(17.7426f, 21.7503f, 18.75f, 20.7429f, 18.75f, 19.5003f)
                curveTo(18.75f, 18.2576f, 17.7426f, 17.2503f, 16.5f, 17.2503f)
                curveTo(15.2573f, 17.2503f, 14.25f, 18.2576f, 14.25f, 19.5003f)
                close()
                moveTo(16.5f, 20.2503f)
                curveTo(16.0858f, 20.2503f, 15.75f, 19.9145f, 15.75f, 19.5003f)
                curveTo(15.75f, 19.0861f, 16.0858f, 18.7503f, 16.5f, 18.7503f)
                curveTo(16.9142f, 18.7503f, 17.25f, 19.0861f, 17.25f, 19.5003f)
                curveTo(17.25f, 19.9145f, 16.9142f, 20.2503f, 16.5f, 20.2503f)
                close()
            }
        }
        .build()
        return _cartLarge!!
    }

private var _cartLarge: ImageVector? = null
