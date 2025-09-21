package dev.chiksmedina.solar.linear.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.WifiRouter: ImageVector
    get() {
        if (_wifiRouter != null) {
            return _wifiRouter!!
        }
        _wifiRouter = Builder(
            name = "WifiRouter", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 15.0f)
                curveTo(7.0f, 15.5523f, 6.5523f, 16.0f, 6.0f, 16.0f)
                curveTo(5.4477f, 16.0f, 5.0f, 15.5523f, 5.0f, 15.0f)
                curveTo(5.0f, 14.4477f, 5.4477f, 14.0f, 6.0f, 14.0f)
                curveTo(6.5523f, 14.0f, 7.0f, 14.4477f, 7.0f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 15.0f)
                curveTo(10.0f, 15.5523f, 9.5523f, 16.0f, 9.0f, 16.0f)
                curveTo(8.4477f, 16.0f, 8.0f, 15.5523f, 8.0f, 15.0f)
                curveTo(8.0f, 14.4477f, 8.4477f, 14.0f, 9.0f, 14.0f)
                curveTo(9.5523f, 14.0f, 10.0f, 14.4477f, 10.0f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 13.1144f, 2.0f, 12.1716f, 2.5858f, 11.5858f)
                curveTo(3.1716f, 11.0f, 4.1144f, 11.0f, 6.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 11.0f, 20.8284f, 11.0f, 21.4142f, 11.5858f)
                curveTo(22.0f, 12.1716f, 22.0f, 13.1144f, 22.0f, 15.0f)
                curveTo(22.0f, 16.8856f, 22.0f, 17.8284f, 21.4142f, 18.4142f)
                curveTo(20.8284f, 19.0f, 19.8856f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(4.1144f, 19.0f, 3.1716f, 19.0f, 2.5858f, 18.4142f)
                curveTo(2.0f, 17.8284f, 2.0f, 16.8856f, 2.0f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 11.0f)
                lineTo(3.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 11.0f)
                lineTo(21.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 15.0f)
                lineTo(18.0f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.1673f, 5.397f)
                curveTo(16.3414f, 3.4029f, 14.3763f, 2.0f, 12.0836f, 2.0f)
                curveTo(9.7909f, 2.0f, 7.8259f, 3.4029f, 7.0f, 5.397f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.9646f, 6.6581f)
                curveTo(14.6007f, 5.4111f, 13.4489f, 4.5f, 12.0844f, 4.5f)
                curveTo(10.7198f, 4.5f, 9.568f, 5.4111f, 9.2041f, 6.6581f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.084f, 7.0f)
                curveTo(13.084f, 7.5523f, 12.6363f, 8.0f, 12.084f, 8.0f)
                curveTo(11.5317f, 8.0f, 11.084f, 7.5523f, 11.084f, 7.0f)
                curveTo(11.084f, 6.4477f, 11.5317f, 6.0f, 12.084f, 6.0f)
                curveTo(12.6363f, 6.0f, 13.084f, 6.4477f, 13.084f, 7.0f)
                close()
            }
        }
            .build()
        return _wifiRouter!!
    }

private var _wifiRouter: ImageVector? = null
