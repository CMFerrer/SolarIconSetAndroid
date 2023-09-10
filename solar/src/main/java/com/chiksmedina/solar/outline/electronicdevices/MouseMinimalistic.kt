package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.MouseMinimalistic: ImageVector
    get() {
        if (_mouseMinimalistic != null) {
            return _mouseMinimalistic!!
        }
        _mouseMinimalistic = Builder(
            name = "MouseMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.25f, 9.0f)
                curveTo(4.25f, 4.7198f, 7.7198f, 1.25f, 12.0f, 1.25f)
                curveTo(16.2802f, 1.25f, 19.75f, 4.7198f, 19.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(19.75f, 19.2802f, 16.2802f, 22.75f, 12.0f, 22.75f)
                curveTo(7.7198f, 22.75f, 4.25f, 19.2802f, 4.25f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.5482f, 2.75f, 5.75f, 5.5482f, 5.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(5.75f, 18.4518f, 8.5482f, 21.25f, 12.0f, 21.25f)
                curveTo(15.4518f, 21.25f, 18.25f, 18.4518f, 18.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.25f, 5.5482f, 15.4518f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(12.0f, 4.25f)
                curveTo(12.4142f, 4.25f, 12.75f, 4.5858f, 12.75f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(12.75f, 8.4142f, 12.4142f, 8.75f, 12.0f, 8.75f)
                curveTo(11.5858f, 8.75f, 11.25f, 8.4142f, 11.25f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 4.5858f, 11.5858f, 4.25f, 12.0f, 4.25f)
                close()
            }
        }
            .build()
        return _mouseMinimalistic!!
    }

private var _mouseMinimalistic: ImageVector? = null
