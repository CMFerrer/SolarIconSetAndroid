package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.HomeWifi: ImageVector
    get() {
        if (_homeWifi != null) {
            return _homeWifi!!
        }
        _homeWifi = Builder(name = "HomeWifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5502f, 12.1923f)
                curveTo(9.5671f, 8.936f, 14.4329f, 8.936f, 17.4498f, 12.1923f)
                curveTo(17.7313f, 12.4961f, 18.2059f, 12.5142f, 18.5097f, 12.2327f)
                curveTo(18.8136f, 11.9512f, 18.8317f, 11.4767f, 18.5502f, 11.1728f)
                curveTo(14.9396f, 7.2758f, 9.0604f, 7.2758f, 5.4498f, 11.1728f)
                curveTo(5.1683f, 11.4767f, 5.1864f, 11.9512f, 5.4903f, 12.2327f)
                curveTo(5.7941f, 12.5142f, 6.2687f, 12.4961f, 6.5502f, 12.1923f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5502f, 14.3508f)
                curveTo(10.4625f, 12.2867f, 13.5375f, 12.2867f, 15.4499f, 14.3508f)
                curveTo(15.7314f, 14.6546f, 16.2059f, 14.6727f, 16.5097f, 14.3912f)
                curveTo(16.8136f, 14.1097f, 16.8317f, 13.6352f, 16.5502f, 13.3313f)
                curveTo(14.0442f, 10.6265f, 9.9558f, 10.6265f, 7.4499f, 13.3313f)
                curveTo(7.1683f, 13.6352f, 7.1865f, 14.1097f, 7.4903f, 14.3912f)
                curveTo(7.7941f, 14.6727f, 8.2687f, 14.6546f, 8.5502f, 14.3508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5502f, 16.5097f)
                curveTo(11.358f, 15.6379f, 12.6421f, 15.6379f, 13.4499f, 16.5097f)
                curveTo(13.7314f, 16.8136f, 14.2059f, 16.8317f, 14.5098f, 16.5502f)
                curveTo(14.8136f, 16.2687f, 14.8317f, 15.7942f, 14.5502f, 15.4903f)
                curveTo(13.1488f, 13.9777f, 10.8513f, 13.9777f, 9.4499f, 15.4903f)
                curveTo(9.1684f, 15.7942f, 9.1865f, 16.2687f, 9.4903f, 16.5502f)
                curveTo(9.7942f, 16.8317f, 10.2687f, 16.8136f, 10.5502f, 16.5097f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.2502f)
                curveTo(11.2919f, 1.2502f, 10.6485f, 1.4531f, 9.9506f, 1.7925f)
                curveTo(9.2759f, 2.1206f, 8.4964f, 2.6043f, 7.5229f, 3.2086f)
                lineTo(5.4563f, 4.4911f)
                curveTo(4.5351f, 5.0628f, 3.7974f, 5.5206f, 3.2289f, 5.956f)
                curveTo(2.6402f, 6.4069f, 2.1879f, 6.8661f, 1.8613f, 7.4629f)
                curveTo(1.5353f, 8.0584f, 1.3886f, 8.692f, 1.3182f, 9.441f)
                curveTo(1.25f, 10.1668f, 1.25f, 11.0544f, 1.25f, 12.1675f)
                verticalLineTo(13.7801f)
                curveTo(1.25f, 15.684f, 1.25f, 17.1868f, 1.4027f, 18.3619f)
                curveTo(1.5594f, 19.5672f, 1.8886f, 20.5403f, 2.6324f, 21.3097f)
                curveTo(3.3796f, 22.0826f, 4.3305f, 22.4279f, 5.5076f, 22.5916f)
                curveTo(6.6485f, 22.7503f, 8.1056f, 22.7503f, 9.9418f, 22.7502f)
                horizontalLineTo(14.0581f)
                curveTo(15.8944f, 22.7503f, 17.3515f, 22.7503f, 18.4924f, 22.5916f)
                curveTo(19.6695f, 22.4279f, 20.6204f, 22.0826f, 21.3676f, 21.3097f)
                curveTo(22.1114f, 20.5403f, 22.4406f, 19.5672f, 22.5973f, 18.3619f)
                curveTo(22.75f, 17.1868f, 22.75f, 15.684f, 22.75f, 13.7801f)
                verticalLineTo(12.1675f)
                curveTo(22.75f, 11.0544f, 22.75f, 10.1668f, 22.6818f, 9.441f)
                curveTo(22.6114f, 8.692f, 22.4646f, 8.0584f, 22.1387f, 7.4629f)
                curveTo(21.8121f, 6.8661f, 21.3599f, 6.4069f, 20.7711f, 5.956f)
                curveTo(20.2026f, 5.5206f, 19.4649f, 5.0629f, 18.5437f, 4.4912f)
                lineTo(16.4771f, 3.2086f)
                curveTo(15.5036f, 2.6043f, 14.7241f, 2.1206f, 14.0494f, 1.7925f)
                curveTo(13.3515f, 1.4531f, 12.7081f, 1.2502f, 12.0f, 1.2502f)
                close()
                moveTo(8.2795f, 4.5044f)
                curveTo(9.2953f, 3.874f, 10.0095f, 3.4318f, 10.6065f, 3.1414f)
                curveTo(11.1882f, 2.8586f, 11.6002f, 2.7502f, 12.0f, 2.7502f)
                curveTo(12.3998f, 2.7502f, 12.8118f, 2.8586f, 13.3935f, 3.1414f)
                curveTo(13.9905f, 3.4318f, 14.7047f, 3.874f, 15.7205f, 4.5044f)
                lineTo(17.7205f, 5.7456f)
                curveTo(18.6813f, 6.3419f, 19.3559f, 6.7616f, 19.8591f, 7.1469f)
                curveTo(20.3487f, 7.5219f, 20.6303f, 7.8313f, 20.8229f, 8.1831f)
                curveTo(21.0162f, 8.5361f, 21.129f, 8.9489f, 21.1884f, 9.5813f)
                curveTo(21.2492f, 10.2288f, 21.25f, 11.0461f, 21.25f, 12.2042f)
                verticalLineTo(13.7252f)
                curveTo(21.25f, 15.6962f, 21.2485f, 17.1014f, 21.1098f, 18.1685f)
                curveTo(20.9736f, 19.2166f, 20.717f, 19.8246f, 20.2892f, 20.2671f)
                curveTo(19.8649f, 20.706f, 19.2871f, 20.9667f, 18.2858f, 21.1059f)
                curveTo(17.2602f, 21.2485f, 15.9075f, 21.2502f, 14.0f, 21.2502f)
                horizontalLineTo(10.0f)
                curveTo(8.0925f, 21.2502f, 6.7398f, 21.2485f, 5.7142f, 21.1059f)
                curveTo(4.7129f, 20.9667f, 4.1351f, 20.706f, 3.7108f, 20.2671f)
                curveTo(3.283f, 19.8246f, 3.0264f, 19.2166f, 2.8902f, 18.1685f)
                curveTo(2.7515f, 17.1014f, 2.75f, 15.6962f, 2.75f, 13.7252f)
                verticalLineTo(12.2042f)
                curveTo(2.75f, 11.0461f, 2.7508f, 10.2288f, 2.8116f, 9.5813f)
                curveTo(2.871f, 8.9489f, 2.9839f, 8.5361f, 3.1771f, 8.1831f)
                curveTo(3.3696f, 7.8313f, 3.6513f, 7.5219f, 4.1409f, 7.1469f)
                curveTo(4.6441f, 6.7616f, 5.3187f, 6.3419f, 6.2795f, 5.7456f)
                lineTo(8.2795f, 4.5044f)
                close()
            }
        }
        .build()
        return _homeWifi!!
    }

private var _homeWifi: ImageVector? = null
