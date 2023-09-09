package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

public val ArrowsGroup.SquareArrowRightDown: ImageVector
    get() {
        if (_squareArrowRightDown != null) {
            return _squareArrowRightDown!!
        }
        _squareArrowRightDown = Builder(name = "SquareArrowRightDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                close()
                moveTo(14.8284f, 15.5784f)
                curveTo(15.2426f, 15.5784f, 15.5784f, 15.2426f, 15.5784f, 14.8284f)
                lineTo(15.5784f, 10.5858f)
                curveTo(15.5784f, 10.1716f, 15.2426f, 9.8358f, 14.8284f, 9.8358f)
                curveTo(14.4142f, 9.8358f, 14.0784f, 10.1716f, 14.0784f, 10.5858f)
                lineTo(14.0784f, 13.0178f)
                lineTo(9.7019f, 8.6412f)
                curveTo(9.409f, 8.3483f, 8.9341f, 8.3483f, 8.6412f, 8.6412f)
                curveTo(8.3483f, 8.9341f, 8.3483f, 9.409f, 8.6412f, 9.7019f)
                lineTo(13.0178f, 14.0784f)
                horizontalLineTo(10.5858f)
                curveTo(10.1716f, 14.0784f, 9.8358f, 14.4142f, 9.8358f, 14.8284f)
                curveTo(9.8358f, 15.2426f, 10.1716f, 15.5784f, 10.5858f, 15.5784f)
                lineTo(14.8284f, 15.5784f)
                close()
            }
        }
        .build()
        return _squareArrowRightDown!!
    }

private var _squareArrowRightDown: ImageVector? = null
