package com.chiksmedina.solar.lineduotone.arrowsaction

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
import com.chiksmedina.solar.lineduotone.ArrowsActionGroup

public val ArrowsActionGroup.MaximizeSquare3: ImageVector
    get() {
        if (_maximizeSquare3 != null) {
            return _maximizeSquare3!!
        }
        _maximizeSquare3 = Builder(name = "MaximizeSquare3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 21.9994f)
                curveTo(17.0551f, 21.9921f, 19.1785f, 21.8926f, 20.5356f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5356f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.7141f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.929f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.1075f, 4.8215f, 2.0079f, 6.9449f, 2.0006f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineTo(17.0f, 7.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(13.25f)
                moveTo(17.0f, 7.0f)
                verticalLineTo(10.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                curveTo(2.0f, 16.1144f, 2.0f, 15.1716f, 2.5858f, 14.5858f)
                curveTo(3.1716f, 14.0f, 4.1144f, 14.0f, 6.0f, 14.0f)
                curveTo(7.8856f, 14.0f, 8.8284f, 14.0f, 9.4142f, 14.5858f)
                curveTo(10.0f, 15.1716f, 10.0f, 16.1144f, 10.0f, 18.0f)
                curveTo(10.0f, 19.8856f, 10.0f, 20.8284f, 9.4142f, 21.4142f)
                curveTo(8.8284f, 22.0f, 7.8856f, 22.0f, 6.0f, 22.0f)
                curveTo(4.1144f, 22.0f, 3.1716f, 22.0f, 2.5858f, 21.4142f)
                curveTo(2.0f, 20.8284f, 2.0f, 19.8856f, 2.0f, 18.0f)
                close()
            }
        }
        .build()
        return _maximizeSquare3!!
    }

private var _maximizeSquare3: ImageVector? = null
