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

val ElectronicDevicesGroup.MouseCircle: ImageVector
    get() {
        if (_mouseCircle != null) {
            return _mouseCircle!!
        }
        _mouseCircle = Builder(
            name = "MouseCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 14.0f)
                curveTo(16.0f, 16.2091f, 14.2091f, 18.0f, 12.0f, 18.0f)
                curveTo(9.7909f, 18.0f, 8.0f, 16.2091f, 8.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(8.0f, 7.7909f, 9.7909f, 6.0f, 12.0f, 6.0f)
                curveTo(14.2091f, 6.0f, 16.0f, 7.7909f, 16.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 10.0f)
                horizontalLineTo(16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.0f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.8918f)
                verticalLineTo(3.8502f)
                curveTo(12.0f, 2.7365f, 11.0955f, 1.8125f, 10.0128f, 2.0327f)
                curveTo(5.4419f, 2.9619f, 2.0f, 7.0341f, 2.0f, 11.9168f)
                curveTo(2.0f, 13.7706f, 2.4961f, 15.5075f, 3.3618f, 17.0f)
                moveTo(16.3641f, 2.8419f)
                curveTo(19.7003f, 4.4761f, 22.0f, 7.9257f, 22.0f, 11.9168f)
                curveTo(22.0f, 17.4856f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.1786f, 22.0f, 8.4709f, 21.509f, 7.0f, 20.651f)
            }
        }
            .build()
        return _mouseCircle!!
    }

private var _mouseCircle: ImageVector? = null
