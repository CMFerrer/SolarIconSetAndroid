package com.chiksmedina.solar.lineduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ArrowsGroup

val ArrowsGroup.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(
            name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 11.25f)
                curveTo(3.5858f, 11.25f, 3.25f, 11.5858f, 3.25f, 12.0f)
                curveTo(3.25f, 12.4142f, 3.5858f, 12.75f, 4.0f, 12.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(4.0f, 12.75f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 6.0f)
                lineTo(20.0f, 12.0f)
                lineTo(14.0f, 18.0f)
            }
        }
            .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
