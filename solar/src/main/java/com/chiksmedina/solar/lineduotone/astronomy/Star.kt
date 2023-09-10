package com.chiksmedina.solar.lineduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.AstronomyGroup

val AstronomyGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                verticalLineTo(17.6f)
                moveTo(12.0f, 6.4f)
                verticalLineTo(4.0f)
                moveTo(20.0f, 12.0f)
                horizontalLineTo(17.6f)
                moveTo(6.4f, 12.0f)
                horizontalLineTo(4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.6569f, 6.3428f)
                lineTo(15.9599f, 8.0398f)
                moveTo(8.0403f, 15.9594f)
                lineTo(6.3432f, 17.6565f)
                moveTo(6.343f, 6.3429f)
                lineTo(8.0401f, 8.04f)
                moveTo(15.9597f, 15.9596f)
                lineTo(17.6567f, 17.6567f)
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
