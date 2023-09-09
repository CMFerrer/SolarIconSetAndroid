package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.ArrowsGroup

public val ArrowsGroup.SquareArrowRightDown: ImageVector
    get() {
        if (_squareArrowRightDown != null) {
            return _squareArrowRightDown!!
        }
        _squareArrowRightDown = Builder(name = "SquareArrowRightDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5785f, 14.8278f)
                curveTo(15.5785f, 15.242f, 15.2427f, 15.5778f, 14.8285f, 15.5778f)
                lineTo(10.5858f, 15.5778f)
                curveTo(10.1716f, 15.5778f, 9.8358f, 15.242f, 9.8358f, 14.8278f)
                curveTo(9.8358f, 14.4135f, 10.1716f, 14.0778f, 10.5858f, 14.0778f)
                horizontalLineTo(13.0178f)
                lineTo(8.6413f, 9.7012f)
                curveTo(8.3484f, 9.4083f, 8.3484f, 8.9335f, 8.6413f, 8.6406f)
                curveTo(8.9342f, 8.3477f, 9.4091f, 8.3477f, 9.702f, 8.6406f)
                lineTo(14.0785f, 13.0171f)
                lineTo(14.0785f, 10.5851f)
                curveTo(14.0785f, 10.1709f, 14.4143f, 9.8351f, 14.8285f, 9.8351f)
                curveTo(15.2427f, 9.8351f, 15.5785f, 10.1709f, 15.5785f, 10.5851f)
                lineTo(15.5785f, 14.8278f)
                close()
            }
        }
        .build()
        return _squareArrowRightDown!!
    }

private var _squareArrowRightDown: ImageVector? = null
