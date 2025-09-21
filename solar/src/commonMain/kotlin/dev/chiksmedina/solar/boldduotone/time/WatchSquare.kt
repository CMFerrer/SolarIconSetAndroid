package dev.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TimeGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.7915f, 2.0f)
                horizontalLineTo(11.2089f)
                curveTo(9.6706f, 2.0f, 8.9015f, 2.0f, 8.3531f, 2.4399f)
                curveTo(7.8046f, 2.8798f, 7.6378f, 3.6307f, 7.3041f, 5.1323f)
                lineTo(7.2394f, 5.4236f)
                curveTo(8.2185f, 5.0f, 9.5941f, 5.0f, 12.0001f, 5.0f)
                curveTo(14.4062f, 5.0f, 15.7818f, 5.0f, 16.761f, 5.4237f)
                lineTo(16.6962f, 5.1323f)
                curveTo(16.3625f, 3.6307f, 16.1957f, 2.8798f, 15.6473f, 2.4399f)
                curveTo(15.0989f, 2.0f, 14.3297f, 2.0f, 12.7915f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.2393f, 18.5763f)
                curveTo(8.2184f, 19.0f, 9.594f, 19.0f, 12.0001f, 19.0f)
                curveTo(14.4062f, 19.0f, 15.7817f, 19.0f, 16.7609f, 18.5763f)
                lineTo(16.6961f, 18.8677f)
                curveTo(16.3624f, 20.3693f, 16.1956f, 21.1202f, 15.6472f, 21.5601f)
                curveTo(15.0988f, 22.0f, 14.3297f, 22.0f, 12.7914f, 22.0f)
                horizontalLineTo(11.2088f)
                curveTo(9.6705f, 22.0f, 8.9014f, 22.0f, 8.353f, 21.5601f)
                curveTo(7.8046f, 21.1202f, 7.6377f, 20.3693f, 7.304f, 18.8677f)
                lineTo(7.2393f, 18.5763f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.7777f, 18.3259f)
                curveTo(7.7866f, 19.0f, 9.1911f, 19.0f, 12.0f, 19.0f)
                curveTo(14.8089f, 19.0f, 16.2134f, 19.0f, 17.2223f, 18.3259f)
                curveTo(17.659f, 18.034f, 18.034f, 17.659f, 18.3259f, 17.2223f)
                curveTo(19.0f, 16.2134f, 19.0f, 14.8089f, 19.0f, 12.0f)
                curveTo(19.0f, 9.1911f, 19.0f, 7.7866f, 18.3259f, 6.7777f)
                curveTo(18.034f, 6.341f, 17.659f, 5.966f, 17.2223f, 5.6741f)
                curveTo(16.2134f, 5.0f, 14.8089f, 5.0f, 12.0f, 5.0f)
                curveTo(9.1911f, 5.0f, 7.7866f, 5.0f, 6.7777f, 5.6741f)
                curveTo(6.341f, 5.966f, 5.966f, 6.341f, 5.6741f, 6.7777f)
                curveTo(5.0f, 7.7866f, 5.0f, 9.1911f, 5.0f, 12.0f)
                curveTo(5.0f, 14.8089f, 5.0f, 16.2134f, 5.6741f, 17.2223f)
                curveTo(5.966f, 17.659f, 6.341f, 18.034f, 6.7777f, 18.3259f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(11.7576f)
                lineTo(14.5198f, 13.4594f)
                curveTo(14.8184f, 13.7465f, 14.8277f, 14.2213f, 14.5406f, 14.5198f)
                curveTo(14.2535f, 14.8184f, 13.7787f, 14.8277f, 13.4802f, 14.5406f)
                lineTo(11.4802f, 12.6175f)
                curveTo(11.3331f, 12.4761f, 11.25f, 12.2809f, 11.25f, 12.0769f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
        }
            .build()
        return _watchSquare!!
    }

private var _watchSquare: ImageVector? = null
