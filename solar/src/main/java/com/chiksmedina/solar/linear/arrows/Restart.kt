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

public val ArrowsGroup.Restart: ImageVector
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = Builder(name = "Restart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.364f, 8.0503f)
                lineTo(17.6569f, 7.3432f)
                curveTo(14.5327f, 4.219f, 9.4673f, 4.219f, 6.3432f, 7.3432f)
                curveTo(3.219f, 10.4673f, 3.219f, 15.5327f, 6.3432f, 18.6569f)
                curveTo(9.4673f, 21.7811f, 14.5327f, 21.7811f, 17.6569f, 18.6569f)
                curveTo(19.4737f, 16.84f, 20.234f, 14.3668f, 19.9377f, 12.0005f)
                moveTo(18.364f, 8.0503f)
                horizontalLineTo(14.1213f)
                moveTo(18.364f, 8.0503f)
                verticalLineTo(3.8076f)
            }
        }
        .build()
        return _restart!!
    }

private var _restart: ImageVector? = null
