package com.chiksmedina.solar.broken.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ArrowsActionGroup

public val ArrowsActionGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 12.0f)
                lineTo(14.5f, 7.0f)
                moveTo(19.5f, 12.0f)
                lineTo(14.5f, 17.0f)
                moveTo(19.5f, 12.0f)
                lineTo(13.0f, 12.0f)
                moveTo(9.5f, 12.0f)
                curveTo(7.8333f, 12.0f, 4.5f, 13.0f, 4.5f, 17.0f)
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null