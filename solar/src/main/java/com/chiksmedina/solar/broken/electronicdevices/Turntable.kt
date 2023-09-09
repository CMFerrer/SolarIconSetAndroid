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

public val ElectronicDevicesGroup.Turntable: ImageVector
    get() {
        if (_turntable != null) {
            return _turntable!!
        }
        _turntable = Builder(name = "Turntable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                lineTo(15.8944f, 16.5528f)
                curveTo(16.572f, 16.214f, 17.0f, 15.5215f, 17.0f, 14.7639f)
                verticalLineTo(10.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 9.0f)
                curveTo(15.5f, 8.1716f, 16.1716f, 7.5f, 17.0f, 7.5f)
                curveTo(17.8284f, 7.5f, 18.5f, 8.1716f, 18.5f, 9.0f)
                curveTo(18.5f, 9.8284f, 17.8284f, 10.5f, 17.0f, 10.5f)
                curveTo(16.1716f, 10.5f, 15.5f, 9.8284f, 15.5f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.5093f, 4.4382f, 21.8356f, 5.8066f, 21.9449f, 8.0f)
            }
        }
        .build()
        return _turntable!!
    }

private var _turntable: ImageVector? = null
