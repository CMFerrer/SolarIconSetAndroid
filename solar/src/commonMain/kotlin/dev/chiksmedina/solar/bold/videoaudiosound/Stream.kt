package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.Stream: ImageVector
    get() {
        if (_stream != null) {
            return _stream!!
        }
        _stream = Builder(
            name = "Stream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.5f)
                verticalLineTo(11.5f)
                curveTo(2.0f, 8.2125f, 2.0f, 6.5688f, 2.908f, 5.4624f)
                curveTo(3.0742f, 5.2599f, 3.2599f, 5.0742f, 3.4624f, 4.908f)
                curveTo(4.5688f, 4.0f, 6.2125f, 4.0f, 9.5f, 4.0f)
                curveTo(12.7875f, 4.0f, 14.4312f, 4.0f, 15.5376f, 4.908f)
                curveTo(15.7401f, 5.0742f, 15.9258f, 5.2599f, 16.092f, 5.4624f)
                curveTo(16.7936f, 6.3173f, 16.9531f, 7.493f, 16.9893f, 9.5f)
                lineTo(17.6584f, 9.1708f)
                curveTo(19.6042f, 8.1979f, 20.5772f, 7.7114f, 21.2886f, 8.1511f)
                curveTo(22.0f, 8.5907f, 22.0f, 9.6785f, 22.0f, 11.8541f)
                verticalLineTo(12.1459f)
                curveTo(22.0f, 14.3215f, 22.0f, 15.4093f, 21.2886f, 15.8489f)
                curveTo(20.5772f, 16.2886f, 19.6042f, 15.8021f, 17.6584f, 14.8292f)
                lineTo(16.9893f, 14.5f)
                curveTo(16.9531f, 16.507f, 16.7936f, 17.6827f, 16.092f, 18.5376f)
                curveTo(15.9258f, 18.7401f, 15.7401f, 18.9258f, 15.5376f, 19.092f)
                curveTo(14.4312f, 20.0f, 12.7875f, 20.0f, 9.5f, 20.0f)
                curveTo(6.2125f, 20.0f, 4.5688f, 20.0f, 3.4624f, 19.092f)
                curveTo(3.2599f, 18.9258f, 3.0742f, 18.7401f, 2.908f, 18.5376f)
                curveTo(2.0f, 17.4312f, 2.0f, 15.7875f, 2.0f, 12.5f)
                close()
                moveTo(10.0762f, 8.0199f)
                curveTo(9.9337f, 7.8489f, 9.7226f, 7.75f, 9.5f, 7.75f)
                curveTo(9.2774f, 7.75f, 9.0663f, 7.8489f, 8.9239f, 8.0199f)
                lineTo(6.4239f, 11.0199f)
                curveTo(6.1587f, 11.3381f, 6.2017f, 11.811f, 6.5199f, 12.0762f)
                curveTo(6.8381f, 12.3413f, 7.311f, 12.2983f, 7.5762f, 11.9801f)
                lineTo(8.75f, 10.5715f)
                verticalLineTo(15.5f)
                curveTo(8.75f, 15.9142f, 9.0858f, 16.25f, 9.5f, 16.25f)
                curveTo(9.9142f, 16.25f, 10.25f, 15.9142f, 10.25f, 15.5f)
                verticalLineTo(10.5715f)
                lineTo(11.4239f, 11.9801f)
                curveTo(11.689f, 12.2983f, 12.1619f, 12.3413f, 12.4802f, 12.0762f)
                curveTo(12.7984f, 11.811f, 12.8414f, 11.3381f, 12.5762f, 11.0199f)
                lineTo(10.0762f, 8.0199f)
                close()
            }
        }
            .build()
        return _stream!!
    }

private var _stream: ImageVector? = null
