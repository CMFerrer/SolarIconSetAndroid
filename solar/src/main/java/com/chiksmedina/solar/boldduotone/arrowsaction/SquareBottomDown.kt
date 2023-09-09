package com.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

public val ArrowsActionGroup.SquareBottomDown: ImageVector
    get() {
        if (_squareBottomDown != null) {
            return _squareBottomDown!!
        }
        _squareBottomDown = Builder(name = "SquareBottomDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 21.0f)
                curveTo(9.75f, 21.4142f, 9.4142f, 21.75f, 9.0f, 21.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 21.75f, 2.25f, 21.4142f, 2.25f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(2.25f, 14.5858f, 2.5858f, 14.25f, 3.0f, 14.25f)
                curveTo(3.4142f, 14.25f, 3.75f, 14.5858f, 3.75f, 15.0f)
                verticalLineTo(19.1893f)
                lineTo(10.4697f, 12.4697f)
                curveTo(10.7626f, 12.1768f, 11.2374f, 12.1768f, 11.5303f, 12.4697f)
                curveTo(11.8232f, 12.7626f, 11.8232f, 13.2374f, 11.5303f, 13.5303f)
                lineTo(4.8107f, 20.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 20.25f, 9.75f, 20.5858f, 9.75f, 21.0f)
                close()
            }
        }
        .build()
        return _squareBottomDown!!
    }

private var _squareBottomDown: ImageVector? = null
