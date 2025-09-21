package dev.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsCheck: ImageVector
    get() {
        if (_airbudsCheck != null) {
            return _airbudsCheck!!
        }
        _airbudsCheck = Builder(
            name = "AirbudsCheck", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 11.5f)
                verticalLineTo(11.3f)
                curveTo(18.0f, 10.7477f, 18.4477f, 10.3f, 19.0f, 10.3f)
                curveTo(20.6569f, 10.3f, 22.0f, 8.9569f, 22.0f, 7.3f)
                verticalLineTo(5.1875f)
                curveTo(22.0f, 5.0134f, 22.0f, 4.9264f, 21.9964f, 4.8528f)
                curveTo(21.9207f, 3.3117f, 20.6883f, 2.0793f, 19.1472f, 2.0036f)
                curveTo(19.0736f, 2.0f, 18.9866f, 2.0f, 18.8125f, 2.0f)
                curveTo(18.5223f, 2.0f, 18.3773f, 2.0f, 18.2547f, 2.006f)
                curveTo(15.6861f, 2.1322f, 13.6322f, 4.1861f, 13.506f, 6.7547f)
                curveTo(13.5f, 6.8773f, 13.5f, 7.0223f, 13.5f, 7.3125f)
                verticalLineTo(13.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 19.0f)
                verticalLineTo(19.75f)
                curveTo(10.5f, 20.9926f, 9.4926f, 22.0f, 8.25f, 22.0f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(19.0f)
                moveTo(10.5f, 19.0f)
                verticalLineTo(9.3125f)
                curveTo(10.5f, 9.0223f, 10.5f, 8.8773f, 10.494f, 8.7547f)
                curveTo(10.3678f, 6.1861f, 8.3139f, 4.1322f, 5.7453f, 4.006f)
                curveTo(5.6227f, 4.0f, 5.4777f, 4.0f, 5.1875f, 4.0f)
                curveTo(5.0134f, 4.0f, 4.9264f, 4.0f, 4.8528f, 4.0036f)
                curveTo(3.3117f, 4.0793f, 2.0793f, 5.3117f, 2.0036f, 6.8528f)
                curveTo(2.0f, 6.9264f, 2.0f, 7.0134f, 2.0f, 7.1875f)
                verticalLineTo(9.3f)
                curveTo(2.0f, 10.9569f, 3.3431f, 12.3f, 5.0f, 12.3f)
                curveTo(5.5523f, 12.3f, 6.0f, 12.7477f, 6.0f, 13.3f)
                verticalLineTo(19.0f)
                moveTo(10.5f, 19.0f)
                horizontalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 5.0f)
                verticalLineTo(7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 7.0f)
                verticalLineTo(9.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 18.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 18.2f)
                lineTo(17.3571f, 19.0f)
                lineTo(19.5f, 17.0f)
            }
        }
            .build()
        return _airbudsCheck!!
    }

private var _airbudsCheck: ImageVector? = null
