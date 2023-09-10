package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.SquareArrowLeftDown: ImageVector
    get() {
        if (_squareArrowLeftDown != null) {
            return _squareArrowLeftDown!!
        }
        _squareArrowLeftDown = Builder(
            name = "SquareArrowLeftDown", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.4214f, 14.8278f)
                curveTo(8.4214f, 15.242f, 8.7572f, 15.5778f, 9.1714f, 15.5778f)
                lineTo(13.414f, 15.5778f)
                curveTo(13.8282f, 15.5778f, 14.164f, 15.242f, 14.164f, 14.8278f)
                curveTo(14.164f, 14.4135f, 13.8282f, 14.0778f, 13.414f, 14.0778f)
                horizontalLineTo(10.982f)
                lineTo(15.3586f, 9.7012f)
                curveTo(15.6515f, 9.4083f, 15.6515f, 8.9335f, 15.3586f, 8.6406f)
                curveTo(15.0657f, 8.3477f, 14.5908f, 8.3477f, 14.2979f, 8.6406f)
                lineTo(9.9214f, 13.0171f)
                lineTo(9.9214f, 10.5851f)
                curveTo(9.9214f, 10.1709f, 9.5856f, 9.8351f, 9.1714f, 9.8351f)
                curveTo(8.7572f, 9.8351f, 8.4214f, 10.1709f, 8.4214f, 10.5851f)
                lineTo(8.4214f, 14.8278f)
                close()
            }
        }
            .build()
        return _squareArrowLeftDown!!
    }

private var _squareArrowLeftDown: ImageVector? = null
