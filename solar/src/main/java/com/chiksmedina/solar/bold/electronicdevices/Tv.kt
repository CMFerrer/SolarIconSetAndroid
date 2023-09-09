package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 16.0001f)
                verticalLineTo(12.0001f)
                curveTo(22.0f, 9.1717f, 22.0f, 7.7575f, 21.1213f, 6.8788f)
                curveTo(20.296f, 6.0535f, 18.9983f, 6.0034f, 16.5f, 6.0003f)
                verticalLineTo(21.9999f)
                curveTo(18.9983f, 21.9969f, 20.296f, 21.9467f, 21.1213f, 21.1214f)
                curveTo(22.0f, 20.2428f, 22.0f, 18.8285f, 22.0f, 16.0001f)
                close()
                moveTo(19.0f, 11.0f)
                curveTo(19.5523f, 11.0f, 20.0f, 11.4477f, 20.0f, 12.0f)
                curveTo(20.0f, 12.5523f, 19.5523f, 13.0f, 19.0f, 13.0f)
                curveTo(18.4477f, 13.0f, 18.0f, 12.5523f, 18.0f, 12.0f)
                curveTo(18.0f, 11.4477f, 18.4477f, 11.0f, 19.0f, 11.0f)
                close()
                moveTo(19.0f, 15.0f)
                curveTo(19.5523f, 15.0f, 20.0f, 15.4477f, 20.0f, 16.0f)
                curveTo(20.0f, 16.5523f, 19.5523f, 17.0f, 19.0f, 17.0f)
                curveTo(18.4477f, 17.0f, 18.0f, 16.5523f, 18.0f, 16.0f)
                curveTo(18.0f, 15.4477f, 18.4477f, 15.0f, 19.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5694f, 3.4881f)
                lineTo(13.4163f, 6.0001f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0001f)
                lineTo(8.0f, 22.0001f)
                curveTo(5.1716f, 22.0001f, 3.7574f, 22.0001f, 2.8787f, 21.1214f)
                curveTo(2.0f, 20.2428f, 2.0f, 18.8285f, 2.0f, 16.0001f)
                verticalLineTo(12.0001f)
                curveTo(2.0f, 9.1717f, 2.0f, 7.7575f, 2.8787f, 6.8788f)
                curveTo(3.7574f, 6.0001f, 5.1716f, 6.0001f, 8.0f, 6.0001f)
                horizontalLineTo(10.5837f)
                lineTo(8.4305f, 3.4881f)
                curveTo(8.161f, 3.1736f, 8.1974f, 2.7001f, 8.5119f, 2.4306f)
                curveTo(8.8264f, 2.161f, 9.2999f, 2.1974f, 9.5694f, 2.5119f)
                lineTo(12.0f, 5.3476f)
                lineTo(14.4305f, 2.5119f)
                curveTo(14.7001f, 2.1974f, 15.1736f, 2.161f, 15.4881f, 2.4306f)
                curveTo(15.8026f, 2.7001f, 15.839f, 3.1736f, 15.5694f, 3.4881f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
