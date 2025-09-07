package com.chiksmedina.solar.linear.time

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
import com.chiksmedina.solar.linear.TimeGroup

val TimeGroup.WatchSquare: ImageVector
    get() {
        if (_watchSquare != null) {
            return _watchSquare!!
        }
        _watchSquare = Builder(
            name = "WatchSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.7778f, 5.5f)
                lineTo(16.6961f, 5.1323f)
                curveTo(16.3624f, 3.6307f, 16.1955f, 2.8798f, 15.6471f, 2.4399f)
                curveTo(15.0987f, 2.0f, 14.3296f, 2.0f, 12.7913f, 2.0f)
                horizontalLineTo(11.2087f)
                curveTo(9.6704f, 2.0f, 8.9013f, 2.0f, 8.3529f, 2.4399f)
                curveTo(7.8045f, 2.8798f, 7.6376f, 3.6307f, 7.3039f, 5.1323f)
                lineTo(7.2222f, 5.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.7777f, 5.5f)
                lineTo(16.696f, 5.1323f)
                curveTo(16.3623f, 3.6307f, 16.1955f, 2.8798f, 15.6471f, 2.4399f)
                curveTo(15.0987f, 2.0f, 14.3295f, 2.0f, 12.7913f, 2.0f)
                horizontalLineTo(11.2086f)
                curveTo(9.6704f, 2.0f, 8.9012f, 2.0f, 8.3528f, 2.4399f)
                curveTo(7.8044f, 2.8798f, 7.6376f, 3.6307f, 7.3039f, 5.1323f)
                lineTo(7.2222f, 5.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.7778f, 18.5f)
                lineTo(16.6961f, 18.8677f)
                curveTo(16.3624f, 20.3693f, 16.1956f, 21.1202f, 15.6472f, 21.5601f)
                curveTo(15.0988f, 22.0f, 14.3296f, 22.0f, 12.7914f, 22.0f)
                horizontalLineTo(11.2088f)
                curveTo(9.6705f, 22.0f, 8.9014f, 22.0f, 8.353f, 21.5601f)
                curveTo(7.8046f, 21.1202f, 7.6377f, 20.3694f, 7.304f, 18.8677f)
                lineTo(7.2223f, 18.5f)
            }
        }
            .build()
        return _watchSquare!!
    }

private var _watchSquare: ImageVector? = null
