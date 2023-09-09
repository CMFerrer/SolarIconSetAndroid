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

public val ArrowsGroup.ArrowRightDown: ImageVector
    get() {
        if (_arrowRightDown != null) {
            return _arrowRightDown!!
        }
        _arrowRightDown = Builder(name = "ArrowRightDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                horizontalLineTo(9.0f)
                moveTo(18.0f, 18.0f)
                verticalLineTo(9.0f)
                moveTo(18.0f, 18.0f)
                lineTo(11.5f, 11.5f)
                moveTo(6.0f, 6.0f)
                lineTo(8.5f, 8.5f)
            }
        }
        .build()
        return _arrowRightDown!!
    }

private var _arrowRightDown: ImageVector? = null
