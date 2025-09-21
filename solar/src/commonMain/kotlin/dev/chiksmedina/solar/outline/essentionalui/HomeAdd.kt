package dev.chiksmedina.solar.outline.essentionalui

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
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.HomeAdd: ImageVector
    get() {
        if (_homeAdd != null) {
            return _homeAdd!!
        }
        _homeAdd = Builder(
            name = "HomeAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 11.0f)
                curveTo(12.75f, 10.5858f, 12.4142f, 10.25f, 12.0f, 10.25f)
                curveTo(11.5858f, 10.25f, 11.25f, 10.5858f, 11.25f, 11.0f)
                lineTo(11.25f, 13.2501f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 13.2501f, 8.25f, 13.5858f, 8.25f, 14.0001f)
                curveTo(8.25f, 14.4143f, 8.5858f, 14.7501f, 9.0f, 14.7501f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.0f)
                curveTo(11.25f, 17.4142f, 11.5858f, 17.75f, 12.0f, 17.75f)
                curveTo(12.4142f, 17.75f, 12.75f, 17.4142f, 12.75f, 17.0f)
                lineTo(12.75f, 14.7501f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 14.7501f, 15.75f, 14.4143f, 15.75f, 14.0001f)
                curveTo(15.75f, 13.5858f, 15.4142f, 13.2501f, 15.0f, 13.2501f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
        return _homeAdd!!
    }

private var _homeAdd: ImageVector? = null
