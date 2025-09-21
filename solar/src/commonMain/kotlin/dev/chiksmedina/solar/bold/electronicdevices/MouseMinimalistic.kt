package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

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
                moveTo(19.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 18.866f, 15.866f, 22.0f, 12.0f, 22.0f)
                curveTo(8.134f, 22.0f, 5.0f, 18.866f, 5.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
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
