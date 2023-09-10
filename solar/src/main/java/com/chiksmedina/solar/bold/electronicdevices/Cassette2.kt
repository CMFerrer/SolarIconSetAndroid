package com.chiksmedina.solar.bold.electronicdevices

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
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Cassette2: ImageVector
    get() {
        if (_cassette2 != null) {
            return _cassette2!!
        }
        _cassette2 = Builder(
            name = "Cassette2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.75f, 13.75f)
                curveTo(6.75f, 12.9216f, 7.4216f, 12.25f, 8.25f, 12.25f)
                curveTo(9.0784f, 12.25f, 9.75f, 12.9216f, 9.75f, 13.75f)
                curveTo(9.75f, 14.5784f, 9.0784f, 15.25f, 8.25f, 15.25f)
                curveTo(7.4216f, 15.25f, 6.75f, 14.5784f, 6.75f, 13.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.8487f, 15.25f)
                horizontalLineTo(13.1513f)
                curveTo(12.8961f, 14.8087f, 12.75f, 14.2964f, 12.75f, 13.75f)
                curveTo(12.75f, 13.2036f, 12.8961f, 12.6913f, 13.1513f, 12.25f)
                horizontalLineTo(10.8487f)
                curveTo(11.1039f, 12.6913f, 11.25f, 13.2036f, 11.25f, 13.75f)
                curveTo(11.25f, 14.2964f, 11.1039f, 14.8087f, 10.8487f, 15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.75f, 15.25f)
                curveTo(16.5784f, 15.25f, 17.25f, 14.5784f, 17.25f, 13.75f)
                curveTo(17.25f, 12.9216f, 16.5784f, 12.25f, 15.75f, 12.25f)
                curveTo(14.9216f, 12.25f, 14.25f, 12.9216f, 14.25f, 13.75f)
                curveTo(14.25f, 14.5784f, 14.9216f, 15.25f, 15.75f, 15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.4311f, 4.1522f)
                lineTo(17.6612f, 6.2054f)
                curveTo(17.4379f, 6.8009f, 17.2489f, 7.3048f, 17.0479f, 7.7007f)
                curveTo(16.8342f, 8.1217f, 16.5762f, 8.4856f, 16.1802f, 8.7601f)
                curveTo(15.7841f, 9.0345f, 15.3528f, 9.1483f, 14.8835f, 9.2006f)
                curveTo(14.4423f, 9.2498f, 13.9042f, 9.2498f, 13.2682f, 9.2498f)
                horizontalLineTo(10.7314f)
                curveTo(10.0954f, 9.2498f, 9.5572f, 9.2498f, 9.116f, 9.2006f)
                curveTo(8.6468f, 9.1483f, 8.2154f, 9.0345f, 7.8194f, 8.7601f)
                curveTo(7.4234f, 8.4856f, 7.1653f, 8.1217f, 6.9516f, 7.7007f)
                curveTo(6.7506f, 7.3048f, 6.5617f, 6.8009f, 6.3384f, 6.2054f)
                lineTo(5.5684f, 4.1522f)
                curveTo(4.5017f, 4.3006f, 3.7497f, 4.5934f, 3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 20.0f, 19.6569f, 20.0f, 20.8284f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 8.2288f, 22.0f, 6.3432f, 20.8284f, 5.1716f)
                curveTo(20.2502f, 4.5933f, 19.498f, 4.3005f, 18.4311f, 4.1522f)
                close()
                moveTo(5.25f, 13.75f)
                curveTo(5.25f, 12.0931f, 6.5932f, 10.75f, 8.25f, 10.75f)
                curveTo(8.306f, 10.75f, 8.3616f, 10.7515f, 8.4168f, 10.7546f)
                curveTo(8.4441f, 10.7515f, 8.4719f, 10.75f, 8.5f, 10.75f)
                horizontalLineTo(16.0f)
                curveTo(16.0852f, 10.75f, 16.1671f, 10.7642f, 16.2434f, 10.7904f)
                curveTo(17.6655f, 11.0257f, 18.75f, 12.2612f, 18.75f, 13.75f)
                curveTo(18.75f, 15.2388f, 17.6655f, 16.4743f, 16.2434f, 16.7096f)
                curveTo(16.1671f, 16.7358f, 16.0852f, 16.75f, 16.0f, 16.75f)
                horizontalLineTo(8.5f)
                curveTo(8.4719f, 16.75f, 8.4441f, 16.7485f, 8.4168f, 16.7454f)
                curveTo(8.3616f, 16.7485f, 8.306f, 16.75f, 8.25f, 16.75f)
                curveTo(6.5932f, 16.75f, 5.25f, 15.4069f, 5.25f, 13.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.8749f, 4.0301f)
                lineTo(16.2708f, 5.6409f)
                curveTo(16.0295f, 6.2844f, 15.8691f, 6.7091f, 15.7104f, 7.0217f)
                curveTo(15.5603f, 7.3175f, 15.4437f, 7.4455f, 15.3258f, 7.5272f)
                curveTo(15.2078f, 7.6089f, 15.0471f, 7.6731f, 14.7174f, 7.7099f)
                curveTo(14.369f, 7.7487f, 13.915f, 7.7498f, 13.2278f, 7.7498f)
                horizontalLineTo(10.7718f)
                curveTo(10.0846f, 7.7498f, 9.6305f, 7.7487f, 9.2822f, 7.7099f)
                curveTo(8.9525f, 7.6731f, 8.7917f, 7.6089f, 8.6738f, 7.5272f)
                curveTo(8.5559f, 7.4455f, 8.4393f, 7.3175f, 8.2891f, 7.0217f)
                curveTo(8.1304f, 6.7091f, 7.97f, 6.2844f, 7.7287f, 5.6409f)
                lineTo(7.1246f, 4.0301f)
                curveTo(7.939f, 4.0f, 8.8875f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1123f, 4.0f, 16.0606f, 4.0f, 16.8749f, 4.0301f)
                close()
            }
        }
            .build()
        return _cassette2!!
    }

private var _cassette2: ImageVector? = null
