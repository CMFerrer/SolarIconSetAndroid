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

public val ShoppingEcommerceGroup.CartCheck: ImageVector
    get() {
        if (_cartCheck != null) {
            return _cartCheck!!
        }
        _cartCheck = Builder(name = "CartCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5433f, 9.5175f)
                curveTo(15.829f, 9.2175f, 15.8174f, 8.7428f, 15.5174f, 8.4571f)
                curveTo(15.2175f, 8.1714f, 14.7428f, 8.183f, 14.4571f, 8.483f)
                lineTo(12.1431f, 10.9127f)
                lineTo(11.5433f, 10.283f)
                curveTo(11.2576f, 9.983f, 10.7829f, 9.9714f, 10.483f, 10.2571f)
                curveTo(10.183f, 10.5428f, 10.1714f, 11.0175f, 10.4571f, 11.3174f)
                lineTo(11.6f, 12.5174f)
                curveTo(11.7415f, 12.6661f, 11.9378f, 12.7502f, 12.1431f, 12.7502f)
                curveTo(12.3483f, 12.7502f, 12.5446f, 12.6661f, 12.6862f, 12.5174f)
                lineTo(15.5433f, 9.5175f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.2927f, 2.7515f)
                curveTo(1.4301f, 2.3607f, 1.8582f, 2.1553f, 2.249f, 2.2927f)
                lineTo(2.5504f, 2.3986f)
                curveTo(3.1669f, 2.6154f, 3.6905f, 2.7994f, 4.1026f, 3.0016f)
                curveTo(4.5432f, 3.2178f, 4.9211f, 3.4842f, 5.2053f, 3.9f)
                curveTo(5.4872f, 4.3127f, 5.6037f, 4.7654f, 5.6574f, 5.2618f)
                curveTo(5.6612f, 5.2973f, 5.6648f, 5.3334f, 5.6681f, 5.3702f)
                lineTo(17.1203f, 5.3702f)
                curveTo(17.9389f, 5.3702f, 18.7735f, 5.3702f, 19.4606f, 5.447f)
                curveTo(19.8103f, 5.4861f, 20.1569f, 5.5484f, 20.4634f, 5.6561f)
                curveTo(20.7639f, 5.7617f, 21.0942f, 5.9346f, 21.3292f, 6.24f)
                curveTo(21.711f, 6.7364f, 21.7777f, 7.3144f, 21.7416f, 7.9006f)
                curveTo(21.7071f, 8.4587f, 21.5686f, 9.1526f, 21.4039f, 9.9775f)
                lineTo(21.3935f, 10.0298f)
                lineTo(21.3925f, 10.0344f)
                lineTo(20.8836f, 12.5036f)
                curveTo(20.7339f, 13.23f, 20.6079f, 13.8413f, 20.4455f, 14.3234f)
                curveTo(20.2731f, 14.8349f, 20.0341f, 15.2844f, 19.6076f, 15.632f)
                curveTo(19.1811f, 15.9796f, 18.6925f, 16.1229f, 18.1568f, 16.1884f)
                curveTo(17.6518f, 16.2502f, 17.0278f, 16.2502f, 16.2862f, 16.2502f)
                lineTo(10.8804f, 16.2502f)
                curveTo(9.5346f, 16.2502f, 8.4448f, 16.2502f, 7.5866f, 16.1285f)
                curveTo(6.6903f, 16.0015f, 5.9375f, 15.7288f, 5.3437f, 15.1024f)
                curveTo(4.7974f, 14.5263f, 4.5053f, 13.9146f, 4.359f, 13.0603f)
                curveTo(4.2219f, 12.2601f, 4.2083f, 11.2127f, 4.2083f, 9.7602f)
                verticalLineTo(7.0386f)
                curveTo(4.2083f, 6.2986f, 4.2073f, 5.8034f, 4.1661f, 5.4232f)
                curveTo(4.1268f, 5.0598f, 4.0571f, 4.8784f, 3.9668f, 4.7463f)
                curveTo(3.8788f, 4.6175f, 3.7451f, 4.497f, 3.4419f, 4.3483f)
                curveTo(3.119f, 4.1898f, 2.6803f, 4.0343f, 2.0127f, 3.7996f)
                lineTo(1.7514f, 3.7078f)
                curveTo(1.3607f, 3.5704f, 1.1553f, 3.1422f, 1.2927f, 2.7515f)
                close()
                moveTo(5.7083f, 6.8702f)
                lineTo(5.7083f, 9.7602f)
                curveTo(5.7083f, 11.2492f, 5.7263f, 12.1581f, 5.8374f, 12.8071f)
                curveTo(5.9393f, 13.402f, 6.112f, 13.7327f, 6.4322f, 14.0704f)
                curveTo(6.7047f, 14.3578f, 7.0823f, 14.542f, 7.7972f, 14.6434f)
                curveTo(8.5378f, 14.7484f, 9.5209f, 14.7502f, 10.9377f, 14.7502f)
                horizontalLineTo(16.2406f)
                curveTo(17.0399f, 14.7502f, 17.5714f, 14.7489f, 17.9746f, 14.6996f)
                curveTo(18.3573f, 14.6527f, 18.5348f, 14.5712f, 18.66f, 14.4692f)
                curveTo(18.7853f, 14.3672f, 18.9009f, 14.2097f, 19.024f, 13.8444f)
                curveTo(19.1537f, 13.4595f, 19.2623f, 12.9391f, 19.4237f, 12.1563f)
                lineTo(19.9225f, 9.7361f)
                lineTo(19.9229f, 9.7339f)
                curveTo(20.1005f, 8.844f, 20.217f, 8.2517f, 20.2444f, 7.8082f)
                curveTo(20.2704f, 7.3867f, 20.2043f, 7.2395f, 20.1429f, 7.1581f)
                curveTo(20.1367f, 7.1528f, 20.0931f, 7.1159f, 19.9661f, 7.0712f)
                curveTo(19.8107f, 7.0166f, 19.5895f, 6.9707f, 19.2939f, 6.9377f)
                curveTo(18.6991f, 6.8712f, 17.9454f, 6.8702f, 17.089f, 6.8702f)
                horizontalLineTo(5.7083f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.2502f, 19.5002f)
                curveTo(5.2502f, 20.7428f, 6.2576f, 21.7502f, 7.5002f, 21.7502f)
                curveTo(8.7429f, 21.7502f, 9.7502f, 20.7428f, 9.7502f, 19.5002f)
                curveTo(9.7502f, 18.2576f, 8.7429f, 17.2502f, 7.5002f, 17.2502f)
                curveTo(6.2576f, 17.2502f, 5.2502f, 18.2576f, 5.2502f, 19.5002f)
                close()
                moveTo(7.5002f, 20.2502f)
                curveTo(7.086f, 20.2502f, 6.7502f, 19.9144f, 6.7502f, 19.5002f)
                curveTo(6.7502f, 19.086f, 7.086f, 18.7502f, 7.5002f, 18.7502f)
                curveTo(7.9144f, 18.7502f, 8.2502f, 19.086f, 8.2502f, 19.5002f)
                curveTo(8.2502f, 19.9144f, 7.9144f, 20.2502f, 7.5002f, 20.2502f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 19.5003f)
                curveTo(14.25f, 20.743f, 15.2574f, 21.7503f, 16.5f, 21.7503f)
                curveTo(17.7426f, 21.7503f, 18.75f, 20.743f, 18.75f, 19.5003f)
                curveTo(18.75f, 18.2577f, 17.7426f, 17.2503f, 16.5f, 17.2503f)
                curveTo(15.2574f, 17.2503f, 14.25f, 18.2577f, 14.25f, 19.5003f)
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
        return _cartCheck!!
    }

private var _cartCheck: ImageVector? = null
