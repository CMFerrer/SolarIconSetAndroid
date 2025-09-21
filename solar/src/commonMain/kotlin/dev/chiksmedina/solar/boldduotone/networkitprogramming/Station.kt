package dev.chiksmedina.solar.boldduotone.networkitprogramming

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
import dev.chiksmedina.solar.boldduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Station: ImageVector
    get() {
        if (_station != null) {
            return _station!!
        }
        _station = Builder(
            name = "Station", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.8326f, 10.6241f)
                curveTo(10.3284f, 10.261f, 10.0001f, 9.6688f, 10.0001f, 9.0f)
                curveTo(10.0001f, 7.8954f, 10.8955f, 7.0f, 12.0001f, 7.0f)
                curveTo(13.1047f, 7.0f, 14.0001f, 7.8954f, 14.0001f, 9.0f)
                curveTo(14.0001f, 9.6688f, 13.6718f, 10.261f, 13.1675f, 10.6241f)
                lineTo(16.7148f, 21.7726f)
                curveTo(16.8232f, 22.1134f, 16.676f, 22.4833f, 16.363f, 22.6563f)
                curveTo(16.0501f, 22.8294f, 15.6585f, 22.7574f, 15.4276f, 22.4845f)
                lineTo(12.0001f, 18.4338f)
                lineTo(8.5726f, 22.4845f)
                curveTo(8.3417f, 22.7574f, 7.9501f, 22.8294f, 7.6371f, 22.6563f)
                curveTo(7.3242f, 22.4833f, 7.177f, 22.1134f, 7.2854f, 21.7726f)
                lineTo(10.8326f, 10.6241f)
                close()
                moveTo(12.9826f, 17.2727f)
                lineTo(14.1466f, 18.6485f)
                lineTo(13.5104f, 16.6489f)
                lineTo(12.9826f, 17.2727f)
                close()
                moveTo(12.9746f, 14.9648f)
                curveTo(12.9583f, 14.9809f, 12.9426f, 14.9978f, 12.9276f, 15.0155f)
                lineTo(12.0001f, 16.1116f)
                lineTo(11.0726f, 15.0155f)
                curveTo(11.0576f, 14.9978f, 11.0419f, 14.9809f, 11.0256f, 14.9648f)
                lineTo(12.0001f, 11.9022f)
                lineTo(12.9746f, 14.9648f)
                close()
                moveTo(10.4898f, 16.6489f)
                lineTo(11.0176f, 17.2727f)
                lineTo(9.8535f, 18.6485f)
                lineTo(10.4898f, 16.6489f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.4658f, 2.5309f)
                curveTo(5.759f, 2.2383f, 5.7595f, 1.7634f, 5.4669f, 1.4702f)
                curveTo(5.1743f, 1.177f, 4.6994f, 1.1765f, 4.4062f, 1.4691f)
                curveTo(2.4572f, 3.4143f, 1.25f, 6.1059f, 1.25f, 9.0782f)
                curveTo(1.25f, 12.0852f, 2.4856f, 14.805f, 4.475f, 16.7552f)
                curveTo(4.7708f, 17.0451f, 5.2456f, 17.0404f, 5.5356f, 16.7446f)
                curveTo(5.8255f, 16.4488f, 5.8208f, 15.974f, 5.525f, 15.684f)
                curveTo(3.8116f, 14.0043f, 2.75f, 11.6659f, 2.75f, 9.0782f)
                curveTo(2.75f, 6.5203f, 3.7872f, 4.2061f, 5.4658f, 2.5309f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.677f, 1.5531f)
                curveTo(19.387f, 1.2573f, 18.9122f, 1.2526f, 18.6164f, 1.5426f)
                curveTo(18.3206f, 1.8326f, 18.3159f, 2.3074f, 18.6059f, 2.6032f)
                curveTo(20.2422f, 4.2724f, 21.25f, 6.5569f, 21.25f, 9.0782f)
                curveTo(21.25f, 11.6293f, 20.2182f, 13.9381f, 18.5473f, 15.6123f)
                curveTo(18.2547f, 15.9055f, 18.2552f, 16.3804f, 18.5484f, 16.673f)
                curveTo(18.8415f, 16.9656f, 19.3164f, 16.9651f, 19.609f, 16.6719f)
                curveTo(21.5491f, 14.728f, 22.75f, 12.0426f, 22.75f, 9.0782f)
                curveTo(22.75f, 6.1486f, 21.5771f, 3.4914f, 19.677f, 1.5531f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.2741f, 5.6257f)
                curveTo(8.5765f, 5.3427f, 8.5923f, 4.8681f, 8.3092f, 4.5657f)
                curveTo(8.0262f, 4.2632f, 7.5516f, 4.2475f, 7.2492f, 4.5305f)
                curveTo(6.0215f, 5.6794f, 5.25f, 7.2811f, 5.25f, 9.0603f)
                curveTo(5.25f, 10.8605f, 6.0397f, 12.4787f, 7.2924f, 13.6303f)
                curveTo(7.5974f, 13.9106f, 8.0718f, 13.8906f, 8.3522f, 13.5857f)
                curveTo(8.6325f, 13.2807f, 8.6125f, 12.8063f, 8.3076f, 12.526f)
                curveTo(7.3387f, 11.6354f, 6.75f, 10.4078f, 6.75f, 9.0603f)
                curveTo(6.75f, 7.7283f, 7.3252f, 6.5137f, 8.2741f, 5.6257f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.8033f, 4.5801f)
                curveTo(16.5039f, 4.2938f, 16.0292f, 4.3044f, 15.7429f, 4.6037f)
                curveTo(15.4566f, 4.903f, 15.4671f, 5.3778f, 15.7664f, 5.6641f)
                curveTo(16.6911f, 6.5486f, 17.25f, 7.7473f, 17.25f, 9.0603f)
                curveTo(17.25f, 10.3889f, 16.6778f, 11.6006f, 15.7333f, 12.488f)
                curveTo(15.4315f, 12.7716f, 15.4167f, 13.2462f, 15.7003f, 13.5481f)
                curveTo(15.9839f, 13.85f, 16.4586f, 13.8648f, 16.7604f, 13.5811f)
                curveTo(17.9825f, 12.4329f, 18.75f, 10.8349f, 18.75f, 9.0603f)
                curveTo(18.75f, 7.3067f, 18.0005f, 5.7252f, 16.8033f, 4.5801f)
                close()
            }
        }
            .build()
        return _station!!
    }

private var _station: ImageVector? = null
