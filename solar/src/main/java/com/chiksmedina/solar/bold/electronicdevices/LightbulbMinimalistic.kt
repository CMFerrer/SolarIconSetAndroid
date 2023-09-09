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

public val ElectronicDevicesGroup.LightbulbMinimalistic: ImageVector
    get() {
        if (_lightbulbMinimalistic != null) {
            return _lightbulbMinimalistic!!
        }
        _lightbulbMinimalistic = Builder(name = "LightbulbMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 18.7089f)
                curveTo(9.25f, 18.2894f, 9.5858f, 17.9494f, 10.0f, 17.9494f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 17.9494f, 14.75f, 18.2894f, 14.75f, 18.7089f)
                curveTo(14.75f, 19.1283f, 14.4142f, 19.4684f, 14.0f, 19.4684f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 19.4684f, 9.25f, 19.1283f, 9.25f, 18.7089f)
                close()
                moveTo(9.9167f, 21.2405f)
                curveTo(9.9167f, 20.821f, 10.2525f, 20.481f, 10.6667f, 20.481f)
                horizontalLineTo(13.3333f)
                curveTo(13.7475f, 20.481f, 14.0833f, 20.821f, 14.0833f, 21.2405f)
                curveTo(14.0833f, 21.66f, 13.7475f, 22.0f, 13.3333f, 22.0f)
                horizontalLineTo(10.6667f)
                curveTo(10.2525f, 22.0f, 9.9167f, 21.66f, 9.9167f, 21.2405f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4106f, 13.8283f)
                lineTo(8.5146f, 14.8807f)
                curveTo(8.8244f, 15.1759f, 9.0f, 15.5875f, 9.0f, 16.0182f)
                curveTo(9.0f, 16.6653f, 9.518f, 17.1899f, 10.157f, 17.1899f)
                horizontalLineTo(13.843f)
                curveTo(14.482f, 17.1899f, 15.0f, 16.6653f, 15.0f, 16.0182f)
                curveTo(15.0f, 15.5875f, 15.1756f, 15.1759f, 15.4854f, 14.8807f)
                lineTo(16.5894f, 13.8283f)
                curveTo(18.1306f, 12.3481f, 18.9912f, 10.4034f, 18.9999f, 8.3817f)
                lineTo(19.0f, 8.2968f)
                curveTo(19.0f, 4.8424f, 15.866f, 2.0f, 12.0f, 2.0f)
                curveTo(8.134f, 2.0f, 5.0f, 4.8424f, 5.0f, 8.2968f)
                lineTo(5.0001f, 8.3817f)
                curveTo(5.0087f, 10.4034f, 5.8694f, 12.3481f, 7.4106f, 13.8283f)
                close()
            }
        }
        .build()
        return _lightbulbMinimalistic!!
    }

private var _lightbulbMinimalistic: ImageVector? = null
