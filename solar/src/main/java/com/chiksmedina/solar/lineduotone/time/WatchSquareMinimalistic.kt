package com.chiksmedina.solar.lineduotone.time

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
import com.chiksmedina.solar.lineduotone.TimeGroup

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
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 9.1911f, 5.0f, 7.7866f, 5.6741f, 6.7777f)
                curveTo(5.966f, 6.341f, 6.341f, 5.966f, 6.7777f, 5.6741f)
                curveTo(7.7866f, 5.0f, 9.1911f, 5.0f, 12.0f, 5.0f)
                curveTo(14.8089f, 5.0f, 16.2134f, 5.0f, 17.2223f, 5.6741f)
                curveTo(17.659f, 5.966f, 18.034f, 6.341f, 18.3259f, 6.7777f)
                curveTo(19.0f, 7.7866f, 19.0f, 9.1911f, 19.0f, 12.0f)
                curveTo(19.0f, 14.8089f, 19.0f, 16.2134f, 18.3259f, 17.2223f)
                curveTo(18.034f, 17.659f, 17.659f, 18.034f, 17.2223f, 18.3259f)
                curveTo(16.2134f, 19.0f, 14.8089f, 19.0f, 12.0f, 19.0f)
                curveTo(9.1911f, 19.0f, 7.7866f, 19.0f, 6.7777f, 18.3259f)
                curveTo(6.341f, 18.034f, 5.966f, 17.659f, 5.6741f, 17.2223f)
                curveTo(5.0f, 16.2134f, 5.0f, 14.8089f, 5.0f, 12.0f)
                close()
            }
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
        }
            .build()
        return _watchSquareMinimalistic!!
    }

private var _watchSquareMinimalistic: ImageVector? = null
