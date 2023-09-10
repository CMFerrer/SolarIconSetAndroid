package com.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.MinimizeSquare3: ImageVector
    get() {
        if (_minimizeSquare3 != null) {
            return _minimizeSquare3!!
        }
        _minimizeSquare3 = Builder(
            name = "MinimizeSquare3", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 12.4142f, 16.1642f, 12.75f, 15.75f, 12.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 12.75f, 11.25f, 12.4142f, 11.25f, 12.0f)
                verticalLineTo(8.25f)
                curveTo(11.25f, 7.8358f, 11.5858f, 7.5f, 12.0f, 7.5f)
                curveTo(12.4142f, 7.5f, 12.75f, 7.8358f, 12.75f, 8.25f)
                verticalLineTo(10.1893f)
                lineTo(16.4697f, 6.4697f)
                curveTo(16.7626f, 6.1768f, 17.2374f, 6.1768f, 17.5303f, 6.4697f)
                curveTo(17.8232f, 6.7626f, 17.8232f, 7.2374f, 17.5303f, 7.5303f)
                lineTo(13.8107f, 11.25f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 11.25f, 16.5f, 11.5858f, 16.5f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 17.5f)
                curveTo(2.0f, 15.3787f, 2.0f, 14.318f, 2.659f, 13.659f)
                curveTo(3.318f, 13.0f, 4.3787f, 13.0f, 6.5f, 13.0f)
                curveTo(8.6213f, 13.0f, 9.682f, 13.0f, 10.341f, 13.659f)
                curveTo(11.0f, 14.318f, 11.0f, 15.3787f, 11.0f, 17.5f)
                curveTo(11.0f, 19.6213f, 11.0f, 20.682f, 10.341f, 21.341f)
                curveTo(9.682f, 22.0f, 8.6213f, 22.0f, 6.5f, 22.0f)
                curveTo(4.3787f, 22.0f, 3.318f, 22.0f, 2.659f, 21.341f)
                curveTo(2.0f, 20.682f, 2.0f, 19.6213f, 2.0f, 17.5f)
                close()
            }
        }
            .build()
        return _minimizeSquare3!!
    }

private var _minimizeSquare3: ImageVector? = null
