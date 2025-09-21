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

val TimeGroup.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(
            name = "Alarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(16.8362f, 22.0f, 20.7567f, 18.1162f, 20.7567f, 13.3253f)
                curveTo(20.7567f, 8.5345f, 16.8362f, 4.6507f, 12.0f, 4.6507f)
                curveTo(7.1638f, 4.6507f, 3.2433f, 8.5345f, 3.2433f, 13.3253f)
                curveTo(3.2433f, 18.1162f, 7.1638f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 8.7471f)
                curveTo(12.403f, 8.7471f, 12.7297f, 9.0707f, 12.7297f, 9.4699f)
                verticalLineTo(13.0259f)
                lineTo(14.9484f, 15.2238f)
                curveTo(15.2334f, 15.5061f, 15.2334f, 15.9638f, 14.9484f, 16.2461f)
                curveTo(14.6634f, 16.5284f, 14.2014f, 16.5284f, 13.9164f, 16.2461f)
                lineTo(11.484f, 13.8365f)
                curveTo(11.3472f, 13.7009f, 11.2703f, 13.5171f, 11.2703f, 13.3253f)
                verticalLineTo(9.4699f)
                curveTo(11.2703f, 9.0707f, 11.597f, 8.7471f, 12.0f, 8.7471f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2405f, 2.3399f)
                curveTo(8.4541f, 2.6784f, 8.3502f, 3.1244f, 8.0084f, 3.336f)
                lineTo(4.1166f, 5.7456f)
                curveTo(3.7748f, 5.9572f, 3.3246f, 5.8543f, 3.111f, 5.5157f)
                curveTo(2.8974f, 5.1772f, 3.0013f, 4.7312f, 3.3431f, 4.5196f)
                lineTo(7.2349f, 2.11f)
                curveTo(7.5767f, 1.8984f, 8.0269f, 2.0013f, 8.2405f, 2.3399f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.7595f, 2.3398f)
                curveTo(15.9731f, 2.0013f, 16.4233f, 1.8984f, 16.7651f, 2.11f)
                lineTo(20.6569f, 4.5196f)
                curveTo(20.9987f, 4.7312f, 21.1026f, 5.1772f, 20.889f, 5.5157f)
                curveTo(20.6754f, 5.8543f, 20.2252f, 5.9572f, 19.8834f, 5.7456f)
                lineTo(15.9916f, 3.336f)
                curveTo(15.6498f, 3.1244f, 15.5459f, 2.6784f, 15.7595f, 2.3398f)
                close()
            }
        }
            .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
