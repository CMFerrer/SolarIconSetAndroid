package dev.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.SquareArrowRightUp: ImageVector
    get() {
        if (_squareArrowRightUp != null) {
            return _squareArrowRightUp!!
        }
        _squareArrowRightUp = Builder(
            name = "SquareArrowRightUp", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5785f, 9.1719f)
                curveTo(15.5785f, 8.7577f, 15.2427f, 8.4219f, 14.8285f, 8.4219f)
                lineTo(10.5858f, 8.4219f)
                curveTo(10.1716f, 8.4219f, 9.8358f, 8.7577f, 9.8358f, 9.1719f)
                curveTo(9.8358f, 9.5861f, 10.1716f, 9.9219f, 10.5858f, 9.9219f)
                horizontalLineTo(13.0178f)
                lineTo(8.6413f, 14.2984f)
                curveTo(8.3484f, 14.5913f, 8.3484f, 15.0662f, 8.6413f, 15.3591f)
                curveTo(8.9342f, 15.652f, 9.4091f, 15.652f, 9.702f, 15.3591f)
                lineTo(14.0785f, 10.9825f)
                lineTo(14.0785f, 13.4145f)
                curveTo(14.0785f, 13.8287f, 14.4143f, 14.1645f, 14.8285f, 14.1645f)
                curveTo(15.2427f, 14.1645f, 15.5785f, 13.8287f, 15.5785f, 13.4145f)
                lineTo(15.5785f, 9.1719f)
                close()
            }
        }
            .build()
        return _squareArrowRightUp!!
    }

private var _squareArrowRightUp: ImageVector? = null
