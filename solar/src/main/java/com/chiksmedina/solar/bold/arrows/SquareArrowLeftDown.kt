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

public val ArrowsGroup.SquareArrowLeftDown: ImageVector
    get() {
        if (_squareArrowLeftDown != null) {
            return _squareArrowLeftDown!!
        }
        _squareArrowLeftDown = Builder(name = "SquareArrowLeftDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(9.1716f, 15.5784f)
                curveTo(8.7574f, 15.5784f, 8.4216f, 15.2426f, 8.4216f, 14.8284f)
                lineTo(8.4216f, 10.5858f)
                curveTo(8.4216f, 10.1716f, 8.7574f, 9.8358f, 9.1716f, 9.8358f)
                curveTo(9.5858f, 9.8358f, 9.9216f, 10.1716f, 9.9216f, 10.5858f)
                lineTo(9.9216f, 13.0178f)
                lineTo(14.2981f, 8.6412f)
                curveTo(14.591f, 8.3483f, 15.0659f, 8.3483f, 15.3588f, 8.6412f)
                curveTo(15.6517f, 8.9341f, 15.6517f, 9.409f, 15.3588f, 9.7019f)
                lineTo(10.9822f, 14.0784f)
                horizontalLineTo(13.4142f)
                curveTo(13.8284f, 14.0784f, 14.1642f, 14.4142f, 14.1642f, 14.8284f)
                curveTo(14.1642f, 15.2426f, 13.8284f, 15.5784f, 13.4142f, 15.5784f)
                lineTo(9.1716f, 15.5784f)
                close()
            }
        }
        .build()
        return _squareArrowLeftDown!!
    }

private var _squareArrowLeftDown: ImageVector? = null
