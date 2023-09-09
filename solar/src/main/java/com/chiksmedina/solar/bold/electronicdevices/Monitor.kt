package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val ElectronicDevicesGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(name = "Monitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                curveTo(5.1716f, 17.0f, 3.7574f, 17.0f, 2.8787f, 16.1213f)
                curveTo(2.3094f, 15.552f, 2.1089f, 14.7579f, 2.0384f, 13.5f)
                horizontalLineTo(21.9616f)
                curveTo(21.8911f, 14.7579f, 21.6906f, 15.552f, 21.1213f, 16.1213f)
                curveTo(20.2426f, 17.0f, 18.8284f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 21.0f, 16.75f, 21.3358f, 16.75f, 21.75f)
                curveTo(16.75f, 22.1642f, 16.4142f, 22.5f, 16.0f, 22.5f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 22.5f, 7.25f, 22.1642f, 7.25f, 21.75f)
                curveTo(7.25f, 21.3358f, 7.5858f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 11.5516f, 22.0f, 12.0494f, 21.9935f, 12.5f)
                horizontalLineTo(2.0065f)
                curveTo(2.0f, 12.0494f, 2.0f, 11.5516f, 2.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
