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

val ArrowsActionGroup.UndoLeft: ImageVector
    get() {
        if (_undoLeft != null) {
            return _undoLeft!!
        }
        _undoLeft = Builder(
            name = "UndoLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 4.0f)
                lineTo(4.0f, 7.0f)
                lineTo(7.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(16.8692f, 7.0f, 17.8039f, 7.0f, 18.5f, 7.4019f)
                curveTo(18.9561f, 7.6652f, 19.3348f, 8.0439f, 19.5981f, 8.5f)
                curveTo(20.0f, 9.1961f, 20.0f, 10.1308f, 20.0f, 12.0f)
                curveTo(20.0f, 13.8692f, 20.0f, 14.8038f, 19.5981f, 15.5f)
                curveTo(19.3348f, 15.9561f, 18.9561f, 16.3348f, 18.5f, 16.5981f)
                curveTo(17.8039f, 17.0f, 16.8692f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(8.0f)
            }
        }
            .build()
        return _undoLeft!!
    }

private var _undoLeft: ImageVector? = null
