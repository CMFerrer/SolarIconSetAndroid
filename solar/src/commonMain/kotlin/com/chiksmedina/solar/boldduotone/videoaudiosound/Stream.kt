package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 11.5f)
                curveTo(2.0f, 8.2125f, 2.0f, 6.5688f, 2.908f, 5.4624f)
                curveTo(3.0742f, 5.2599f, 3.2599f, 5.0742f, 3.4624f, 4.908f)
                curveTo(4.5688f, 4.0f, 6.2125f, 4.0f, 9.5f, 4.0f)
                curveTo(12.7875f, 4.0f, 14.4312f, 4.0f, 15.5376f, 4.908f)
                curveTo(15.7401f, 5.0742f, 15.9258f, 5.2599f, 16.092f, 5.4624f)
                curveTo(17.0f, 6.5688f, 17.0f, 8.2125f, 17.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(17.0f, 15.7875f, 17.0f, 17.4312f, 16.092f, 18.5376f)
                curveTo(15.9258f, 18.7401f, 15.7401f, 18.9258f, 15.5376f, 19.092f)
                curveTo(14.4312f, 20.0f, 12.7875f, 20.0f, 9.5f, 20.0f)
                curveTo(6.2125f, 20.0f, 4.5688f, 20.0f, 3.4624f, 19.092f)
                curveTo(3.2599f, 18.9258f, 3.0742f, 18.7401f, 2.908f, 18.5376f)
                curveTo(2.0f, 17.4312f, 2.0f, 15.7875f, 2.0f, 12.5f)
                verticalLineTo(11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 9.5002f)
                lineTo(17.6584f, 9.171f)
                curveTo(19.6042f, 8.1981f, 20.5772f, 7.7116f, 21.2886f, 8.1513f)
                curveTo(22.0f, 8.5909f, 22.0f, 9.6787f, 22.0f, 11.8543f)
                verticalLineTo(12.1461f)
                curveTo(22.0f, 14.3217f, 22.0f, 15.4094f, 21.2886f, 15.8491f)
                curveTo(20.5772f, 16.2888f, 19.6042f, 15.8023f, 17.6584f, 14.8294f)
                lineTo(17.0f, 14.5002f)
                verticalLineTo(9.5002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5f, 7.75f)
                curveTo(9.7226f, 7.75f, 9.9337f, 7.8489f, 10.0762f, 8.0199f)
                lineTo(12.5762f, 11.0199f)
                curveTo(12.8414f, 11.3381f, 12.7984f, 11.811f, 12.4802f, 12.0762f)
                curveTo(12.1619f, 12.3413f, 11.689f, 12.2983f, 11.4239f, 11.9801f)
                lineTo(10.25f, 10.5715f)
                verticalLineTo(15.5f)
                curveTo(10.25f, 15.9142f, 9.9142f, 16.25f, 9.5f, 16.25f)
                curveTo(9.0858f, 16.25f, 8.75f, 15.9142f, 8.75f, 15.5f)
                verticalLineTo(10.5715f)
                lineTo(7.5762f, 11.9801f)
                curveTo(7.311f, 12.2983f, 6.8381f, 12.3413f, 6.5199f, 12.0762f)
                curveTo(6.2017f, 11.811f, 6.1587f, 11.3381f, 6.4239f, 11.0199f)
                lineTo(8.9239f, 8.0199f)
                curveTo(9.0663f, 7.8489f, 9.2774f, 7.75f, 9.5f, 7.75f)
                close()
            }
        }
            .build()
        return _stream!!
    }

private var _stream: ImageVector? = null
