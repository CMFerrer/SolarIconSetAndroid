package com.chiksmedina.solar.lineduotone.electronicdevices

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
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = Builder(name = "Projector", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 6.0173f)
                curveTo(19.5534f, 6.0641f, 20.48f, 6.2374f, 21.1213f, 6.8787f)
                curveTo(22.0f, 7.7574f, 22.0f, 9.1716f, 22.0f, 12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.2426f, 18.0f, 18.8284f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 18.0f, 3.7574f, 18.0f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                curveTo(2.0f, 9.1716f, 2.0f, 7.7574f, 2.8787f, 6.8787f)
                curveTo(3.7574f, 6.0f, 5.1716f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3292f, 20.3354f)
                curveTo(18.5144f, 20.7059f, 18.9649f, 20.8561f, 19.3354f, 20.6708f)
                curveTo(19.7059f, 20.4856f, 19.8561f, 20.0351f, 19.6708f, 19.6646f)
                lineTo(18.3292f, 20.3354f)
                close()
                moveTo(17.3292f, 18.3354f)
                lineTo(18.3292f, 20.3354f)
                lineTo(19.6708f, 19.6646f)
                lineTo(18.6708f, 17.6646f)
                lineTo(17.3292f, 18.3354f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.6708f, 20.3354f)
                curveTo(5.4856f, 20.7059f, 5.0351f, 20.8561f, 4.6646f, 20.6708f)
                curveTo(4.2941f, 20.4856f, 4.1439f, 20.0351f, 4.3292f, 19.6646f)
                lineTo(5.6708f, 20.3354f)
                close()
                moveTo(6.6708f, 18.3354f)
                lineTo(5.6708f, 20.3354f)
                lineTo(4.3292f, 19.6646f)
                lineTo(5.3292f, 17.6646f)
                lineTo(6.6708f, 18.3354f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                moveToRelative(-5.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(12.0f, 10.1046f, 12.8954f, 11.0f, 14.0f, 11.0f)
                curveTo(15.1046f, 11.0f, 16.0f, 10.1046f, 16.0f, 9.0f)
                curveTo(16.0f, 7.8954f, 15.1046f, 7.0f, 14.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 9.5f)
                lineTo(5.5002f, 11.0001f)
            }
        }
        .build()
        return _projector!!
    }

private var _projector: ImageVector? = null
