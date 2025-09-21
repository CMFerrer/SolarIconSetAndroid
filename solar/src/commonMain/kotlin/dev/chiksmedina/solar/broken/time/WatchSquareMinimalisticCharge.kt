package dev.chiksmedina.solar.broken.time

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
import dev.chiksmedina.solar.broken.TimeGroup

val TimeGroup.WatchSquareMinimalisticCharge: ImageVector
    get() {
        if (_watchSquareMinimalisticCharge != null) {
            return _watchSquareMinimalisticCharge!!
        }
        _watchSquareMinimalisticCharge = Builder(
            name = "WatchSquareMinimalisticCharge",
            defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.8571f, 9.0f)
                lineTo(10.0f, 12.0f)
                horizontalLineTo(14.0f)
                lineTo(11.1429f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 22.0f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.9614f, 9.2f)
                curveTo(18.8849f, 7.6646f, 18.6565f, 6.7067f, 17.9749f, 6.0251f)
                curveTo(16.9497f, 5.0f, 15.2998f, 5.0f, 12.0f, 5.0f)
                curveTo(8.7002f, 5.0f, 7.0503f, 5.0f, 6.0251f, 6.0251f)
                curveTo(5.0f, 7.0503f, 5.0f, 8.7002f, 5.0f, 12.0f)
                curveTo(5.0f, 15.2998f, 5.0f, 16.9497f, 6.0251f, 17.9749f)
                curveTo(7.0503f, 19.0f, 8.7002f, 19.0f, 12.0f, 19.0f)
                curveTo(15.2998f, 19.0f, 16.9497f, 19.0f, 17.9749f, 17.9749f)
                curveTo(18.7678f, 17.1819f, 18.9474f, 16.0151f, 18.9881f, 14.0f)
            }
        }
            .build()
        return _watchSquareMinimalisticCharge!!
    }

private var _watchSquareMinimalisticCharge: ImageVector? = null
