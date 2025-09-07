package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.LightbulbMinimalistic: ImageVector
    get() {
        if (_lightbulbMinimalistic != null) {
            return _lightbulbMinimalistic!!
        }
        _lightbulbMinimalistic = Builder(
            name = "LightbulbMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 19.5f)
                horizontalLineTo(14.0f)
                moveTo(10.6667f, 22.0f)
                horizontalLineTo(13.3333f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 2.6022f)
                curveTo(14.0907f, 2.2165f, 13.0736f, 2.0f, 12.0f, 2.0f)
                curveTo(8.134f, 2.0f, 5.0f, 4.8069f, 5.0f, 8.2181f)
                lineTo(5.0001f, 8.3019f)
                curveTo(5.0087f, 10.2984f, 5.8694f, 12.2187f, 7.4106f, 13.6805f)
                lineTo(8.5146f, 14.7196f)
                curveTo(8.8244f, 15.0112f, 9.0f, 15.4177f, 9.0f, 15.843f)
                curveTo(9.0f, 16.482f, 9.518f, 17.0f, 10.157f, 17.0f)
                horizontalLineTo(13.843f)
                curveTo(14.482f, 17.0f, 15.0f, 16.482f, 15.0f, 15.843f)
                curveTo(15.0f, 15.4177f, 15.1756f, 15.0112f, 15.4854f, 14.7196f)
                lineTo(16.5894f, 13.6805f)
                curveTo(18.1306f, 12.2187f, 18.9912f, 10.2984f, 18.9999f, 8.3019f)
                lineTo(19.0f, 8.2181f)
                curveTo(19.0f, 7.4384f, 18.8363f, 6.6902f, 18.5375f, 6.0f)
            }
        }
            .build()
        return _lightbulbMinimalistic!!
    }

private var _lightbulbMinimalistic: ImageVector? = null
