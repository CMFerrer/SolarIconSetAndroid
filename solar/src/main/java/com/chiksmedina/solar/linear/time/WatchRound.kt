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

val TimeGroup.WatchRound: ImageVector
    get() {
        if (_watchRound != null) {
            return _watchRound!!
        }
        _watchRound = Builder(
            name = "WatchRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 6.5f)
                lineTo(16.6961f, 5.1323f)
                curveTo(16.3624f, 3.6307f, 16.1955f, 2.8798f, 15.6471f, 2.4399f)
                curveTo(15.0987f, 2.0f, 14.3296f, 2.0f, 12.7913f, 2.0f)
                horizontalLineTo(11.2087f)
                curveTo(9.6704f, 2.0f, 8.9013f, 2.0f, 8.3529f, 2.4399f)
                curveTo(7.8045f, 2.8798f, 7.6376f, 3.6307f, 7.3039f, 5.1323f)
                lineTo(7.0f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 17.5f)
                lineTo(16.6961f, 18.8677f)
                curveTo(16.3624f, 20.3694f, 16.1955f, 21.1202f, 15.6471f, 21.5601f)
                curveTo(15.0987f, 22.0f, 14.3296f, 22.0f, 12.7913f, 22.0f)
                horizontalLineTo(11.2087f)
                curveTo(9.6704f, 22.0f, 8.9013f, 22.0f, 8.3529f, 21.5601f)
                curveTo(7.8045f, 21.1202f, 7.6376f, 20.3694f, 7.3039f, 18.8677f)
                lineTo(7.0f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 12.0f)
                curveTo(19.5f, 16.1421f, 16.1421f, 19.5f, 12.0f, 19.5f)
                curveTo(7.8579f, 19.5f, 4.5f, 16.1421f, 4.5f, 12.0f)
                curveTo(4.5f, 7.8579f, 7.8579f, 4.5f, 12.0f, 4.5f)
                curveTo(16.1421f, 4.5f, 19.5f, 7.8579f, 19.5f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.9231f)
                verticalLineTo(12.0f)
                lineTo(14.0f, 13.9231f)
            }
        }
            .build()
        return _watchRound!!
    }

private var _watchRound: ImageVector? = null
