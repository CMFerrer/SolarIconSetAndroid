package dev.chiksmedina.solar.bold.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TimeGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.6741f, 6.7777f)
                curveTo(5.0f, 7.7866f, 5.0f, 9.1911f, 5.0f, 12.0f)
                curveTo(5.0f, 14.8089f, 5.0f, 16.2134f, 5.6741f, 17.2223f)
                curveTo(5.966f, 17.659f, 6.341f, 18.034f, 6.7777f, 18.3259f)
                curveTo(7.7866f, 19.0f, 9.1911f, 19.0f, 12.0f, 19.0f)
                curveTo(14.8089f, 19.0f, 16.2134f, 19.0f, 17.2223f, 18.3259f)
                curveTo(17.659f, 18.034f, 18.034f, 17.659f, 18.3259f, 17.2223f)
                curveTo(19.0f, 16.2134f, 19.0f, 14.8089f, 19.0f, 12.0f)
                curveTo(19.0f, 9.1911f, 19.0f, 7.7866f, 18.3259f, 6.7777f)
                curveTo(18.034f, 6.341f, 17.659f, 5.966f, 17.2223f, 5.6741f)
                curveTo(16.2134f, 5.0f, 14.8089f, 5.0f, 12.0f, 5.0f)
                curveTo(9.1911f, 5.0f, 7.7866f, 5.0f, 6.7777f, 5.6741f)
                curveTo(6.341f, 5.966f, 5.966f, 6.341f, 5.6741f, 6.7777f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(11.7576f)
                lineTo(14.5198f, 13.4594f)
                curveTo(14.8184f, 13.7465f, 14.8277f, 14.2212f, 14.5406f, 14.5198f)
                curveTo(14.2535f, 14.8184f, 13.7787f, 14.8277f, 13.4802f, 14.5406f)
                lineTo(11.4802f, 12.6175f)
                curveTo(11.3331f, 12.4761f, 11.25f, 12.2809f, 11.25f, 12.0769f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.25f, 2.0f)
                curveTo(6.25f, 1.5858f, 6.5858f, 1.25f, 7.0f, 1.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 1.25f, 17.75f, 1.5858f, 17.75f, 2.0f)
                curveTo(17.75f, 2.4142f, 17.4142f, 2.75f, 17.0f, 2.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 2.75f, 6.25f, 2.4142f, 6.25f, 2.0f)
                close()
                moveTo(6.25f, 22.0f)
                curveTo(6.25f, 21.5858f, 6.5858f, 21.25f, 7.0f, 21.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 21.25f, 17.75f, 21.5858f, 17.75f, 22.0f)
                curveTo(17.75f, 22.4142f, 17.4142f, 22.75f, 17.0f, 22.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 22.75f, 6.25f, 22.4142f, 6.25f, 22.0f)
                close()
            }
        }
            .build()
        return _watchSquareMinimalistic!!
    }

private var _watchSquareMinimalistic: ImageVector? = null
