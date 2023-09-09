package com.chiksmedina.solar.broken.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ArrowsGroup

public val ArrowsGroup.ArrowRightUp: ImageVector
    get() {
        if (_arrowRightUp != null) {
            return _arrowRightUp!!
        }
        _arrowRightUp = Builder(name = "ArrowRightUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                lineTo(8.5f, 15.5f)
                moveTo(18.0f, 6.0f)
                horizontalLineTo(9.0f)
                moveTo(18.0f, 6.0f)
                verticalLineTo(15.0f)
                moveTo(18.0f, 6.0f)
                lineTo(11.5f, 12.5f)
            }
        }
        .build()
        return _arrowRightUp!!
    }

private var _arrowRightUp: ImageVector? = null
