package com.chiksmedina.solar.lineduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ArrowsActionGroup

val ArrowsActionGroup.SquareBottomUp: ImageVector
    get() {
        if (_squareBottomUp != null) {
            return _squareBottomUp!!
        }
        _squareBottomUp = Builder(
            name = "SquareBottomUp", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.9999f, 21.9994f)
                curveTo(17.055f, 21.9921f, 19.1784f, 21.8926f, 20.5354f, 20.5355f)
                curveTo(21.9999f, 19.0711f, 21.9999f, 16.714f, 21.9999f, 12.0f)
                curveTo(21.9999f, 7.286f, 21.9999f, 4.9289f, 20.5354f, 3.4645f)
                curveTo(19.071f, 2.0f, 16.714f, 2.0f, 11.9999f, 2.0f)
                curveTo(7.2859f, 2.0f, 4.9288f, 2.0f, 3.4644f, 3.4645f)
                curveTo(2.1073f, 4.8215f, 2.0078f, 6.9449f, 2.0005f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 21.0f)
                lineTo(11.0f, 13.0f)
                moveTo(11.0f, 13.0f)
                horizontalLineTo(5.0f)
                moveTo(11.0f, 13.0f)
                verticalLineTo(19.0f)
            }
        }
            .build()
        return _squareBottomUp!!
    }

private var _squareBottomUp: ImageVector? = null
