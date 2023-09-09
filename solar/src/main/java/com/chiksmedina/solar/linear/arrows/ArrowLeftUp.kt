package com.chiksmedina.solar.linear.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ArrowsGroup

public val ArrowsGroup.ArrowLeftUp: ImageVector
    get() {
        if (_arrowLeftUp != null) {
            return _arrowLeftUp!!
        }
        _arrowLeftUp = Builder(name = "ArrowLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                lineTo(6.0f, 6.0f)
                moveTo(6.0f, 6.0f)
                horizontalLineTo(15.0f)
                moveTo(6.0f, 6.0f)
                verticalLineTo(15.0f)
            }
        }
        .build()
        return _arrowLeftUp!!
    }

private var _arrowLeftUp: ImageVector? = null
