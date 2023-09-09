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

public val ArrowsActionGroup.ArrowToTopRight: ImageVector
    get() {
        if (_arrowToTopRight != null) {
            return _arrowToTopRight!!
        }
        _arrowToTopRight = Builder(name = "ArrowToTopRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                lineTo(7.0f, 9.5f)
                moveTo(12.0f, 4.5f)
                lineTo(17.0f, 9.5f)
                moveTo(12.0f, 4.5f)
                lineTo(12.0f, 11.0f)
                moveTo(12.0f, 14.5f)
                curveTo(12.0f, 16.1667f, 13.0f, 19.5f, 17.0f, 19.5f)
            }
        }
        .build()
        return _arrowToTopRight!!
    }

private var _arrowToTopRight: ImageVector? = null
