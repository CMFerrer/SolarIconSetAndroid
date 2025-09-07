package com.chiksmedina.solar.outline.networkitprogramming

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
import com.chiksmedina.solar.outline.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.WindowFrame: ImageVector
    get() {
        if (_windowFrame != null) {
            return _windowFrame!!
        }
        _windowFrame = Builder(
            name = "WindowFrame", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 6.0f)
                curveTo(7.0f, 6.5523f, 6.5523f, 7.0f, 6.0f, 7.0f)
                curveTo(5.4477f, 7.0f, 5.0f, 6.5523f, 5.0f, 6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                curveTo(6.5523f, 5.0f, 7.0f, 5.4477f, 7.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 6.5523f, 9.5523f, 7.0f, 9.0f, 7.0f)
                curveTo(8.4477f, 7.0f, 8.0f, 6.5523f, 8.0f, 6.0f)
                curveTo(8.0f, 5.4477f, 8.4477f, 5.0f, 9.0f, 5.0f)
                curveTo(9.5523f, 5.0f, 10.0f, 5.4477f, 10.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 6.5523f, 13.0f, 6.0f)
                curveTo(13.0f, 5.4477f, 12.5523f, 5.0f, 12.0f, 5.0f)
                curveTo(11.4477f, 5.0f, 11.0f, 5.4477f, 11.0f, 6.0f)
                curveTo(11.0f, 6.5523f, 11.4477f, 7.0f, 12.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.3274f, 7.2497f, 1.2815f, 8.225f, 1.2629f, 9.361f)
                curveTo(1.2544f, 9.4061f, 1.25f, 9.4525f, 1.25f, 9.5f)
                curveTo(1.25f, 9.5399f, 1.2531f, 9.5791f, 1.2591f, 9.6173f)
                curveTo(1.25f, 10.3296f, 1.25f, 11.1031f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.75f, 11.1031f, 22.75f, 10.3296f, 22.7409f, 9.6173f)
                curveTo(22.7469f, 9.5791f, 22.75f, 9.5399f, 22.75f, 9.5f)
                curveTo(22.75f, 9.4525f, 22.7456f, 9.4061f, 22.7371f, 9.361f)
                curveTo(22.7185f, 8.225f, 22.6726f, 7.2497f, 22.5603f, 6.4137f)
                curveTo(22.366f, 4.969f, 21.9607f, 3.8289f, 21.0659f, 2.9341f)
                curveTo(20.1711f, 2.0393f, 19.031f, 1.634f, 17.5863f, 1.4397f)
                curveTo(16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f, 1.25f)
                horizontalLineTo(11.9426f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 11.3715f, 2.7501f, 10.7898f, 2.7535f, 10.25f)
                horizontalLineTo(8.25f)
                lineTo(8.25f, 21.0f)
                curveTo(8.25f, 21.0718f, 8.2601f, 21.1412f, 8.2789f, 21.2069f)
                curveTo(7.6559f, 21.1811f, 7.1055f, 21.1398f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7516f, 16.0864f, 2.75f, 14.3782f, 2.75f, 12.0f)
                close()
                moveTo(9.7102f, 21.2417f)
                curveTo(10.3969f, 21.2498f, 11.1563f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 11.3715f, 21.2499f, 10.7898f, 21.2465f, 10.25f)
                horizontalLineTo(9.75f)
                lineTo(9.75f, 21.0f)
                curveTo(9.75f, 21.0846f, 9.736f, 21.1659f, 9.7102f, 21.2417f)
                close()
                moveTo(2.9264f, 6.6136f)
                curveTo(2.844f, 7.226f, 2.8001f, 7.929f, 2.7767f, 8.75f)
                horizontalLineTo(21.2233f)
                curveTo(21.1999f, 7.929f, 21.156f, 7.226f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                close()
            }
        }
            .build()
        return _windowFrame!!
    }

private var _windowFrame: ImageVector? = null
