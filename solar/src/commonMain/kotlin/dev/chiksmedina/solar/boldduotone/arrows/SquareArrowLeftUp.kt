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

val ArrowsGroup.SquareArrowLeftUp: ImageVector
    get() {
        if (_squareArrowLeftUp != null) {
            return _squareArrowLeftUp!!
        }
        _squareArrowLeftUp = Builder(
            name = "SquareArrowLeftUp", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.4216f, 9.1719f)
                curveTo(8.4216f, 8.7577f, 8.7574f, 8.4219f, 9.1716f, 8.4219f)
                lineTo(13.4143f, 8.4219f)
                curveTo(13.8285f, 8.4219f, 14.1643f, 8.7577f, 14.1643f, 9.1719f)
                curveTo(14.1643f, 9.5861f, 13.8285f, 9.9219f, 13.4143f, 9.9219f)
                horizontalLineTo(10.9823f)
                lineTo(15.3588f, 14.2984f)
                curveTo(15.6517f, 14.5913f, 15.6517f, 15.0662f, 15.3588f, 15.3591f)
                curveTo(15.0659f, 15.652f, 14.591f, 15.652f, 14.2982f, 15.3591f)
                lineTo(9.9216f, 10.9825f)
                lineTo(9.9216f, 13.4145f)
                curveTo(9.9216f, 13.8287f, 9.5858f, 14.1645f, 9.1716f, 14.1645f)
                curveTo(8.7574f, 14.1645f, 8.4216f, 13.8287f, 8.4216f, 13.4145f)
                lineTo(8.4216f, 9.1719f)
                close()
            }
        }
            .build()
        return _squareArrowLeftUp!!
    }

private var _squareArrowLeftUp: ImageVector? = null
