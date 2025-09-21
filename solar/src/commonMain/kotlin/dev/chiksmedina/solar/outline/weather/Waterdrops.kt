package dev.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.Waterdrops: ImageVector
    get() {
        if (_waterdrops != null) {
            return _waterdrops!!
        }
        _waterdrops = Builder(
            name = "Waterdrops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.7174f, 3.7506f)
                curveTo(12.3192f, 3.3305f, 11.6808f, 3.3305f, 11.2826f, 3.7506f)
                curveTo(10.7109f, 4.3538f, 10.0594f, 5.1076f, 9.5554f, 5.8711f)
                curveTo(9.0328f, 6.6627f, 8.75f, 7.3457f, 8.75f, 7.8332f)
                curveTo(8.75f, 9.7493f, 10.2336f, 11.2499f, 12.0f, 11.2499f)
                curveTo(13.7664f, 11.2499f, 15.25f, 9.7493f, 15.25f, 7.8332f)
                curveTo(15.25f, 7.3457f, 14.9672f, 6.6627f, 14.4446f, 5.8711f)
                curveTo(13.9406f, 5.1076f, 13.2891f, 4.3538f, 12.7174f, 3.7506f)
                close()
                moveTo(10.1939f, 2.7188f)
                curveTo(11.1837f, 1.6745f, 12.8163f, 1.6745f, 13.8061f, 2.7188f)
                curveTo(14.4068f, 3.3526f, 15.1243f, 4.1781f, 15.6964f, 5.0447f)
                curveTo(16.2499f, 5.8831f, 16.75f, 6.8809f, 16.75f, 7.8332f)
                curveTo(16.75f, 10.5194f, 14.6519f, 12.7499f, 12.0f, 12.7499f)
                curveTo(9.3481f, 12.7499f, 7.25f, 10.5194f, 7.25f, 7.8332f)
                curveTo(7.25f, 6.8809f, 7.7501f, 5.8831f, 8.3036f, 5.0447f)
                curveTo(8.8757f, 4.1781f, 9.5932f, 3.3526f, 10.1939f, 2.7188f)
                close()
                moveTo(6.7174f, 13.7507f)
                curveTo(6.3192f, 13.3305f, 5.6808f, 13.3305f, 5.2826f, 13.7507f)
                curveTo(4.7109f, 14.3538f, 4.0594f, 15.1076f, 3.5554f, 15.8711f)
                curveTo(3.0328f, 16.6627f, 2.75f, 17.3457f, 2.75f, 17.8332f)
                curveTo(2.75f, 19.7493f, 4.2336f, 21.2499f, 6.0f, 21.2499f)
                curveTo(7.7664f, 21.2499f, 9.25f, 19.7493f, 9.25f, 17.8332f)
                curveTo(9.25f, 17.3457f, 8.9672f, 16.6627f, 8.4446f, 15.8711f)
                curveTo(7.9406f, 15.1076f, 7.2891f, 14.3538f, 6.7174f, 13.7507f)
                close()
                moveTo(4.1939f, 12.7188f)
                curveTo(5.1837f, 11.6745f, 6.8163f, 11.6745f, 7.8061f, 12.7188f)
                curveTo(8.4068f, 13.3526f, 9.1243f, 14.1781f, 9.6964f, 15.0447f)
                curveTo(10.2499f, 15.8831f, 10.75f, 16.8809f, 10.75f, 17.8332f)
                curveTo(10.75f, 20.5194f, 8.6519f, 22.7499f, 6.0f, 22.7499f)
                curveTo(3.3481f, 22.7499f, 1.25f, 20.5194f, 1.25f, 17.8332f)
                curveTo(1.25f, 16.8809f, 1.7501f, 15.8831f, 2.3036f, 15.0447f)
                curveTo(2.8757f, 14.1781f, 3.5932f, 13.3526f, 4.1939f, 12.7188f)
                close()
                moveTo(18.7174f, 13.7507f)
                curveTo(18.3192f, 13.3305f, 17.6808f, 13.3305f, 17.2826f, 13.7507f)
                curveTo(16.7109f, 14.3538f, 16.0594f, 15.1076f, 15.5554f, 15.8711f)
                curveTo(15.0328f, 16.6627f, 14.75f, 17.3457f, 14.75f, 17.8332f)
                curveTo(14.75f, 19.7493f, 16.2336f, 21.2499f, 18.0f, 21.2499f)
                curveTo(19.7664f, 21.2499f, 21.25f, 19.7493f, 21.25f, 17.8332f)
                curveTo(21.25f, 17.3457f, 20.9672f, 16.6627f, 20.4446f, 15.8711f)
                curveTo(19.9406f, 15.1076f, 19.2891f, 14.3538f, 18.7174f, 13.7507f)
                close()
                moveTo(16.1939f, 12.7188f)
                curveTo(17.1837f, 11.6745f, 18.8163f, 11.6745f, 19.8061f, 12.7188f)
                curveTo(20.4068f, 13.3526f, 21.1243f, 14.1781f, 21.6964f, 15.0447f)
                curveTo(22.2499f, 15.8831f, 22.75f, 16.8809f, 22.75f, 17.8332f)
                curveTo(22.75f, 20.5194f, 20.6519f, 22.7499f, 18.0f, 22.7499f)
                curveTo(15.3481f, 22.7499f, 13.25f, 20.5194f, 13.25f, 17.8332f)
                curveTo(13.25f, 16.8809f, 13.7501f, 15.8831f, 14.3036f, 15.0447f)
                curveTo(14.8757f, 14.1781f, 15.5932f, 13.3526f, 16.1939f, 12.7188f)
                close()
            }
        }
            .build()
        return _waterdrops!!
    }

private var _waterdrops: ImageVector? = null
