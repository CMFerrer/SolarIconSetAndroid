package com.chiksmedina.solar.lineduotone.networkitprogramming

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
import com.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 15.0f)
                verticalLineTo(18.0f)
                verticalLineTo(17.4415f)
                curveTo(12.0f, 16.5807f, 12.5509f, 15.8164f, 13.3675f, 15.5442f)
                lineTo(16.6325f, 14.4558f)
                curveTo(17.4491f, 14.1836f, 18.0f, 13.4193f, 18.0f, 12.5585f)
                verticalLineTo(10.0f)
                moveTo(12.0f, 15.0f)
                verticalLineTo(14.4415f)
                curveTo(12.0f, 13.5807f, 11.4491f, 12.8164f, 10.6325f, 12.5442f)
                lineTo(7.3675f, 11.4558f)
                curveTo(6.5509f, 11.1836f, 6.0f, 10.4193f, 6.0f, 9.5585f)
                verticalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                lineTo(12.0f, 2.0f)
                lineTo(10.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                curveTo(17.0f, 8.5286f, 17.0f, 8.2929f, 17.1464f, 8.1465f)
                curveTo(17.2929f, 8.0f, 17.5286f, 8.0f, 18.0f, 8.0f)
                curveTo(18.4714f, 8.0f, 18.7071f, 8.0f, 18.8536f, 8.1465f)
                curveTo(19.0f, 8.2929f, 19.0f, 8.5286f, 19.0f, 9.0f)
                curveTo(19.0f, 9.4714f, 19.0f, 9.7071f, 18.8536f, 9.8535f)
                curveTo(18.7071f, 10.0f, 18.4714f, 10.0f, 18.0f, 10.0f)
                curveTo(17.5286f, 10.0f, 17.2929f, 10.0f, 17.1464f, 9.8535f)
                curveTo(17.0f, 9.7071f, 17.0f, 9.4714f, 17.0f, 9.0f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
