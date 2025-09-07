package com.chiksmedina.solar.broken.time

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
import com.chiksmedina.solar.broken.TimeGroup

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
                moveTo(16.7777f, 18.5f)
                lineTo(16.696f, 18.8677f)
                curveTo(16.3623f, 20.3693f, 16.1955f, 21.1202f, 15.6471f, 21.5601f)
                curveTo(15.0987f, 22.0f, 14.3295f, 22.0f, 12.7913f, 22.0f)
                horizontalLineTo(11.2086f)
                curveTo(9.6704f, 22.0f, 8.9012f, 22.0f, 8.3528f, 21.5601f)
                curveTo(7.8044f, 21.1202f, 7.6376f, 20.3694f, 7.3039f, 18.8677f)
                lineTo(7.2222f, 18.5f)
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
        return _watchSquare!!
    }

private var _watchSquare: ImageVector? = null
