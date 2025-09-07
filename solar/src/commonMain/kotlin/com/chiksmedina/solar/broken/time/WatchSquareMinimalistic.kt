package com.chiksmedina.solar.broken.time

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
import com.chiksmedina.solar.broken.TimeGroup

val TimeGroup.WatchSquareMinimalistic: ImageVector
    get() {
        if (_watchSquareMinimalistic != null) {
            return _watchSquareMinimalistic!!
        }
        _watchSquareMinimalistic = Builder(
            name = "WatchSquareMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(12.0769f)
                lineTo(14.0f, 14.0f)
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
        return _watchSquareMinimalistic!!
    }

private var _watchSquareMinimalistic: ImageVector? = null
