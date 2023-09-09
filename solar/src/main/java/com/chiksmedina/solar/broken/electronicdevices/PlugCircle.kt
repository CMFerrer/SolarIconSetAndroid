package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

public val ElectronicDevicesGroup.PlugCircle: ImageVector
    get() {
        if (_plugCircle != null) {
            return _plugCircle!!
        }
        _plugCircle = Builder(name = "PlugCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.1082f)
                verticalLineTo(20.1498f)
                curveTo(12.0f, 21.2635f, 11.0955f, 22.1875f, 10.0128f, 21.9673f)
                curveTo(5.4419f, 21.0381f, 2.0f, 16.9659f, 2.0f, 12.0832f)
                curveTo(2.0f, 10.2294f, 2.4961f, 8.4925f, 3.3618f, 7.0f)
                moveTo(16.3641f, 21.1581f)
                curveTo(19.7003f, 19.5239f, 22.0f, 16.0743f, 22.0f, 12.0832f)
                curveTo(22.0f, 6.5144f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1786f, 2.0f, 8.4709f, 2.491f, 7.0f, 3.3489f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.8f)
                curveTo(9.0f, 11.3582f, 9.3582f, 11.0f, 9.8f, 11.0f)
                horizontalLineTo(14.2f)
                curveTo(14.6418f, 11.0f, 15.0f, 11.3582f, 15.0f, 11.8f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                verticalLineTo(11.8f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 11.0f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 11.0f)
                verticalLineTo(9.0f)
            }
        }
        .build()
        return _plugCircle!!
    }

private var _plugCircle: ImageVector? = null
