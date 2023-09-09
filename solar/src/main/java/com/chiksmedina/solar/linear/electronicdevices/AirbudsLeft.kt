package com.chiksmedina.solar.linear.electronicdevices

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
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

public val ElectronicDevicesGroup.AirbudsLeft: ImageVector
    get() {
        if (_airbudsLeft != null) {
            return _airbudsLeft!!
        }
        _airbudsLeft = Builder(name = "AirbudsLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 18.6667f)
                verticalLineTo(19.5f)
                curveTo(2.0f, 20.8807f, 3.1193f, 22.0f, 4.5f, 22.0f)
                curveTo(5.8807f, 22.0f, 7.0f, 20.8807f, 7.0f, 19.5f)
                verticalLineTo(18.6667f)
                moveTo(2.0f, 18.6667f)
                verticalLineTo(7.625f)
                lineTo(2.0001f, 7.5594f)
                curveTo(2.0159f, 4.4956f, 4.4956f, 2.0159f, 7.5594f, 2.0001f)
                lineTo(7.625f, 2.0f)
                lineTo(7.6644f, 2.0f)
                curveTo(9.5026f, 2.0095f, 10.9905f, 3.4974f, 11.0f, 5.3356f)
                lineTo(11.0f, 5.375f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 9.6568f, 9.6568f, 11.0f, 8.0f, 11.0f)
                curveTo(7.4477f, 11.0f, 7.0f, 11.4477f, 7.0f, 12.0f)
                verticalLineTo(18.6667f)
                moveTo(2.0f, 18.6667f)
                horizontalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.67647f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                verticalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 16.5f)
                moveToRelative(5.5f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0008f, 5.1001f)
                curveTo(15.9599f, 5.4978f, 17.5031f, 7.0409f, 17.9008f, 9.0001f)
            }
        }
        .build()
        return _airbudsLeft!!
    }

private var _airbudsLeft: ImageVector? = null
